package test.bacnet;

import com.cmos.ipa.protocol.bacnet.LocalDevice;
import com.cmos.ipa.protocol.bacnet.RemoteDevice;
import com.cmos.ipa.protocol.bacnet.event.DefaultDeviceEventListener;
import com.cmos.ipa.protocol.bacnet.service.confirmed.SubscribeCOVRequest;
import com.cmos.ipa.protocol.bacnet.type.constructed.Address;
import com.cmos.ipa.protocol.bacnet.type.constructed.PropertyValue;
import com.cmos.ipa.protocol.bacnet.type.constructed.SequenceOf;
import com.cmos.ipa.protocol.bacnet.type.enumerated.ObjectType;
import com.cmos.ipa.protocol.bacnet.type.primitive.Boolean;
import com.cmos.ipa.protocol.bacnet.type.primitive.ObjectIdentifier;
import com.cmos.ipa.protocol.bacnet.type.primitive.UnsignedInteger;

public class SimpleSubscriptionClient {
    public static void main(String[] args) throws Exception {
        LocalDevice localDevice = new LocalDevice(1234, "255.255.255.255");
        RemoteDevice d = null;
        ObjectIdentifier oid = new ObjectIdentifier(ObjectType.binaryInput, 0);
        ObjectIdentifier aoid = new ObjectIdentifier(ObjectType.analogInput, 0);
        try {
            localDevice.initialize();
            localDevice.getEventHandler().addListener(new Listener());
            localDevice.sendBroadcast(2068, localDevice.getIAm());
            d = localDevice
                    .findRemoteDevice(new Address(new byte[] { (byte) 192, (byte) 168, 0, 2 }, 2068), null, 1968);

            // Subscribe to binary 0
            SubscribeCOVRequest req = new SubscribeCOVRequest(new UnsignedInteger(0), oid, new Boolean(true),
                                                              new UnsignedInteger(0));
            localDevice.send(d, req);

            // Also subscribe to analog 0
            req = new SubscribeCOVRequest(new UnsignedInteger(1), aoid, new Boolean(true),
                    new UnsignedInteger(0));
            localDevice.send(d, req);

            Thread.sleep(22000);
        }
        finally {
            if (d != null)
                // Unsubscribe
               localDevice.send(d, new SubscribeCOVRequest(new UnsignedInteger(0), oid, null, null));
               localDevice.send(d, new SubscribeCOVRequest(new UnsignedInteger(1), aoid, null, null));
            localDevice.terminate();
        }
    }

    static class Listener extends DefaultDeviceEventListener {
        @Override
        public void covNotificationReceived(UnsignedInteger subscriberProcessIdentifier, RemoteDevice initiatingDevice,
                ObjectIdentifier monitoredObjectIdentifier, UnsignedInteger timeRemaining,
                SequenceOf<PropertyValue> listOfValues) {
            System.out.println("Received COV notification: " + listOfValues);
        }
    }
}
