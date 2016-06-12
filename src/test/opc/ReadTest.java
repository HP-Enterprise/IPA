package test.opc;

import java.util.Arrays;

import javafish.clients.opc.JOpc;
import javafish.clients.opc.browser.JOpcBrowser;
import javafish.clients.opc.component.OpcGroup;
import javafish.clients.opc.component.OpcItem;
import javafish.clients.opc.exception.CoInitializeException;
import javafish.clients.opc.exception.ComponentNotFoundException;
import javafish.clients.opc.exception.ConnectivityException;
import javafish.clients.opc.exception.SynchReadException;
import javafish.clients.opc.exception.UnableAddGroupException;
import javafish.clients.opc.exception.UnableAddItemException;
import javafish.clients.opc.exception.UnableBrowseBranchException;
import javafish.clients.opc.exception.UnableIBrowseException;

public class ReadTest {
	//远程读取时需配置本地windows账号密码与服务器一致
	public static String SERVER_HOST = "192.168.100.66";
	//public static String SERVER_HOST = "127.0.0.1";

	public static void main(String[] args) {
		groupRead();
		//scanRead();
	}

	public static void scanRead() {
		try {
			JOpc.coInitialize();
		} catch (CoInitializeException e1) {
			e1.printStackTrace();
		}

		JOpc jopc = new JOpc(SERVER_HOST, "Matrikon.OPC.Simulation.1", "JOPCBrowser1");

		JOpcBrowser jbrowser = new JOpcBrowser(SERVER_HOST, "Matrikon.OPC.Simulation.1", "JOPCBrowser1");
		try {
			jbrowser.connect();
			String[] branches = jbrowser.getOpcBranch("");
			System.out.println(Arrays.asList(branches));
			String[] items = jbrowser.getOpcItems("Configured Aliases", false);
			if (items != null) {
				OpcGroup group = new OpcGroup("group0", true, 10, 0.0f);
				for (int i = 0; i < items.length; i++) {
					// System.out.println(items[i]);
					group.addItem(new OpcItem(getItemName(items[i]).trim(), true, ""));
				}
				jopc.addGroup(group);
				try {
					jopc.connect();
					System.out.println("JOPC client is connected...");
				} catch (ConnectivityException e2) {
					e2.printStackTrace();
				}
				try {
					jopc.registerGroups();
					System.out.println("OPCGroup are registered...");
				} catch (UnableAddGroupException e2) {
					e2.printStackTrace();
				} catch (UnableAddItemException e2) {
					e2.printStackTrace();
				}
				try {
					OpcGroup responseGroup = jopc.synchReadGroup(group);
					for (OpcItem item : responseGroup.getItems()) {
						System.out.println(item.getItemName() + "," + item.getValue());
					}
				} catch (ComponentNotFoundException e) {
					e.printStackTrace();
				} catch (SynchReadException e) {
					e.printStackTrace();
				}
			}
		} catch (ConnectivityException e) {
			e.printStackTrace();
		} catch (UnableBrowseBranchException e) {
			e.printStackTrace();
		} catch (UnableIBrowseException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void groupRead() {
		try {
			JOpc.coInitialize();
		} catch (CoInitializeException e1) {
			e1.printStackTrace();
		}

		JOpc jopc = new JOpc(SERVER_HOST, "Matrikon.OPC.Simulation.1", "JOPC1");
		OpcItem item1 = new OpcItem(".A1", true, "");
		OpcItem item2 = new OpcItem(".A2", true, "");

		OpcGroup group = new OpcGroup("group0", true, 10, 0.0f);

		group.addItem(item1);
		group.addItem(item2);

		jopc.addGroup(group);

		try {
			jopc.connect();
			System.out.println("JOPC client is connected...");
		} catch (ConnectivityException e2) {
			e2.printStackTrace();
		}
		try {
			jopc.registerGroups();
			System.out.println("OPCGroup are registered...");
		} catch (UnableAddGroupException e2) {
			e2.printStackTrace();
		} catch (UnableAddItemException e2) {
			e2.printStackTrace();
		}

		try {
			OpcGroup responseGroup = jopc.synchReadGroup(group);
			for (OpcItem item : responseGroup.getItems()) {
				System.out.println(item.getItemName() + "," + item.getValue());
			}
		} catch (ComponentNotFoundException e) {
			e.printStackTrace();
		} catch (SynchReadException e) {
			e.printStackTrace();
		}
	}

	public static String getItemName(String str) {
		String[] arr = str.split(";");
		if (arr.length >= 3) {
			return arr[2];
		}
		return null;
	}
}
