package test.knx;

import java.net.InetSocketAddress;

import com.cmos.ipa.protocol.knx.GroupAddress;
import com.cmos.ipa.protocol.knx.datapoint.StateDP;
import com.cmos.ipa.protocol.knx.dptxlator.DPTXlatorBoolean;
import com.cmos.ipa.protocol.knx.exception.KNXException;
import com.cmos.ipa.protocol.knx.link.KNXNetworkLink;
import com.cmos.ipa.protocol.knx.link.KNXNetworkLinkIP;
import com.cmos.ipa.protocol.knx.link.medium.TPSettings;
import com.cmos.ipa.protocol.knx.process.ProcessCommunicator;
import com.cmos.ipa.protocol.knx.process.ProcessCommunicatorImpl;

/**
 * 测试前先启动PushButtonActuator
 * @author Ouyangqiao
 *
 */
public class KnxReadWriteTest {
	public static void main(String[] args){
		try {
			GroupAddress ga = new GroupAddress(1,0,3);
			write(ga, "on");
			assert("on".equals(read(ga)));
			System.out.println("read "+ ga.toString() +  " [read value:"+ read(ga)+"]");
		} catch (KNXException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static String read(GroupAddress ga) throws KNXException, InterruptedException {
		//默认组播地址与端口
		InetSocketAddress remote = new InetSocketAddress("224.0.23.12", 3761);
		KNXNetworkLink lnk = new KNXNetworkLinkIP(KNXNetworkLinkIP.ROUTING, null, remote, false, TPSettings.TP1);
		ProcessCommunicator pc = new ProcessCommunicatorImpl(lnk);
		StateDP dp = new StateDP(ga, "tmp", 0, DPTXlatorBoolean.DPT_SWITCH.getID());
		return pc.read(dp);
	}
	
	public static void write(GroupAddress ga, String value) throws KNXException, InterruptedException{
		KNXNetworkLink lnk = new KNXNetworkLinkIP(KNXNetworkLinkIP.ROUTING, null, null, false, TPSettings.TP1);
		ProcessCommunicator pc = new ProcessCommunicatorImpl(lnk);
		StateDP dp = new StateDP(ga, "tmp", 0, DPTXlatorBoolean.DPT_SWITCH.getID());
		pc.write(dp, value);
	}
}
