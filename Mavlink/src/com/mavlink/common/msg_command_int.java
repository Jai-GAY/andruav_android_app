/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE COMMAND_INT PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * Message encoding a command with parameters as scaled integers. Scaling depends on the actual command value. The command microservice is documented at https://mavlink.io/en/services/command.html
 */
public class msg_command_int extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_COMMAND_INT = 75;
    public static final int MAVLINK_MSG_LENGTH = 35;
    private static final long serialVersionUID = MAVLINK_MSG_ID_COMMAND_INT;

      
    /**
     * PARAM1, see MAV_CMD enum
     */
    public float param1;
      
    /**
     * PARAM2, see MAV_CMD enum
     */
    public float param2;
      
    /**
     * PARAM3, see MAV_CMD enum
     */
    public float param3;
      
    /**
     * PARAM4, see MAV_CMD enum
     */
    public float param4;
      
    /**
     * PARAM5 / local: x position in meters * 1e4, global: latitude in degrees * 10^7
     */
    public int x;
      
    /**
     * PARAM6 / local: y position in meters * 1e4, global: longitude in degrees * 10^7
     */
    public int y;
      
    /**
     * PARAM7 / z position: global: altitude in meters (relative or absolute, depending on frame).
     */
    public float z;
      
    /**
     * The scheduled action for the mission item.
     */
    public int command;
      
    /**
     * System ID
     */
    public short target_system;
      
    /**
     * Component ID
     */
    public short target_component;
      
    /**
     * The coordinate system of the COMMAND.
     */
    public short frame;
      
    /**
     * false:0, true:1
     */
    public short current;
      
    /**
     * autocontinue to next wp
     */
    public short autocontinue;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_COMMAND_INT;
        
        packet.payload.putFloat(param1);
        packet.payload.putFloat(param2);
        packet.payload.putFloat(param3);
        packet.payload.putFloat(param4);
        packet.payload.putInt(x);
        packet.payload.putInt(y);
        packet.payload.putFloat(z);
        packet.payload.putUnsignedShort(command);
        packet.payload.putUnsignedByte(target_system);
        packet.payload.putUnsignedByte(target_component);
        packet.payload.putUnsignedByte(frame);
        packet.payload.putUnsignedByte(current);
        packet.payload.putUnsignedByte(autocontinue);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a command_int message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.param1 = payload.getFloat();
        this.param2 = payload.getFloat();
        this.param3 = payload.getFloat();
        this.param4 = payload.getFloat();
        this.x = payload.getInt();
        this.y = payload.getInt();
        this.z = payload.getFloat();
        this.command = payload.getUnsignedShort();
        this.target_system = payload.getUnsignedByte();
        this.target_component = payload.getUnsignedByte();
        this.frame = payload.getUnsignedByte();
        this.current = payload.getUnsignedByte();
        this.autocontinue = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_command_int() {
        this.msgid = MAVLINK_MSG_ID_COMMAND_INT;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_command_int( float param1, float param2, float param3, float param4, int x, int y, float z, int command, short target_system, short target_component, short frame, short current, short autocontinue) {
        this.msgid = MAVLINK_MSG_ID_COMMAND_INT;

        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
        this.param4 = param4;
        this.x = x;
        this.y = y;
        this.z = z;
        this.command = command;
        this.target_system = target_system;
        this.target_component = target_component;
        this.frame = frame;
        this.current = current;
        this.autocontinue = autocontinue;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_command_int( float param1, float param2, float param3, float param4, int x, int y, float z, int command, short target_system, short target_component, short frame, short current, short autocontinue, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_COMMAND_INT;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
        this.param4 = param4;
        this.x = x;
        this.y = y;
        this.z = z;
        this.command = command;
        this.target_system = target_system;
        this.target_component = target_component;
        this.frame = frame;
        this.current = current;
        this.autocontinue = autocontinue;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_command_int(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_COMMAND_INT;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_command_int(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_COMMAND_INT;

        readJSONheader(jo);
        
        this.param1 = (float)jo.optDouble("param1",0);
        this.param2 = (float)jo.optDouble("param2",0);
        this.param3 = (float)jo.optDouble("param3",0);
        this.param4 = (float)jo.optDouble("param4",0);
        this.x = jo.optInt("x",0);
        this.y = jo.optInt("y",0);
        this.z = (float)jo.optDouble("z",0);
        this.command = jo.optInt("command",0);
        this.target_system = (short)jo.optInt("target_system",0);
        this.target_component = (short)jo.optInt("target_component",0);
        this.frame = (short)jo.optInt("frame",0);
        this.current = (short)jo.optInt("current",0);
        this.autocontinue = (short)jo.optInt("autocontinue",0);
        
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    @Override
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("param1", (double)param1);
        jo.put("param2", (double)param2);
        jo.put("param3", (double)param3);
        jo.put("param4", (double)param4);
        jo.put("x", x);
        jo.put("y", y);
        jo.put("z", (double)z);
        jo.put("command", command);
        jo.put("target_system", target_system);
        jo.put("target_component", target_component);
        jo.put("frame", frame);
        jo.put("current", current);
        jo.put("autocontinue", autocontinue);
        
        
        return jo;
    }

                              
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_COMMAND_INT - sysid:"+sysid+" compid:"+compid+" param1:"+param1+" param2:"+param2+" param3:"+param3+" param4:"+param4+" x:"+x+" y:"+y+" z:"+z+" command:"+command+" target_system:"+target_system+" target_component:"+target_component+" frame:"+frame+" current:"+current+" autocontinue:"+autocontinue+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_COMMAND_INT";
    }
}
        