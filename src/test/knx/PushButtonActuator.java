package test.knx;

import com.cmos.ipa.protocol.knx.GroupAddress;
import com.cmos.ipa.protocol.knx.IndividualAddress;
import com.cmos.ipa.protocol.knx.datapoint.Datapoint;
import com.cmos.ipa.protocol.knx.datapoint.StateDP;
import com.cmos.ipa.protocol.knx.device.BaseKnxDevice;
import com.cmos.ipa.protocol.knx.device.KnxDeviceServiceLogic;
import com.cmos.ipa.protocol.knx.dptxlator.DPT;
import com.cmos.ipa.protocol.knx.dptxlator.DPTXlator;
import com.cmos.ipa.protocol.knx.dptxlator.DPTXlatorBoolean;
import com.cmos.ipa.protocol.knx.exception.KNXException;
import com.cmos.ipa.protocol.knx.link.KNXNetworkLink;
import com.cmos.ipa.protocol.knx.link.KNXNetworkLinkIP;
import com.cmos.ipa.protocol.knx.link.medium.KnxIPSettings;

/**
 * A KNX device that acts as 2-state push button actuator (switch) in a KNX
 * installation. It extends upon the provided implementations of a basic KNX
 * device {@link BaseKnxDevice} and the device "logic"
 * {@link KnxDeviceServiceLogic}. In our case of implementing a switch, the
 * logic simply boils down to a boolean state value. Therefore, we only need to
 * implement the update/request methods for our state-based datapoint to handle
 * either a read or write request from the network. The KNX device service logic
 * instance we extend receives and processes all KNX messages, and forwards the
 * relevant read/write requests that are addressed to any of our datapoints.
 * <p>
 * In this example, we are only concerned with KNX process communication for
 * datapoint requests/updates. We will not interact with any KNX device
 * management. Note that KnxDeviceServiceLogic already implements most of the
 * KNX device management logic, too.
 * <p>
 * The actuator can be run as Java program directly in a terminal, and
 * terminated by thread interruption. On the terminal, a running Java program is
 * stopped by using, e.g., Control^C.
 * <p>
 * This example does not show how to implement KNX network links for various KNX
 * transmission media, we limit ourselves to a network link for KNX IP
 * transmission.
 *
 * @author B. Malinowsky
 */
public class PushButtonActuator extends KnxDeviceServiceLogic implements Runnable {
	// Initialize some constants for this example

	// The name/ID of our KNX device. It can be arbitrarily assigned by the user
	// application, e.g.,
	// as human readable name, or some unique ID like
	// "building:1/floor:1/room:3/switch:2".
	private static final String actuatorName = "Push Button 1 (Lounge)";

	// The initial KNX device address of our device.
	// A device's individual address is mainly used for device management (it is
	// not used to access the datapoint to
	// read or write the pushbutton state!)
	private static final IndividualAddress deviceAddress = new IndividualAddress(1, 1, 10);

	// The KNX group address of our push button datapoint.
	// This is the datapoint address for "switching" the button. Several KNX
	// devices can belong to the same datapoint.
	private static final GroupAddress dpAddress = new GroupAddress(1, 0, 3);

	// The datapoint type of our datapoint, because we're a switch we use a
	// boolean with semantics on/off (DPT 1.001)
	private static final DPT dpType = DPTXlatorBoolean.DPT_SWITCH;

	// Member variables of our actuator logic

	// Here it is: the state of our switch, i.e., the current datapoint value
	// because we only have a single datapoint of type Boolean (DPT 1.001),
	// simply use a boolean
	private boolean state;

	// Constructor of our push-button actuator
	public PushButtonActuator() {
		// create and initialize our state-based datapoint with the datapoint
		// address, name, and datapoint type
		final StateDP pushButton = new StateDP(dpAddress, actuatorName, 0, dpType.getID());
		// Every KNX device provides a datapoint model, where all the datapoints
		// of that device are stored.
		// Add the datapoints we are concerned with to the service logic
		// datapoint model. Subsequently, the
		// service logic will notify us about any read/write requests of those
		// datapoints (and only those!).
		getDatapointModel().add(pushButton);
	}

	@Override
	public void updateDatapointValue(final Datapoint ofDp, final DPTXlator update) {
		// This method is called wrt to a KNX process communication write
		// indication service: update our datapoint value
		// In our example of having only a single datapoint, we know it's the
		// pushbutton state
		state = ((DPTXlatorBoolean) update).getValueBoolean();
		System.out.println(ofDp.getName() + " updated to \"" + update.getValue() + "\"");
	}

	@Override
	public DPTXlator requestDatapointValue(final Datapoint ofDp) throws KNXException {
		// This method is called wrt a KNX process communication read request
		// service: respond with our
		// current datapoint value representing the push-button state
		final DPTXlatorBoolean t = new DPTXlatorBoolean(ofDp.getDPT());
		// set our current button state, the translator will translate it
		// accordingly
		t.setValue(state);

		System.out.println("Respond with \"" + t.getValue() + "\" for " + ofDp);
		return t;
	}

	// Creates and runs our push-button actuator
	public static void main(final String[] args) {
		// We need to setup three things:
		// 1) a network link so our push-button can talk to the KNX network
		// 2) the push-button actuator (this class), implementing the individual
		// functionality of a device ("switch")
		// 3) a KNX device which does the background work, ties it all together
		// and brings it to life

		// Create the network link on which KNX messages are received from, and
		// sent on
		// We create a KNX IP link here (it will only work for KNX IP!)
		try {
			final KNXNetworkLink link = new KNXNetworkLinkIP(null, null, new KnxIPSettings(deviceAddress));
			// Create the device logic that deals with the datapoint
			// representing our push button
			final PushButtonActuator logic = new PushButtonActuator();

			// Tie it all together in our KNX device representing the push
			// button
			// The device is initialized with its name, device address, the
			// network link, and device logic
			final BaseKnxDevice device = new BaseKnxDevice(actuatorName, deviceAddress, link, logic);

			// That's it. From here on, our KNX device provides KNX process
			// communication services for our datapoint.
			System.out.println(device + " is up and running, push-button address is " + dpAddress);

			// we use Runnable::run (see method below), to just let the service
			// logic sit idle and wait for messages
			logic.run();
		} catch (final KNXException e) {
			System.out.println("Initializing " + actuatorName + " failed: " + e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println(actuatorName + " has left the building.");
		}
	}

	@Override
	public void run() {
		// wait forever, until interrupted
		try {
			synchronized (this) {
				while (true)
					wait();
			}
		} catch (final InterruptedException e) {
		}
	}
}
