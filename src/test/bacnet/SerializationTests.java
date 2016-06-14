/*
    Copyright (C) 2006-2009 Serotonin Software Technologies Inc.
 	@author Matthew Lohbihler
 */
package test.bacnet;

import java.lang.reflect.Constructor;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.GregorianCalendar;

import com.cmos.ipa.protocol.bacnet.service.Service;
import com.cmos.ipa.protocol.bacnet.service.acknowledgement.AcknowledgementService;
import com.cmos.ipa.protocol.bacnet.service.acknowledgement.ReadPropertyAck;
import com.cmos.ipa.protocol.bacnet.service.unconfirmed.UnconfirmedRequestService;
import com.cmos.ipa.protocol.bacnet.service.unconfirmed.UnconfirmedTextMessageRequest;
import com.cmos.ipa.protocol.bacnet.type.Encodable;
import com.cmos.ipa.protocol.bacnet.type.constructed.BACnetError;
import com.cmos.ipa.protocol.bacnet.type.constructed.DateTime;
import com.cmos.ipa.protocol.bacnet.type.constructed.DeviceObjectPropertyReference;
import com.cmos.ipa.protocol.bacnet.type.constructed.PriorityArray;
import com.cmos.ipa.protocol.bacnet.type.constructed.PriorityValue;
import com.cmos.ipa.protocol.bacnet.type.constructed.SequenceOf;
import com.cmos.ipa.protocol.bacnet.type.constructed.ServicesSupported;
import com.cmos.ipa.protocol.bacnet.type.constructed.StatusFlags;
import com.cmos.ipa.protocol.bacnet.type.constructed.TimeStamp;
import com.cmos.ipa.protocol.bacnet.type.constructed.TimeValue;
import com.cmos.ipa.protocol.bacnet.type.enumerated.ErrorClass;
import com.cmos.ipa.protocol.bacnet.type.enumerated.ErrorCode;
import com.cmos.ipa.protocol.bacnet.type.enumerated.MessagePriority;
import com.cmos.ipa.protocol.bacnet.type.enumerated.ObjectType;
import com.cmos.ipa.protocol.bacnet.type.enumerated.PropertyIdentifier;
import com.cmos.ipa.protocol.bacnet.type.error.BaseError;
import com.cmos.ipa.protocol.bacnet.type.error.ChangeListError;
import com.cmos.ipa.protocol.bacnet.type.eventParameter.BufferReady;
import com.cmos.ipa.protocol.bacnet.type.eventParameter.EventParameter;
import com.cmos.ipa.protocol.bacnet.type.eventParameter.Extended;
import com.cmos.ipa.protocol.bacnet.type.notificationParameters.ChangeOfValue;
import com.cmos.ipa.protocol.bacnet.type.notificationParameters.CommandFailure;
import com.cmos.ipa.protocol.bacnet.type.notificationParameters.FloatingLimit;
import com.cmos.ipa.protocol.bacnet.type.notificationParameters.NotificationParameters;
import com.cmos.ipa.protocol.bacnet.type.primitive.BitString;
import com.cmos.ipa.protocol.bacnet.type.primitive.CharacterString;
import com.cmos.ipa.protocol.bacnet.type.primitive.Date;
import com.cmos.ipa.protocol.bacnet.type.primitive.Enumerated;
import com.cmos.ipa.protocol.bacnet.type.primitive.Null;
import com.cmos.ipa.protocol.bacnet.type.primitive.ObjectIdentifier;
import com.cmos.ipa.protocol.bacnet.type.primitive.OctetString;
import com.cmos.ipa.protocol.bacnet.type.primitive.Real;
import com.cmos.ipa.protocol.bacnet.type.primitive.SignedInteger;
import com.cmos.ipa.protocol.bacnet.type.primitive.Time;
import com.cmos.ipa.protocol.bacnet.type.primitive.Unsigned16;
import com.cmos.ipa.protocol.bacnet.type.primitive.Unsigned32;
import com.cmos.ipa.protocol.bacnet.type.primitive.Unsigned8;
import com.cmos.ipa.protocol.bacnet.type.primitive.UnsignedInteger;
import com.serotonin.util.queue.ByteQueue;

/**
 * @author Matthew Lohbihler
 */
public class SerializationTests {
    public static void main(String[] args) throws Exception {
        for (Encodable encodable : encodables)
            testEncodable(encodable);
    }

    private static void testEncodable(Encodable encodable) throws Exception {
        ByteQueue queue = new ByteQueue();
        encodable.write(queue);

        ServicesSupported servicesSupported = new ServicesSupported();
        servicesSupported.setAll(true);

        Encodable deserialized;
        if (BaseError.class.isAssignableFrom(encodable.getClass()))
            deserialized = BaseError.createBaseError(queue);
        else if (NotificationParameters.class.isAssignableFrom(encodable.getClass()))
            deserialized = NotificationParameters.createNotificationParameters(queue);
        else if (EventParameter.class.isAssignableFrom(encodable.getClass()))
            deserialized = EventParameter.createEventParameter(queue);
        else if (AcknowledgementService.class.isAssignableFrom(encodable.getClass()))
            deserialized = AcknowledgementService.createAcknowledgementService(((Service) encodable).getChoiceId(),
                    queue);
        else if (UnconfirmedRequestService.class.isAssignableFrom(encodable.getClass()))
            deserialized = UnconfirmedRequestService.createUnconfirmedRequestService(servicesSupported,
                    ((Service) encodable).getChoiceId(), queue);
        else {
            Constructor<? extends Encodable> c = encodable.getClass().getConstructor(ByteQueue.class);
            deserialized = c.newInstance(queue);
        }

        if (!deserialized.equals(encodable))
            throw new Exception("Unequal deserialization in class " + encodable.getClass());
    }

    private static final Encodable[] encodables = {
            new ReadPropertyAck(
                    new ObjectIdentifier(ObjectType.eventEnrollment, 123),
                    PropertyIdentifier.eventParameters,
                    null,
                    new com.cmos.ipa.protocol.bacnet.type.eventParameter.FloatingLimit(
                            new UnsignedInteger(234),
                            new DeviceObjectPropertyReference(new ObjectIdentifier(ObjectType.analogValue, 345),
                                    PropertyIdentifier.presentValue, null, new ObjectIdentifier(ObjectType.device, 456)),
                            new Real(567), new Real(678), new Real(789))), //

            new UnconfirmedTextMessageRequest(new ObjectIdentifier(ObjectType.device, 123), MessagePriority.urgent,
                    new CharacterString(CharacterString.Encodings.ISO_8859_1, "This is the message")), //

            // Primitives
            new BitString(new boolean[] { true, false, true, false, true }), //
            new com.cmos.ipa.protocol.bacnet.type.primitive.Boolean(true), //
            new CharacterString("My test character string"), //
            new Date(new GregorianCalendar(2008, Calendar.MARCH, 22)), //
            new com.cmos.ipa.protocol.bacnet.type.primitive.Double(123.456), //
            new Enumerated(4), //
            new Null(), //
            new ObjectIdentifier(ObjectType.averaging, 2), //
            new OctetString(new byte[] { 1, 2, 3, 4 }), //
            new Real(234.567F), //
            new SignedInteger(-345), //
            new Time(13, 23, 12, 45), //
            new Unsigned16(65500), //
            new Unsigned32(Integer.MAX_VALUE), //
            new Unsigned8(254), //
            new UnsignedInteger(new BigInteger(Long.toString(Long.MAX_VALUE))), //
            new ServicesSupported(), //

            // Constructed
            new TimeValue(new Time(13, 23, 12, 45), new Real(65.56F)), //
            new ChangeListError((byte) 9, new BACnetError(ErrorClass.object, ErrorCode.abortBufferOverflow),
                    new UnsignedInteger(13)), //
            new FloatingLimit(new Real(123.45F), new StatusFlags(false, true, false, true), new Real(234.56F),
                    new Real(345.67F)), //
            new ChangeOfValue(new BitString(7, true), new StatusFlags(false, true, false, true)), //
            new ChangeOfValue(new Real(987.65F), new StatusFlags(false, true, false, true)), //
            new CommandFailure(new Time(), new StatusFlags(false, true, false, true), new Real(123.45F)), //
            new CommandFailure(new Real(123.45F), new StatusFlags(false, true, false, true), new Time()), //

            new BufferReady(new UnsignedInteger(17), new UnsignedInteger(19)), //
            new Extended(new UnsignedInteger(17), new UnsignedInteger(19), new SequenceOf<Extended.Parameter>()), //

            new ReadPropertyAck(new ObjectIdentifier(ObjectType.analogValue, 7), PropertyIdentifier.eventTimeStamps,
                    null, new SequenceOf<TimeStamp>()), //
            new ReadPropertyAck(new ObjectIdentifier(ObjectType.analogValue, 7), PropertyIdentifier.eventTimeStamps,
                    new UnsignedInteger(0), new UnsignedInteger(21)), //
            new ReadPropertyAck(new ObjectIdentifier(ObjectType.analogValue, 7), PropertyIdentifier.eventTimeStamps,
                    new UnsignedInteger(1), new TimeStamp(new DateTime())), //

            new ReadPropertyAck(new ObjectIdentifier(ObjectType.analogValue, 7), PropertyIdentifier.priorityArray,
                    null, new PriorityArray()), //
            new ReadPropertyAck(new ObjectIdentifier(ObjectType.analogValue, 7), PropertyIdentifier.priorityArray,
                    new UnsignedInteger(0), new UnsignedInteger(23)), //
            new ReadPropertyAck(new ObjectIdentifier(ObjectType.analogValue, 7), PropertyIdentifier.priorityArray,
                    new UnsignedInteger(11), new PriorityValue(new Null())), //
    };
}
