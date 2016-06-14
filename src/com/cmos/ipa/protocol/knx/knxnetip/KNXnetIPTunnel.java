/*
    Calimero 2 - A library for KNX network access
    Copyright (c) 2006, 2016 B. Malinowsky

    This program is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program; if not, write to the Free Software
    Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA

    Linking this library statically or dynamically with other modules is
    making a combined work based on this library. Thus, the terms and
    conditions of the GNU General Public License cover the whole
    combination.

    As a special exception, the copyright holders of this library give you
    permission to link this library with independent modules to produce an
    executable, regardless of the license terms of these independent
    modules, and to copy and distribute the resulting executable under terms
    of your choice, provided that you also meet, for each linked independent
    module, the terms and conditions of the license of that module. An
    independent module is a module which is not derived from or based on
    this library. If you modify this library, you may extend this exception
    to your version of the library, but you are not obligated to do so. If
    you do not wish to do so, delete this exception statement from your
    version.
*/

package com.cmos.ipa.protocol.knx.knxnetip;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.Arrays;

import com.cmos.ipa.protocol.knx.CloseEvent;
import com.cmos.ipa.protocol.knx.cemi.CEMI;
import com.cmos.ipa.protocol.knx.cemi.CEMIBusMon;
import com.cmos.ipa.protocol.knx.cemi.CEMILData;
import com.cmos.ipa.protocol.knx.exception.KNXException;
import com.cmos.ipa.protocol.knx.exception.KNXFormatException;
import com.cmos.ipa.protocol.knx.exception.KNXIllegalArgumentException;
import com.cmos.ipa.protocol.knx.exception.KNXIllegalStateException;
import com.cmos.ipa.protocol.knx.exception.KNXInvalidResponseException;
import com.cmos.ipa.protocol.knx.exception.KNXRemoteException;
import com.cmos.ipa.protocol.knx.exception.KNXTimeoutException;
import com.cmos.ipa.protocol.knx.knxnetip.servicetype.ErrorCodes;
import com.cmos.ipa.protocol.knx.knxnetip.servicetype.KNXnetIPHeader;
import com.cmos.ipa.protocol.knx.knxnetip.servicetype.PacketHelper;
import com.cmos.ipa.protocol.knx.knxnetip.servicetype.ServiceAck;
import com.cmos.ipa.protocol.knx.knxnetip.servicetype.ServiceRequest;
import com.cmos.ipa.protocol.knx.knxnetip.util.TunnelCRI;
import com.cmos.ipa.protocol.knx.log.LogLevel;

/**
 * KNXnet/IP connection for KNX tunneling.
 * <p>
 * The tunneling protocol specifies a point-to-point exchange of KNX frames over an IP
 * network connection between two KNXnet/IP devices - client and server.<br>
 * Up to now, only the client side is implemented.<br>
 * The communication on OSI layer 4 is done using UDP.<br>
 *
 * @author B. Malinowsky
 */
public class KNXnetIPTunnel extends ClientConnection
{
	/**
	 * Connection type used to tunnel between two KNXnet/IP devices (client / server).
	 */
	public static final int TUNNEL_CONNECTION = 0x04;

	/**
	 * Tunneling on busmonitor layer, establishes a busmonitor tunnel to the KNX network.
	 */
	public static final int BUSMONITOR_LAYER = 0x80;

	/**
	 * Tunneling on link layer, establishes a link layer tunnel to the KNX network.
	 */
	public static final int LINK_LAYER = 0x02;

	/**
	 * Tunneling on raw layer, establishes a raw tunnel to the KNX network.
	 */
	public static final int RAW_LAYER = 0x04;

	// client SHALL wait 1 second for acknowledgment response to a
	// tunneling request from server
	private static final int TUNNELING_REQ_TIMEOUT = 1;

	private final int layer;

	/**
	 * Creates a new KNXnet/IP tunneling connection to a remote server.
	 * <p>
	 * Establishing a raw tunneling layer ({@link #RAW_LAYER}) is not supported yet.<br>
	 *
	 * @param knxLayer KNX tunneling layer (e.g. {@link #LINK_LAYER})
	 * @param localEP specifies the local endpoint with the socket address to be used by
	 *        the tunnel
	 * @param serverCtrlEP control endpoint of the server to establish connection to
	 * @param useNAT <code>true</code> to use a NAT (network address translation) aware
	 *        communication mechanism, <code>false</code> to use the default way
	 * @throws KNXException on socket communication error
	 * @throws KNXTimeoutException on no connect response before connect timeout
	 * @throws KNXRemoteException if response indicates an error condition at the server
	 *         concerning the request
	 * @throws KNXInvalidResponseException if connect response is in wrong format
	 * @throws InterruptedException on interrupted thread while creating tunneling
	 *         connection
	 */
	public KNXnetIPTunnel(final int knxLayer, final InetSocketAddress localEP,
		final InetSocketAddress serverCtrlEP, final boolean useNAT) throws KNXException,
		InterruptedException
	{
		super(KNXnetIPHeader.TUNNELING_REQ, KNXnetIPHeader.TUNNELING_ACK, 2, TUNNELING_REQ_TIMEOUT);
		if (knxLayer == RAW_LAYER)
			throw new KNXIllegalArgumentException("raw tunnel to KNX network not supported");
		if (knxLayer != LINK_LAYER && knxLayer != BUSMONITOR_LAYER)
			throw new KNXIllegalArgumentException("unknown KNX layer");
		layer = knxLayer;
		connect(localEP, serverCtrlEP, new TunnelCRI(knxLayer), useNAT);
	}

	/**
	 * Sends a cEMI frame to the remote server communicating with this endpoint.
	 * <p>
	 * Sending in busmonitor mode is not permitted.<br>
	 *
	 * @param frame cEMI message to send, the expected cEMI type is according to the used
	 *        tunneling layer
	 */
	public void send(final CEMI frame, final BlockingMode mode) throws KNXTimeoutException,
		KNXConnectionClosedException
	{
		if (layer == BUSMONITOR_LAYER)
			throw new KNXIllegalStateException("send not permitted in busmonitor mode");
		if (!(frame instanceof CEMILData))
			throw new KNXIllegalArgumentException("unsupported cEMI type");
		super.send(frame, mode);
	}

	public String getName()
	{
		return "KNXnet/IP Tunneling " + super.getName();
	}

	protected boolean handleServiceType(final KNXnetIPHeader h, final byte[] data, final int offset,
		final InetAddress src, final int port) throws KNXFormatException, IOException
	{
		if (super.handleServiceType(h, data, offset, src, port))
			return true;
		final int svc = h.getServiceType();
		if (svc != serviceRequest)
			return false;

		final ServiceRequest req = getServiceRequest(h, data, offset);
		if (!checkChannelId(req.getChannelID(), "request"))
			return true;

		final int seq = req.getSequenceNumber();
		if (seq == getSeqRcv() || ((seq + 1) & 0xFF) == getSeqRcv()) {
			final int status = h.getVersion() == KNXNETIP_VERSION_10 ? ErrorCodes.NO_ERROR
					: ErrorCodes.VERSION_NOT_SUPPORTED;
			final byte[] buf = PacketHelper.toPacket(new ServiceAck(serviceAck, channelId, seq,
					status));
			final DatagramPacket p = new DatagramPacket(buf, buf.length, dataEndpt.getAddress(),
					dataEndpt.getPort());
			socket.send(p);
			if (status == ErrorCodes.VERSION_NOT_SUPPORTED) {
				close(CloseEvent.INTERNAL, "protocol version changed", LogLevel.ERROR, null);
				return true;
			}
		}
		else
			logger.warn("tunneling request with invalid rcv-seq " + seq + ", expected "
					+ getSeqRcv());
		if (seq == getSeqRcv()) {
			incSeqRcv();
			final CEMI cemi = req.getCEMI();
			// leave if we are working with an empty (broken) service request
			if (cemi == null)
				return true;

			final int mc = cemi.getMessageCode();
			if (mc == CEMILData.MC_LDATA_IND || mc == CEMIBusMon.MC_BUSMON_IND)
				fireFrameReceived(cemi);
			else if (mc == CEMILData.MC_LDATA_CON) {
				// invariant: notify listener before return from blocking send
				logger.trace("received cEMI L-Data.con with req " + req.getSequenceNumber());
				fireFrameReceived(cemi);

				synchronized (lock) {
					final CEMILData ldata = (CEMILData) keepForCon;
					if (ldata != null && internalState == CEMI_CON_PENDING) {
						// check if address was set by server
						final boolean emptySrc = ldata.getSource().getRawAddress() == 0;
						final byte[] sent = unifyLData(ldata, emptySrc);
						final byte[] recv = unifyLData(cemi, emptySrc);
						if (Arrays.equals(recv, sent)) {
							keepForCon = null;
							setStateNotify(OK);
						}
						else {
							// we could get a .con with its hop count already decremented by 1
							// decrement hop count of sent for comparison
							final int sendCount = ldata.getHopCount() - 1;
							sent[3] = (byte) ((sent[3] & (0x8f)) | (sendCount << 4));
							if (Arrays.equals(recv, sent)) {
								keepForCon = null;
								setStateNotify(OK);
								logger.info("received L-Data.con with hopcount decremented by 1 (sent "
										+ (sendCount + 1) + ", got " + sendCount + ")");
							}
						}
					}
				}
			}
			else if (mc == CEMILData.MC_LDATA_REQ)
				logger.warn("received L-Data request - ignored");
		}
		else
			logger.info("skip tunneling request with rcv-seq " + seq + " (already received)");
		return true;
	}

	private byte[] unifyLData(final CEMI ldata, final boolean emptySrc)
	{
		final byte[] data = ldata.toByteArray();
		// set msg code field 0
		data[0] = 0;
		// set ctrl1 field 0
		data[1 + data[1] + 1] = 0;
		// conditionally set source address 0
		if (emptySrc) {
			data[1 + data[1] + 3] = 0;
			data[1 + data[1] + 4] = 0;
		}
		return data;
	}
}
