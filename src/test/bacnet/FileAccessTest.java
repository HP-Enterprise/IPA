/*
    Copyright (C) 2006-2009 Serotonin Software Technologies Inc.
 	@author Matthew Lohbihler
 */
package test.bacnet;

import java.util.List;

import com.cmos.ipa.protocol.bacnet.LocalDevice;
import com.cmos.ipa.protocol.bacnet.RemoteDevice;
import com.cmos.ipa.protocol.bacnet.service.acknowledgement.AtomicReadFileAck;
import com.cmos.ipa.protocol.bacnet.service.confirmed.AtomicReadFileRequest;
import com.cmos.ipa.protocol.bacnet.service.unconfirmed.WhoIsRequest;
import com.cmos.ipa.protocol.bacnet.type.constructed.SequenceOf;
import com.cmos.ipa.protocol.bacnet.type.enumerated.ObjectType;
import com.cmos.ipa.protocol.bacnet.type.enumerated.PropertyIdentifier;
import com.cmos.ipa.protocol.bacnet.type.primitive.ObjectIdentifier;

/**
 * Use with SlaveDeviceTest
 * 
 * @author Matthew Lohbihler
 */
public class FileAccessTest {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        LocalDevice localDevice = new LocalDevice(1234, "192.168.0.255");
        try {
            localDevice.initialize();
            localDevice.sendBroadcast(2068, new WhoIsRequest(null, null));
            
            Thread.sleep(1000);
            
            RemoteDevice fileDev = null;
            ObjectIdentifier file = null;
            for (RemoteDevice d : localDevice.getRemoteDevices()) {
                localDevice.getExtendedDeviceInformation(d);
                List<ObjectIdentifier> oids = ((SequenceOf<ObjectIdentifier>)localDevice.sendReadPropertyAllowNull(
                        d, d.getObjectIdentifier(), PropertyIdentifier.objectList)).getValues();
                
                for (ObjectIdentifier oid : oids) {
                    if (oid.getObjectType().equals(ObjectType.file)) {
                        fileDev = d;
                        file = oid;
                        break;
                    }
                }
            }
            
            AtomicReadFileRequest request = new AtomicReadFileRequest(file, false, 0, 716);
            AtomicReadFileAck response = (AtomicReadFileAck)localDevice.send(fileDev, request);
            
            System.out.println("eof: "+ response.getEndOfFile());
            System.out.println("start: "+ response.getFileStartPosition());
            System.out.println("data: "+ new String(response.getFileData().getBytes()));
            System.out.println("length: "+ response.getFileData().getBytes().length);
        }
        finally {
            localDevice.terminate();
        }
    }
}
