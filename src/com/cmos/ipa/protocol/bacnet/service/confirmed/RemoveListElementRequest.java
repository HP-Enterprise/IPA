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
package com.cmos.ipa.protocol.bacnet.service.confirmed;

import com.cmos.ipa.protocol.bacnet.LocalDevice;
import com.cmos.ipa.protocol.bacnet.Network;
import com.cmos.ipa.protocol.bacnet.exception.BACnetErrorException;
import com.cmos.ipa.protocol.bacnet.exception.BACnetException;
import com.cmos.ipa.protocol.bacnet.exception.BACnetServiceException;
import com.cmos.ipa.protocol.bacnet.obj.BACnetObject;
import com.cmos.ipa.protocol.bacnet.obj.ObjectProperties;
import com.cmos.ipa.protocol.bacnet.obj.PropertyTypeDefinition;
import com.cmos.ipa.protocol.bacnet.service.acknowledgement.AcknowledgementService;
import com.cmos.ipa.protocol.bacnet.type.Encodable;
import com.cmos.ipa.protocol.bacnet.type.constructed.Address;
import com.cmos.ipa.protocol.bacnet.type.constructed.BACnetError;
import com.cmos.ipa.protocol.bacnet.type.constructed.PropertyValue;
import com.cmos.ipa.protocol.bacnet.type.constructed.SequenceOf;
import com.cmos.ipa.protocol.bacnet.type.enumerated.ErrorClass;
import com.cmos.ipa.protocol.bacnet.type.enumerated.ErrorCode;
import com.cmos.ipa.protocol.bacnet.type.enumerated.PropertyIdentifier;
import com.cmos.ipa.protocol.bacnet.type.error.ChangeListError;
import com.cmos.ipa.protocol.bacnet.type.primitive.ObjectIdentifier;
import com.cmos.ipa.protocol.bacnet.type.primitive.UnsignedInteger;
import com.serotonin.util.queue.ByteQueue;

public class RemoveListElementRequest extends ConfirmedRequestService {
    private static final long serialVersionUID = 5047207667417777074L;

    public static final byte TYPE_ID = 9;

    private final ObjectIdentifier objectIdentifier;
    private final PropertyIdentifier propertyIdentifier;
    private final UnsignedInteger propertyArrayIndex;
    private final SequenceOf<? extends Encodable> listOfElements;

    public RemoveListElementRequest(ObjectIdentifier objectIdentifier, PropertyIdentifier propertyIdentifier,
            UnsignedInteger propertyArrayIndex, SequenceOf<? extends Encodable> listOfElements) {
        this.objectIdentifier = objectIdentifier;
        this.propertyIdentifier = propertyIdentifier;
        this.propertyArrayIndex = propertyArrayIndex;
        this.listOfElements = listOfElements;
    }

    @Override
    public byte getChoiceId() {
        return TYPE_ID;
    }

    @Override
    public void write(ByteQueue queue) {
        write(queue, objectIdentifier, 0);
        write(queue, propertyIdentifier, 1);
        writeOptional(queue, propertyArrayIndex, 2);
        write(queue, listOfElements, 3);
    }

    RemoveListElementRequest(ByteQueue queue) throws BACnetException {
        objectIdentifier = read(queue, ObjectIdentifier.class, 0);
        propertyIdentifier = read(queue, PropertyIdentifier.class, 1);
        propertyArrayIndex = readOptional(queue, UnsignedInteger.class, 2);
        PropertyTypeDefinition def = ObjectProperties.getPropertyTypeDefinition(objectIdentifier.getObjectType(),
                propertyIdentifier);
        listOfElements = readSequenceOf(queue, def.getClazz(), 3);
    }

    @SuppressWarnings("unchecked")
    @Override
    public AcknowledgementService handle(LocalDevice localDevice, Address from, Network network) throws BACnetException {
        BACnetObject obj = localDevice.getObject(objectIdentifier);
        if (obj == null)
            throw createException(ErrorClass.property, ErrorCode.writeAccessDenied, new UnsignedInteger(1));

        Encodable e;
        try {
            e = obj.getProperty(propertyIdentifier, propertyArrayIndex);
        }
        catch (BACnetServiceException ex) {
            throw createException(ErrorClass.property, ErrorCode.invalidArrayIndex, new UnsignedInteger(1));
        }
        if (!(e instanceof SequenceOf<?>))
            throw createException(ErrorClass.property, ErrorCode.propertyIsNotAnArray, new UnsignedInteger(1));

        SequenceOf<Encodable> propList = (SequenceOf<Encodable>) e;

        PropertyValue pv = new PropertyValue(propertyIdentifier, propertyArrayIndex, listOfElements, null);
        if (localDevice.getEventHandler().checkAllowPropertyWrite(obj, pv)) {
            for (int i = 1; i <= propList.getCount(); i++) {
                Encodable prop = propList.get(i);
                if (prop != null) {
                    for (Encodable rem : listOfElements) {
                        if (prop.equals(rem))
                            propList.remove(i);
                    }
                }
            }
            localDevice.getEventHandler().propertyWritten(obj, pv);
        }
        else
            throw createException(ErrorClass.property, ErrorCode.writeAccessDenied, new UnsignedInteger(1));

        return null;
    }

    private BACnetErrorException createException(ErrorClass errorClass, ErrorCode errorCode,
            UnsignedInteger firstFailedElementNumber) {
        return new BACnetErrorException(new ChangeListError(getChoiceId(), new BACnetError(errorClass, errorCode),
                firstFailedElementNumber));
    }

    @Override
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + ((objectIdentifier == null) ? 0 : objectIdentifier.hashCode());
        result = PRIME * result + ((listOfElements == null) ? 0 : listOfElements.hashCode());
        result = PRIME * result + ((propertyArrayIndex == null) ? 0 : propertyArrayIndex.hashCode());
        result = PRIME * result + ((propertyIdentifier == null) ? 0 : propertyIdentifier.hashCode());
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
        final RemoveListElementRequest other = (RemoveListElementRequest) obj;
        if (objectIdentifier == null) {
            if (other.objectIdentifier != null)
                return false;
        }
        else if (!objectIdentifier.equals(other.objectIdentifier))
            return false;
        if (listOfElements == null) {
            if (other.listOfElements != null)
                return false;
        }
        else if (!listOfElements.equals(other.listOfElements))
            return false;
        if (propertyArrayIndex == null) {
            if (other.propertyArrayIndex != null)
                return false;
        }
        else if (!propertyArrayIndex.equals(other.propertyArrayIndex))
            return false;
        if (propertyIdentifier == null) {
            if (other.propertyIdentifier != null)
                return false;
        }
        else if (!propertyIdentifier.equals(other.propertyIdentifier))
            return false;
        return true;
    }
}
