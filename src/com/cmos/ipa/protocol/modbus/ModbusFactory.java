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
 */
package com.cmos.ipa.protocol.modbus;

import com.cmos.ipa.protocol.modbus.ip.IpParameters;
import com.cmos.ipa.protocol.modbus.ip.tcp.TcpMaster;
import com.cmos.ipa.protocol.modbus.ip.tcp.TcpSlave;
import com.cmos.ipa.protocol.modbus.ip.udp.UdpMaster;
import com.cmos.ipa.protocol.modbus.ip.udp.UdpSlave;
import com.cmos.ipa.protocol.modbus.serial.ascii.AsciiMaster;
import com.cmos.ipa.protocol.modbus.serial.ascii.AsciiSlave;
import com.cmos.ipa.protocol.modbus.serial.rtu.RtuMaster;
import com.cmos.ipa.protocol.modbus.serial.rtu.RtuSlave;
import com.serotonin.io.serial.SerialParameters;

public class ModbusFactory {
    //
    // Modbus masters
    //
    public ModbusMaster createRtuMaster(SerialParameters params) {
        return new RtuMaster(params);
    }

    public ModbusMaster createAsciiMaster(SerialParameters params) {
        return new AsciiMaster(params);
    }

    public ModbusMaster createTcpMaster(IpParameters params, boolean keepAlive) {
        return new TcpMaster(params, keepAlive);
    }

    public ModbusMaster createUdpMaster(IpParameters params) {
        return new UdpMaster(params);
    }

    //
    // Modbus slaves
    //
    public ModbusSlaveSet createRtuSlave(SerialParameters params) {
        return new RtuSlave(params);
    }

    public ModbusSlaveSet createAsciiSlave(SerialParameters params) {
        return new AsciiSlave(params);
    }

    public ModbusSlaveSet createTcpSlave(boolean encapsulated) {
        return new TcpSlave(encapsulated);
    }

    public ModbusSlaveSet createUdpSlave(boolean encapsulated) {
        return new UdpSlave(encapsulated);
    }
}
