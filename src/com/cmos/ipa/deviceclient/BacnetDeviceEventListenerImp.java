package com.cmos.ipa.deviceclient;

import com.cmos.ipa.protocol.bacnet.RemoteDevice;
import com.cmos.ipa.protocol.bacnet.RemoteObject;
import com.cmos.ipa.protocol.bacnet.event.DeviceEventListener;
import com.cmos.ipa.protocol.bacnet.obj.BACnetObject;
import com.cmos.ipa.protocol.bacnet.service.confirmed.ReinitializeDeviceRequest;
import com.cmos.ipa.protocol.bacnet.type.Encodable;
import com.cmos.ipa.protocol.bacnet.type.constructed.*;
import com.cmos.ipa.protocol.bacnet.type.enumerated.EventState;
import com.cmos.ipa.protocol.bacnet.type.enumerated.EventType;
import com.cmos.ipa.protocol.bacnet.type.enumerated.MessagePriority;
import com.cmos.ipa.protocol.bacnet.type.enumerated.NotifyType;
import com.cmos.ipa.protocol.bacnet.type.notificationParameters.NotificationParameters;
import com.cmos.ipa.protocol.bacnet.type.primitive.*;

/**
 * Created by Administrator on 2016/6/12.
 */
public class BacnetDeviceEventListenerImp implements DeviceEventListener {

    @Override
    public void listenerException(Throwable e) {

    }

    @Override
    public void iAmReceived(RemoteDevice d) {

    }

    @Override
    public boolean allowPropertyWrite(BACnetObject obj, PropertyValue pv) {
        return true;
    }

    @Override
    public void propertyWritten(BACnetObject obj, PropertyValue pv) {

    }

    @Override
    public void iHaveReceived(RemoteDevice d, RemoteObject o) {

    }

    @Override
    public void covNotificationReceived(UnsignedInteger subscriberProcessIdentifier, RemoteDevice initiatingDevice, ObjectIdentifier monitoredObjectIdentifier, UnsignedInteger timeRemaining, SequenceOf<PropertyValue> listOfValues) {

    }

    @Override
    public void eventNotificationReceived(UnsignedInteger processIdentifier, RemoteDevice initiatingDevice, ObjectIdentifier eventObjectIdentifier, TimeStamp timeStamp, UnsignedInteger notificationClass, UnsignedInteger priority, EventType eventType, CharacterString messageText, NotifyType notifyType, com.cmos.ipa.protocol.bacnet.type.primitive.Boolean ackRequired, EventState fromState, EventState toState, NotificationParameters eventValues) {

    }

    @Override
    public void textMessageReceived(RemoteDevice textMessageSourceDevice, Choice messageClass, MessagePriority messagePriority, CharacterString message) {

    }

    @Override
    public void privateTransferReceived(UnsignedInteger vendorId, UnsignedInteger serviceNumber, Encodable serviceParameters) {

    }

    @Override
    public void reinitializeDevice(ReinitializeDeviceRequest.ReinitializedStateOfDevice reinitializedStateOfDevice) {

    }

    @Override
    public void synchronizeTime(DateTime dateTime, boolean utc) {

    }
}

