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

package com.cmos.ipa.protocol.knx.buffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EventListener;
import java.util.Iterator;
import java.util.List;

import com.cmos.ipa.protocol.knx.CloseEvent;
import com.cmos.ipa.protocol.knx.DataUnitBuilder;
import com.cmos.ipa.protocol.knx.FrameEvent;
import com.cmos.ipa.protocol.knx.KNXAddress;
import com.cmos.ipa.protocol.knx.Priority;
import com.cmos.ipa.protocol.knx.buffer.cache.Cache;
import com.cmos.ipa.protocol.knx.buffer.cache.CacheObject;
import com.cmos.ipa.protocol.knx.buffer.cache.LFUCache;
import com.cmos.ipa.protocol.knx.cemi.CEMI;
import com.cmos.ipa.protocol.knx.cemi.CEMILData;
import com.cmos.ipa.protocol.knx.datapoint.DatapointModel;
import com.cmos.ipa.protocol.knx.exception.KNXTimeoutException;
import com.cmos.ipa.protocol.knx.internal.EventListeners;
import com.cmos.ipa.protocol.knx.link.KNXLinkClosedException;
import com.cmos.ipa.protocol.knx.link.KNXNetworkLink;
import com.cmos.ipa.protocol.knx.link.NetworkLinkListener;
import com.cmos.ipa.protocol.knx.link.medium.KNXMediumSettings;
import com.cmos.ipa.protocol.knx.log.LogManager;
import com.cmos.ipa.protocol.knx.log.LogService;

/**
 * A network buffer temporarily stores KNX network messages for better response and/or KNX network
 * performance. Reasons to use a network buffer might be to lower the response time when answering
 * frequently occurring application queries, leading to a better runtime performance. Another use
 * would be to enable user-polled applications. Interfaces for KNX access as well as the KNX
 * transmission medium differ in processing delays and maximum message rates. This can have adverse
 * effects, caused by queue overflows or dropped messages, for client applications that do not take
 * those limitations into account. Overall, a network buffer helps in keeping the KNX network
 * message load lower for client usage patterns that are not optimal for a KNX network.
 * <p>
 * The purpose of the network buffer is to locally reflect the most up-to-date state (or command
 * sequence) of KNX datapoints. It is not designed as general-purpose message store. KNX messages
 * are buffered at link layer (L_Data).
 * <p>
 * A network buffer contains one or more {@link Configuration}s, each maintaining rules to filter
 * and buffer messages. A configuration works with filters set by the user for that particular
 * configuration. At two points in the messages flow a filter can be specified: when messages arrive
 * from the KNX network at the buffer, and when the buffer shall answers a message request. Two
 * types of filters exist for this, a {@link Configuration.NetworkFilter} applies its filter rules
 * on incoming messages, a {@link Configuration.RequestFilter} filters message requests from users
 * and answers them using the network buffer.<br>
 * If a configuration is active and no network filter is set, a default filter is used, which simply
 * accepts all cEMI L-Data.<br>
 * If no request filter is set, no buffer lookup is done on requests, instead the request is
 * forwarded directly to the KNX network.
 * <p>
 * In general, one network buffer is created for one KNX installation, to easier distinguish between
 * different installations. Nevertheless, this is not enforced in any way; a new configuration also
 * might just always use a new network buffer.
 *
 * @author B. Malinowsky
 */
public final class NetworkBuffer
{
	// this is for network link only, for now
	private static final class ConfigImpl implements Configuration
	{
		private final SquirrelLink lnk;
		private final NetworkLinkListener ll;
		private Cache cache;
		private Configuration.NetworkFilter nwFilter;
		private Configuration.RequestFilter reqFilter;
		private volatile boolean active;
		private volatile boolean queryBufferOnly;
		private DatapointModel model;

		// listen on the link and update our buffers
		private final class SquirrelListener implements NetworkLinkListener
		{
			SquirrelListener()
			{}

			public void confirmation(final FrameEvent e)
			{
				if (active && ((CEMILData) e.getFrame()).isPositiveConfirmation())
					updateBuffer(e.getFrame());
			}

			public void indication(final FrameEvent e)
			{
				if (active)
					updateBuffer(e.getFrame());
			}

			public void linkClosed(final CloseEvent e)
			{
				activate(false);
			}

			private void updateBuffer(final CEMI frame)
			{
				if (nwFilter != null)
					nwFilter.accept(frame, ConfigImpl.this);
			}
		}

		private final class SquirrelLink implements KNXNetworkLink
		{
			private final KNXNetworkLink base;
			private final EventListeners listeners = new EventListeners();

			SquirrelLink(final KNXNetworkLink baseLink)
			{
				base = baseLink;
			}

			public void addLinkListener(final NetworkLinkListener l)
			{
				base.addLinkListener(l);
				listeners.add(l);
			}

			public void removeLinkListener(final NetworkLinkListener l)
			{
				base.removeLinkListener(l);
				listeners.remove(l);
			}

			public int getHopCount()
			{
				return base.getHopCount();
			}

			public void setHopCount(final int count)
			{
				base.setHopCount(count);
			}

			public KNXMediumSettings getKNXMedium()
			{
				return base.getKNXMedium();
			}

			public void setKNXMedium(final KNXMediumSettings a)
			{
				base.setKNXMedium(a);
			}

			public void sendRequest(final KNXAddress dst, final Priority p,
				final byte[] nsdu) throws KNXLinkClosedException, KNXTimeoutException
			{
				if (!doBufferedResponse(dst, nsdu))
					base.sendRequest(dst, p, nsdu);
			}

			public void sendRequestWait(final KNXAddress dst, final Priority p,
				final byte[] nsdu) throws KNXTimeoutException, KNXLinkClosedException
			{
				if (!doBufferedResponse(dst, nsdu))
					base.sendRequestWait(dst, p, nsdu);
			}

			public void send(final CEMILData msg, final boolean waitForCon)
				throws KNXTimeoutException, KNXLinkClosedException
			{
				if (!doBufferedResponse(msg.getDestination(), msg.getPayload()))
					base.send(msg, waitForCon);
			}

			public String getName()
			{
				return "buffered " + base.getName();
			}

			public boolean isOpen()
			{
				return base.isOpen();
			}

			public void close()
			{
				activate(false);
				base.close();
				listeners.removeAll();
			}

			private boolean doBufferedResponse(final KNXAddress dst, final byte[] nsdu)
				throws KNXTimeoutException
			{
				final RequestFilter rf = reqFilter;
				// check valid access and A-group.read
				if (rf == null || !isOpen() || nsdu.length < 2
						|| DataUnitBuilder.getAPDUService(nsdu) != 0)
					return false;
				final CEMILData cemi = rf.request(dst, ConfigImpl.this);
				if (cemi != null) {
					fireIndication(cemi);
					return true;
				}
				if (queryBufferOnly)
					throw new KNXTimeoutException("query limited to network buffer");
				return false;
			}

			private void fireIndication(final CEMILData frame)
			{
				final FrameEvent e = new FrameEvent(this, frame);
				final EventListener[] el = listeners.listeners();
				for (int i = 0; i < el.length; ++i) {
					final NetworkLinkListener l = (NetworkLinkListener) el[i];
					try {
						l.indication(e);
					}
					catch (final RuntimeException rte) {
						removeLinkListener(l);
					}
				}
			}
		}

		ConfigImpl(final KNXNetworkLink link)
		{
			lnk = new SquirrelLink(link);
			ll = new SquirrelListener();
			link.addLinkListener(ll);
		}

		public void activate(final boolean activate)
		{
			active = activate;
			if (active && getCache() == null)
				setCache(new LFUCache(0, 0));
			// supply a really simple "all you can buffer"-filter
			if (active && nwFilter == null) {
				nwFilter = new NetworkFilter()
				{
					public void accept(final CEMI frame, final Configuration c)
					{
						final Cache localCache = c.getCache();
						if (localCache == null || !(frame instanceof CEMILData))
							return;
						final CEMILData f = (CEMILData) frame;
						// put into cache object
						final CacheObject co = localCache.get(f.getDestination());
						if (co != null) {
							((LDataObject) co).setFrame(f);
							c.getCache().put(co);
						}
						else
							localCache.put(new LDataObject(f));
					}

					public void init(final Configuration c)
					{}
				};
			}
			// we might not have any filter if we get deactivated on first call
			if (nwFilter != null)
				nwFilter.init(this);
		}

		public boolean isActive()
		{
			return active;
		}

		public KNXNetworkLink getBaseLink()
		{
			return lnk.base;
		}

		public KNXNetworkLink getBufferedLink()
		{
			return lnk;
		}

		public void setQueryBufferOnly(final boolean bufferOnly)
		{
			queryBufferOnly = bufferOnly;
		}

		public synchronized void setCache(final Cache c)
		{
			if (c == null && active)
				activate(false);
			cache = c;
		}

		public synchronized Cache getCache()
		{
			return cache;
		}

		public synchronized void setDatapointModel(final DatapointModel m)
		{
			model = m;
			if (nwFilter != null)
				nwFilter.init(this);
		}

		public synchronized DatapointModel getDatapointModel()
		{
			return model;
		}

		public void setFilter(final NetworkFilter nf, final RequestFilter rf)
		{
			nwFilter = nf;
			reqFilter = rf;
			if (nwFilter != null)
				nwFilter.init(this);
		}

		public NetworkFilter getNetworkFilter()
		{
			return nwFilter;
		}

		public RequestFilter getRequestFilter()
		{
			return reqFilter;
		}

		void unregister()
		{
			activate(false);
			getBaseLink().removeLinkListener(ll);
		}
	}

	/** Name of the log service used for network buffer logging. */
	public static final String LOG_SERVICE = "network buffer";

	static final LogService logger = LogManager.getManager().getLogService(LOG_SERVICE);

	// all network buffers currently in use
	// private static final List buffers = new ArrayList();
	private static int uniqueInstID;

	private final List configs = Collections.synchronizedList(new ArrayList());
	private final String name;

	private NetworkBuffer(final String installation)
	{
		name = installation;
	}

	/**
	 * Creates a new network buffer for a KNX installation.
	 * <p>
	 * To identify the buffer a unique installation identifier can be given through
	 * <code>installationId</code>.<br>
	 * If <code>null</code> or an empty string is supplied for the installation ID, a new default ID
	 * is generated of the form "Installation [ID]", where [ID] is a unique incrementing number.
	 * Note, the installation ID string is treated case sensitive.
	 *
	 * @param installationId installation identifier for the network buffer, or <code>null</code>
	 * @return the new network buffer
	 */
	public static synchronized NetworkBuffer createBuffer(final String installationId)
	{
		final NetworkBuffer b = new NetworkBuffer(validateInstID(installationId));
		return b;
	}

	/**
	 * Creates and adds a new configuration for the supplied network link to this network
	 * buffer.
	 * <p>
	 * By default, the added configuration is not activated, and no filters are set by the
	 * network buffer.<br>
	 * If the supplied <code>link</code> gets closed, the created configuration will get
	 * deactivated (see {@link Configuration#activate(boolean)}), and the buffered link of
	 * the configuration, obtained with {@link Configuration#getBufferedLink()}, will get
	 * closed as well.
	 *
	 * @param link KNX network link communicating with the KNX network
	 * @return the new configuration
	 */
	public Configuration addConfiguration(final KNXNetworkLink link)
	{
		final ConfigImpl c = new ConfigImpl(link);
		configs.add(c);
		return c;
	}

	/**
	 * Removes a configuration from this network buffer.
	 * <p>
	 * The configuration is deactivated and will not receive any further events or
	 * incoming messages from the base network link supplied at creation of that
	 * configuration.
	 *
	 * @param c the configuration to remove
	 */
	public void removeConfiguration(final Configuration c)
	{
		if (configs.remove(c)) {
			((ConfigImpl) c).unregister();
		}
	}

	/**
	 * Gets the configuration which provides the buffered link.
	 * <p>
	 * If the network link is not a buffered link or not found in the current
	 * configurations of this network buffer, <code>null</code> is returned.
	 *
	 * @param bufferedLink the buffered link to get the configuration for
	 * @return the owning configuration of that link or <code>null</code>
	 */
	public Configuration getConfiguration(final KNXNetworkLink bufferedLink)
	{
		synchronized (configs) {
			for (final Iterator i = configs.iterator(); i.hasNext();) {
				final ConfigImpl lc = (ConfigImpl) i.next();
				if (lc.getBufferedLink() == bufferedLink)
					return lc;
			}
		}
		return null;
	}

	/**
	 * Returns all configurations of this network buffer.
	 * <p>
	 *
	 * @return a new Configuration array holding the configurations, with the array
	 *         length equal to the number of network buffer configurations
	 */
	public Configuration[] getAllConfigurations()
	{
		return (Configuration[]) configs.toArray(new Configuration[configs.size()]);
	}

	/**
	 * Returns the installation identifier of this network buffer.
	 * <p>
	 *
	 * @return installation ID
	 */
	public String getInstallationID()
	{
		return name;
	}

	/**
	 * Destroys this network buffer.
	 * <p>
	 * All configurations hold by this buffer are removed, see
	 * {@link #removeConfiguration(Configuration)}.
	 */
	public void destroy()
	{
		synchronized (configs) {
			while (!configs.isEmpty())
				removeConfiguration((Configuration) configs.get(configs.size() - 1));
		}
	}

	private static String validateInstID(final String instId)
	{
		if (instId == null || instId.length() == 0)
			return "Installation " + ++uniqueInstID;
		return instId;
	}
}
