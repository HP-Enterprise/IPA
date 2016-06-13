/*
 * ============================================================================
 * GNU General Public License
 * ============================================================================
 *
 * Copyright (C) 2006-2011 Serotonin Software Technologies Inc. http://serotoninsoftware.com
 * @author Matthew Lohbihler
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * When signing a commercial license with Serotonin Software Technologies Inc.,
 * the following extension to GPL is made. A special exception to the GPL is 
 * included to allow you to distribute a combined work that includes BAcnet4J 
 * without being obliged to provide the source code for any proprietary components.
 */
package com.cmos.ipa.protocol.bacnet.service.unconfirmed;

import com.cmos.ipa.protocol.bacnet.LocalDevice;
import com.cmos.ipa.protocol.bacnet.Network;
import com.cmos.ipa.protocol.bacnet.exception.BACnetException;
import com.cmos.ipa.protocol.bacnet.exception.BACnetServiceException;
import com.cmos.ipa.protocol.bacnet.type.constructed.Address;
import com.cmos.ipa.protocol.bacnet.type.constructed.DateTime;
import com.cmos.ipa.protocol.bacnet.type.constructed.ServicesSupported;
import com.cmos.ipa.protocol.bacnet.type.enumerated.PropertyIdentifier;
import com.serotonin.util.queue.ByteQueue;

public class UTCTimeSynchronizationRequest extends UnconfirmedRequestService {
    private static final long serialVersionUID = 495223700432185701L;

    public static final byte TYPE_ID = 9;

    private final DateTime time;

    public UTCTimeSynchronizationRequest(DateTime time) {
        this.time = time;
    }

    @Override
    public byte getChoiceId() {
        return TYPE_ID;
    }

    @Override
    public void write(ByteQueue queue) {
        write(queue, time);
    }

    UTCTimeSynchronizationRequest(ByteQueue queue) throws BACnetException {
        time = read(queue, DateTime.class);
    }

    @Override
    public void handle(LocalDevice localDevice, Address from, Network network) {
        try {
            ServicesSupported servicesSupported = (ServicesSupported) localDevice.getConfiguration().getProperty(
                    PropertyIdentifier.protocolServicesSupported);
            if (servicesSupported.isUtcTimeSynchronization())
                localDevice.getEventHandler().synchronizeTime(time, true);
        }
        catch (BACnetServiceException e) {
            // no op
        }
    }

    @Override
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + ((time == null) ? 0 : time.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final UTCTimeSynchronizationRequest other = (UTCTimeSynchronizationRequest) obj;
        if (time == null) {
            if (other.time != null)
                return false;
        }
        else if (!time.equals(other.time))
            return false;
        return true;
    }
}