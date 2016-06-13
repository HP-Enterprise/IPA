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
package com.cmos.ipa.protocol.bacnet.event;

import com.cmos.ipa.protocol.bacnet.RemoteDevice;
import com.cmos.ipa.protocol.bacnet.RemoteObject;
import com.cmos.ipa.protocol.bacnet.obj.BACnetObject;
import com.cmos.ipa.protocol.bacnet.service.confirmed.ReinitializeDeviceRequest.ReinitializedStateOfDevice;
import com.cmos.ipa.protocol.bacnet.type.Encodable;
import com.cmos.ipa.protocol.bacnet.type.constructed.Choice;
import com.cmos.ipa.protocol.bacnet.type.constructed.DateTime;
import com.cmos.ipa.protocol.bacnet.type.constructed.PropertyValue;
import com.cmos.ipa.protocol.bacnet.type.constructed.SequenceOf;
import com.cmos.ipa.protocol.bacnet.type.constructed.TimeStamp;
import com.cmos.ipa.protocol.bacnet.type.enumerated.EventState;
import com.cmos.ipa.protocol.bacnet.type.enumerated.EventType;
import com.cmos.ipa.protocol.bacnet.type.enumerated.MessagePriority;
import com.cmos.ipa.protocol.bacnet.type.enumerated.NotifyType;
import com.cmos.ipa.protocol.bacnet.type.notificationParameters.NotificationParameters;
import com.cmos.ipa.protocol.bacnet.type.primitive.Boolean;
import com.cmos.ipa.protocol.bacnet.type.primitive.CharacterString;
import com.cmos.ipa.protocol.bacnet.type.primitive.ObjectIdentifier;
import com.cmos.ipa.protocol.bacnet.type.primitive.UnsignedInteger;

/**
 * A default class for easy implementation of the DeviceEventListener interface. Instead of having to implement all of
 * the defined methods, listener classes can override this and only implement the desired methods.
 * 
 * @author mlohbihler
 */
public class DefaultDeviceEventListener implements DeviceEventListener {
    public void listenerException(Throwable e) {
        // no op
    }

    public boolean allowPropertyWrite(BACnetObject obj, PropertyValue pv) {
        return true;
    }

    public void iAmReceived(RemoteDevice d) {
        // no op
    }

    public void propertyWritten(BACnetObject obj, PropertyValue pv) {
        // no op
    }

    public void iHaveReceived(RemoteDevice d, RemoteObject o) {
        // no op
    }

    public void covNotificationReceived(UnsignedInteger subscriberProcessIdentifier, RemoteDevice initiatingDevice,
            ObjectIdentifier monitoredObjectIdentifier, UnsignedInteger timeRemaining,
            SequenceOf<PropertyValue> listOfValues) {
        // no op
    }

    public void eventNotificationReceived(UnsignedInteger processIdentifier, RemoteDevice initiatingDevice,
            ObjectIdentifier eventObjectIdentifier, TimeStamp timeStamp, UnsignedInteger notificationClass,
            UnsignedInteger priority, EventType eventType, CharacterString messageText, NotifyType notifyType,
            Boolean ackRequired, EventState fromState, EventState toState, NotificationParameters eventValues) {
        // no op
    }

    public void textMessageReceived(RemoteDevice textMessageSourceDevice, Choice messageClass,
            MessagePriority messagePriority, CharacterString message) {
        // no op
    }

    public void privateTransferReceived(UnsignedInteger vendorId, UnsignedInteger serviceNumber,
            Encodable serviceParameters) {
        // no op
    }

    public void reinitializeDevice(ReinitializedStateOfDevice reinitializedStateOfDevice) {
        // no op
    }

    public void synchronizeTime(DateTime dateTime, boolean utc) {
        // no op
    }
}
