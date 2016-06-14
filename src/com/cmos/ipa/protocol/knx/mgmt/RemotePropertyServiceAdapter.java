/*
    Calimero 2 - A library for KNX network access
    Copyright (c) 2006, 2015 B. Malinowsky

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

package com.cmos.ipa.protocol.knx.mgmt;

import com.cmos.ipa.protocol.knx.CloseEvent;
import com.cmos.ipa.protocol.knx.FrameEvent;
import com.cmos.ipa.protocol.knx.IndividualAddress;
import com.cmos.ipa.protocol.knx.exception.KNXException;
import com.cmos.ipa.protocol.knx.link.KNXLinkClosedException;
import com.cmos.ipa.protocol.knx.link.KNXNetworkLink;
import com.cmos.ipa.protocol.knx.link.NetworkLinkListener;

/**
 * Property adapter for remote property services.
 * <p>
 *
 * @author B. Malinowsky
 */
public class RemotePropertyServiceAdapter implements PropertyAdapter
{
	private final ManagementClient mc;
	private final Destination dst;
	private byte[] key;
	private final NetworkLinkListener nll;
	private final PropertyAdapterListener pal;

	private final class NLListener implements NetworkLinkListener
	{
		NLListener()
		{}

		public void confirmation(final FrameEvent e)
		{}

		public void indication(final FrameEvent e)
		{}

		public void linkClosed(final CloseEvent e)
		{
			pal.adapterClosed(new CloseEvent(RemotePropertyServiceAdapter.this, e
				.getInitiator(), e.getReason()));
		}
	}

	/**
	 * Creates a new property adapter for remote property access.
	 *
	 * @param link KNX network link used for communication with the KNX network
	 * @param remote KNX individual address to access its interface objects
	 * @param l property adapter listener to get notified about adapter events, use
	 *        <code>null</code> for no listener
	 * @param connOriented <code>true</code> to use connection oriented mode for access,
	 *        <code>false</code> to use connectionless mode
	 * @throws KNXLinkClosedException if the network link is closed
	 */
	public RemotePropertyServiceAdapter(final KNXNetworkLink link,
		final IndividualAddress remote, final PropertyAdapterListener l,
		final boolean connOriented) throws KNXLinkClosedException
	{
		mc = new ManagementClientImpl(link);
		dst = mc.createDestination(remote, connOriented);
		pal = l;
		nll = pal != null ? new NLListener() : null;
		if (nll != null)
			link.addLinkListener(nll);
		key = null;
	}

	/**
	 * Creates a new property adapter for remote property access in connection-oriented
	 * mode with authorization.
	 *
	 * @param link KNX network link used for communication with the KNX network
	 * @param remote KNX individual address to access its interface objects
	 * @param l property adapter listener to get notified about adapter events, use
	 *        <code>null</code> for no listener
	 * @param authorizeKey byte array with authorization key
	 * @throws KNXLinkClosedException if the network link is closed
	 * @throws KNXException on failure during authorization
	 * @throws InterruptedException on interrupted thread
	 */
	public RemotePropertyServiceAdapter(final KNXNetworkLink link,
		final IndividualAddress remote, final PropertyAdapterListener l,
		final byte[] authorizeKey) throws KNXException, InterruptedException
	{
		this(link, remote, l, true);
		key = (byte[]) authorizeKey.clone();
		try {
			mc.authorize(dst, key);
		}
		catch (final KNXException e) {
			close();
			throw e;
		}
	}

	/* (non-Javadoc)
	 * @see tuwien.auto.calimero.mgmt.PropertyAdapter#setProperty
	 * (int, int, int, int, byte[])
	 */
	public void setProperty(final int objIndex, final int pid, final int start,
		final int elements, final byte[] data) throws KNXException, InterruptedException
	{
		mc.writeProperty(dst, objIndex, pid, start, elements, data);
	}

	/* (non-Javadoc)
	 * @see tuwien.auto.calimero.mgmt.PropertyAdapter#getProperty(int, int, int, int)
	 */
	public byte[] getProperty(final int objIndex, final int pid, final int start,
		final int elements) throws KNXException, InterruptedException
	{
		return mc.readProperty(dst, objIndex, pid, start, elements);
	}

	/* (non-Javadoc)
	 * @see tuwien.auto.calimero.mgmt.PropertyAdapter#getDescription(int, int, int)
	 */
	public byte[] getDescription(final int objIndex, final int pid, final int propIndex)
		throws KNXException, InterruptedException
	{
		return mc.readPropertyDesc(dst, objIndex, pid, propIndex);
	}

	/**
	 * {@inheritDoc} The name for this adapter starts with "remote PS " + remote KNX
	 * individual address, allowing easier distinction of adapter types.
	 */
	public String getName()
	{
		return "remote PS " + dst.getAddress();
	}

	/* (non-Javadoc)
	 * @see tuwien.auto.calimero.mgmt.PropertyAdapter#isOpen()
	 */
	public boolean isOpen()
	{
		return mc.isOpen();
	}

	/* (non-Javadoc)
	 * @see tuwien.auto.calimero.mgmt.PropertyAdapter#close()
	 */
	public void close()
	{
		final KNXNetworkLink lnk = mc.detach();
		if (lnk != null && nll != null)
			lnk.removeLinkListener(nll);
	}
}
