/*
    Copyright (C) 2006-2009 Serotonin Software Technologies Inc.
 	@author Matthew Lohbihler
 */
package test.bacnet;

import com.cmos.ipa.protocol.bacnet.LocalDevice;
import com.cmos.ipa.protocol.bacnet.Network;
import com.cmos.ipa.protocol.bacnet.RemoteDevice;
import com.cmos.ipa.protocol.bacnet.base.BACnetUtils;
import com.cmos.ipa.protocol.bacnet.type.Encodable;
import com.cmos.ipa.protocol.bacnet.type.constructed.Address;
import com.cmos.ipa.protocol.bacnet.type.constructed.SequenceOf;
import com.cmos.ipa.protocol.bacnet.type.enumerated.PropertyIdentifier;

/**
 * @author Matthew Lohbihler
 */
public class QuickTest {
    public static void main(String[] args) throws Exception {
        LocalDevice localDevice = new LocalDevice(1234, "192.168.0.255");
        try {
            localDevice.initialize();

            Network network = new Network(2001, "47");
            Address address = new Address(null, BACnetUtils.dottedStringToBytes("207.241.56.207"), 0xBAC0);
            RemoteDevice d = localDevice.findRemoteDevice(address, network, 3052);

            localDevice.getExtendedDeviceInformation(d);

            //localDevice.setMaxReadMultipleReferencesNonsegmented(09);
            long start = System.currentTimeMillis();
            @SuppressWarnings("unchecked")
            SequenceOf<Encodable> list = (SequenceOf<Encodable>) localDevice.sendReadPropertyAllowNull(d,
                    d.getObjectIdentifier(), PropertyIdentifier.objectList);
            System.out.println("Read " + list.getCount() + " values read in " + (System.currentTimeMillis() - start));

            System.out.println(list);
        }
        finally {
            localDevice.terminate();
        }
    }
}
