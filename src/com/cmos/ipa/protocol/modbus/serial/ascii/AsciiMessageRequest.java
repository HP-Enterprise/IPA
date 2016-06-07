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
package com.cmos.ipa.protocol.modbus.serial.ascii;

import com.cmos.ipa.protocol.modbus.exception.ModbusTransportException;
import com.cmos.ipa.protocol.modbus.msg.ModbusMessage;
import com.cmos.ipa.protocol.modbus.msg.ModbusRequest;
import com.serotonin.messaging.IncomingRequestMessage;
import com.serotonin.messaging.OutgoingRequestMessage;
import com.serotonin.util.queue.ByteQueue;

public class AsciiMessageRequest extends AsciiMessage implements OutgoingRequestMessage, IncomingRequestMessage {
    static AsciiMessageRequest createAsciiMessageRequest(ByteQueue queue) throws ModbusTransportException {
        ByteQueue msgQueue = getUnasciiMessage(queue);
        ModbusRequest request = ModbusRequest.createModbusRequest(msgQueue);
        AsciiMessageRequest asciiRequest = new AsciiMessageRequest(request);

        // Return the data.
        return asciiRequest;
    }

    public AsciiMessageRequest(ModbusMessage modbusMessage) {
        super(modbusMessage);
    }

    @Override
    public boolean expectsResponse() {
        return modbusMessage.getSlaveId() != 0;
    }

    public ModbusRequest getModbusRequest() {
        return (ModbusRequest) modbusMessage;
    }
}