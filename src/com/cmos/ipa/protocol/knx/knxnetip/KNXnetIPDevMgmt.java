/*
    Calimero 2 - A library for KNX network access
    Copyright (c) 2006, 2011 B. Malinowsky

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

import com.cmos.ipa.protocol.knx.CloseEvent;
import com.cmos.ipa.protocol.knx.cemi.CEMI;
import com.cmos.ipa.protocol.knx.cemi.CEMIDevMgmt;
import com.cmos.ipa.protocol.knx.exception.KNXException;
import com.cmos.ipa.protocol.knx.exception.KNXFormatException;
import com.cmos.ipa.protocol.knx.exception.KNXIllegalArgumentException;
import com.cmos.ipa.protocol.knx.exception.KNXInvalidResponseException;
import com.cmos.ipa.protocol.knx.exception.KNXRemoteException;
import com.cmos.ipa.protocol.knx.exception.KNXTimeoutException;
import com.cmos.ipa.protocol.knx.knxnetip.servicetype.ErrorCodes;
import com.cmos.ipa.protocol.knx.knxnetip.servicetype.KNXnetIPHeader;
import com.cmos.ipa.protocol.knx.knxnetip.servicetype.PacketHelper;
import com.cmos.ipa.protocol.knx.knxnetip.servicetype.ServiceAck;
import com.cmos.ipa.protocol.knx.knxnetip.servicetype.ServiceRequest;
import com.cmos.ipa.protocol.knx.knxnetip.util.CRI;
import com.cmos.ipa.protocol.knx.log.LogLevel;

/**
 * KNXnet/IP connection for KNX local device management.
 * <p>
 * The communication on OSI layer 4 is done using UDP.<br>
 * 
 * @author B. Malinowsky
 */
public class KNXnetIPDevMgmt extends ClientConnection
{
	/**
	 * Connection type used to configure a KNXnet/IP device.
	 * <p>
	 */
	public static final int DEVICE_MGMT_CONNECTION = 0x03;

	// client SHALL wait 10 seconds for a device config response from server
	private static final int CONFIGURATION_REQ_TIMEOUT = 10;

	/**
	 * Creates a new KNXnet/IP device management connection to a remote device.
	 * <p>
	 * 
	 * @param localEP the local endpoint to use for communication channel
	 * @param serverCtrlEP the remote server control endpoint used for connect request
	 * @param useNAT <code>true</code> to use a NAT (Network Address Translation) aware
	 *        communication mechanism, <code>false</code> to use the default way
	 * @throws KNXException on socket communication error
	 * @throws KNXTimeoutException on no connect response before connect timeout
	 * @throws KNXRemoteException if response indicates an error condition at the server
	 *         concerning the request
	 * @throws KNXInvalidResponseException if connect response is in wrong format
	 * @throws InterruptedException on interrupted thread while creating management
	 *         connection
	 */
	public KNXnetIPDevMgmt(final InetSocketAddress localEP, final InetSocketAddress serverCtrlEP,
		final boolean useNAT) throws KNXException, InterruptedException
	{
		super(KNXnetIPHeader.DEVICE_CONFIGURATION_REQ,
			KNXnetIPHeader.DEVICE_CONFIGURATION_ACK, 4, CONFIGURATION_REQ_TIMEOUT);
		final CRI cri = CRI.createRequest(DEVICE_MGMT_CONNECTION, null);
		connect(localEP, serverCtrlEP, cri, useNAT);
	}

	/**
	 * Sends a cEMI device management frame to the remote server communicating with this
	 * endpoint.
	 * <p>
	 * 
	 * @param frame cEMI device management message of type {@link CEMIDevMgmt} to send
	 */
	public void send(final CEMI frame, final BlockingMode mode) throws KNXTimeoutException,
		KNXConnectionClosedException
	{
		if (!(frame instanceof CEMIDevMgmt))
			throw new KNXIllegalArgumentException("unsupported cEMI type");
		super.send(frame, mode);
	}

	/* (non-Javadoc)
	 * @see tuwien.auto.calimero.knxnetip.KNXnetIPConnection#getName()
	 */
	public String getName()
	{
		return "KNXnet/IP DevMgmt " + super.getName();
	}

	/* (non-Javadoc)
	 * @see tuwien.auto.calimero.knxnetip.ClientConnection#handleServiceType
	 * (tuwien.auto.calimero.knxnetip.servicetype.KNXnetIPHeader, byte[], int,
	 * java.net.InetAddress, int)
	 */
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
		if (seq == getSeqRcv()) {
			final int status = h.getVersion() == KNXNETIP_VERSION_10 ? ErrorCodes.NO_ERROR
					: ErrorCodes.VERSION_NOT_SUPPORTED;
			final byte[] buf = PacketHelper.toPacket(new ServiceAck(serviceAck, channelId, seq,
					status));
			final DatagramPacket p = new DatagramPacket(buf, buf.length, dataEndpt.getAddress(),
					dataEndpt.getPort());
			socket.send(p);
			incSeqRcv();
			if (status == ErrorCodes.VERSION_NOT_SUPPORTED) {
				close(CloseEvent.INTERNAL, "protocol version changed", LogLevel.ERROR, null);
				return true;
			}
			final CEMI cemi = req.getCEMI();
			// leave if we are working with an empty (broken) service request
			if (cemi == null)
				return true;
			final int mc = cemi.getMessageCode();
			if (mc == CEMIDevMgmt.MC_PROPINFO_IND || mc == CEMIDevMgmt.MC_RESET_IND)
				fireFrameReceived(cemi);
			else if (mc == CEMIDevMgmt.MC_PROPREAD_CON || mc == CEMIDevMgmt.MC_PROPWRITE_CON) {
				// invariant: notify listener before return from blocking send
				fireFrameReceived(cemi);
				setStateNotify(OK);
			}
		}
		else
			logger.warn("received dev.mgmt request with rcv-seq " + seq
				+ ", expected " + getSeqRcv() + " - ignored");
		return true;
	}
}
