package test.bacnet;

import com.cmos.ipa.protocol.bacnet.LocalDevice;
import com.cmos.ipa.protocol.bacnet.RemoteDevice;
import com.cmos.ipa.protocol.bacnet.base.BACnetUtils;
import com.cmos.ipa.protocol.bacnet.exception.BACnetException;
import com.cmos.ipa.protocol.bacnet.obj.BACnetObject;
import com.cmos.ipa.protocol.bacnet.type.Encodable;
import com.cmos.ipa.protocol.bacnet.type.constructed.Address;
import com.cmos.ipa.protocol.bacnet.type.constructed.SequenceOf;
import com.cmos.ipa.protocol.bacnet.type.enumerated.ObjectType;
import com.cmos.ipa.protocol.bacnet.type.enumerated.PropertyIdentifier;
import com.cmos.ipa.protocol.bacnet.type.primitive.CharacterString;
import com.cmos.ipa.protocol.bacnet.type.primitive.Real;

/**
 * Tests that the UDP too many segments bug for more than 7 segments is fixed.
 * 
 * @author japearson
 *
 */
public class LargeSegmentTest {
   public static void main(String[] args) throws Exception {

      // Using a LocalDevice with 4000 objects
      int deviceWithObjectsId = 1968;
      int deviceReadId = deviceWithObjectsId + 1;
      final int numberOfObjectsToCreate = 4000;
      
      LocalDevice localDeviceWithLotsOfObjects = new LocalDevice(deviceWithObjectsId, "127.0.0.255");
      
      for ( int i = 1; i <= numberOfObjectsToCreate; i++) {
         BACnetObject av = new BACnetObject(localDeviceWithLotsOfObjects, localDeviceWithLotsOfObjects.getNextInstanceObjectIdentifier(ObjectType.analogValue));
         av.setProperty(PropertyIdentifier.objectName, new CharacterString("Test [" + i + "]"));
         av.setProperty(PropertyIdentifier.relinquishDefault, new Real(i));
         localDeviceWithLotsOfObjects.addObject(av);
      }
      localDeviceWithLotsOfObjects.initialize();
      
      LocalDevice localDevice = new LocalDevice(deviceReadId, "127.0.0.255");
      localDevice.setPort(LocalDevice.DEFAULT_PORT + 1);
      localDevice.initialize();
      Address address = new Address(null,BACnetUtils.dottedStringToBytes("127.0.0.1"),LocalDevice.DEFAULT_PORT);
      RemoteDevice remoteDevice = localDevice.findRemoteDevice(address, null, deviceWithObjectsId);
      localDevice.getExtendedDeviceInformation(remoteDevice);
      
      try {
         // When querying the list of objects
         @SuppressWarnings("unchecked")
         SequenceOf<Encodable> list = (SequenceOf<Encodable>) localDevice.sendReadPropertyAllowNull(remoteDevice, remoteDevice.getObjectIdentifier(), PropertyIdentifier.objectList);

         // The device comes back in the object list, hence the extra 1
         final int expectedNumeberOfProperties = numberOfObjectsToCreate + 1;
         
         // We expect all the objects to come back
         if (list.getCount() == expectedNumeberOfProperties) {
            System.out.println("Correct number of objects returned!");
         }
         else {
            throw new IllegalStateException("Wrong nubmer of objects returned!");
         }
      }
      catch (BACnetException be) {
         System.out.println("Failed to get the objectList, most likely too many segments error.");
         be.printStackTrace();
      }
      finally {
         localDevice.terminate();
         localDeviceWithLotsOfObjects.terminate();
      }
   }
}
