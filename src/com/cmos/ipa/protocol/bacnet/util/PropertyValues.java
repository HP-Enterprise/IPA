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
package com.cmos.ipa.protocol.bacnet.util;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.cmos.ipa.protocol.bacnet.exception.PropertyValueException;
import com.cmos.ipa.protocol.bacnet.type.Encodable;
import com.cmos.ipa.protocol.bacnet.type.constructed.BACnetError;
import com.cmos.ipa.protocol.bacnet.type.constructed.ObjectPropertyReference;
import com.cmos.ipa.protocol.bacnet.type.constructed.PropertyReference;
import com.cmos.ipa.protocol.bacnet.type.enumerated.PropertyIdentifier;
import com.cmos.ipa.protocol.bacnet.type.primitive.ObjectIdentifier;
import com.cmos.ipa.protocol.bacnet.type.primitive.UnsignedInteger;

public class PropertyValues implements Iterable<ObjectPropertyReference>, Serializable {
    private static final long serialVersionUID = 5880275533969236369L;

    private final Map<ObjectPropertyReference, Encodable> values = new HashMap<ObjectPropertyReference, Encodable>();

    public void add(ObjectIdentifier oid, PropertyIdentifier pid, UnsignedInteger pin, Encodable value) {
        values.put(new ObjectPropertyReference(oid, pid, pin), value);
    }

    public Encodable getNoErrorCheck(ObjectPropertyReference opr) {
        return values.get(opr);
    }

    public Encodable get(ObjectPropertyReference opr) throws PropertyValueException {
        Encodable e = getNoErrorCheck(opr);

        if (e instanceof BACnetError)
            throw new PropertyValueException((BACnetError) e);

        return e;
    }

    public Encodable getNoErrorCheck(ObjectIdentifier oid, PropertyReference ref) {
        return getNoErrorCheck(new ObjectPropertyReference(oid, ref.getPropertyIdentifier(),
                ref.getPropertyArrayIndex()));
    }

    public Encodable getNoErrorCheck(ObjectIdentifier oid, PropertyIdentifier pid) {
        return getNoErrorCheck(new ObjectPropertyReference(oid, pid));
    }

    public Encodable get(ObjectIdentifier oid, PropertyIdentifier pid) throws PropertyValueException {
        return get(new ObjectPropertyReference(oid, pid));
    }

    public Encodable getNullOnError(ObjectIdentifier oid, PropertyIdentifier pid) {
        Encodable e = getNoErrorCheck(new ObjectPropertyReference(oid, pid));

        if (e instanceof BACnetError)
            return null;

        return e;
    }

    public String getString(ObjectIdentifier oid, PropertyIdentifier pid) {
        Encodable value = getNoErrorCheck(oid, pid);
        if (value == null)
            return null;
        return value.toString();
    }

    public String getString(ObjectIdentifier oid, PropertyIdentifier pid, String defaultValue) {
        Encodable value = getNoErrorCheck(oid, pid);
        if (value == null || value instanceof BACnetError)
            return defaultValue;
        return value.toString();
    }

    public Iterator<ObjectPropertyReference> iterator() {
        return values.keySet().iterator();
    }
}
