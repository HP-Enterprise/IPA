/*
    Copyright (C) 2006-2007 Serotonin Software Technologies Inc.
 	@author Matthew Lohbihler
 */
package test.modbus;

import com.cmos.ipa.protocol.modbus.ModbusFactory;
import com.cmos.ipa.protocol.modbus.ModbusLocator;
import com.cmos.ipa.protocol.modbus.ModbusMaster;
import com.cmos.ipa.protocol.modbus.code.DataType;
import com.cmos.ipa.protocol.modbus.code.RegisterRange;
import com.cmos.ipa.protocol.modbus.ip.IpParameters;

/**
 * @author Matthew Lohbihler
 */
public class Test2 {
    public static void main(String[] args) throws Exception {
        IpParameters params = new IpParameters();
        params.setHost("192.168.100.66");
        params.setPort(502);

        ModbusMaster master = new ModbusFactory().createTcpMaster(params, false);
        master.init();

        //测试是否有当前点位
        System.out.println(master.testSlaveNode(0));
//        System.out.println(master);
        //根据不同的点位得到不同的值
        // Define the point locator.
        ModbusLocator loc = new ModbusLocator(1, RegisterRange.HOLDING_REGISTER, 13, DataType.TWO_BYTE_INT_UNSIGNED);
        ModbusLocator loc1 = new ModbusLocator(1, RegisterRange.HOLDING_REGISTER,1, DataType.TWO_BYTE_INT_UNSIGNED);
        // Set the point value
        master.setValue(loc, 100);
        // Get the point value
        System.out.println(master.getValue(loc));
        System.out.println(master.getValue(loc1));
    }
}
