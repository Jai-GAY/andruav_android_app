/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE SCALED_PRESSURE3 PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * Barometer readings for 3rd barometer
 */
public class msg_scaled_pressure3 extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_SCALED_PRESSURE3 = 143;
    public static final int MAVLINK_MSG_LENGTH = 16;
    private static final long serialVersionUID = MAVLINK_MSG_ID_SCALED_PRESSURE3;

      
    /**
     * Timestamp (time since system boot).
     */
    public long time_boot_ms;
      
    /**
     * Absolute pressure
     */
    public float press_abs;
      
    /**
     * Differential pressure
     */
    public float press_diff;
      
    /**
     * Absolute pressure temperature
     */
    public short temperature;
      
    /**
     * Differential pressure temperature
     */
    public short temperature_press_diff;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_SCALED_PRESSURE3;
        
        packet.payload.putUnsignedInt(time_boot_ms);
        packet.payload.putFloat(press_abs);
        packet.payload.putFloat(press_diff);
        packet.payload.putShort(temperature);
        
        if (isMavlink2) {
             packet.payload.putShort(temperature_press_diff);
            
        }
        return packet;
    }

    /**
     * Decode a scaled_pressure3 message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.time_boot_ms = payload.getUnsignedInt();
        this.press_abs = payload.getFloat();
        this.press_diff = payload.getFloat();
        this.temperature = payload.getShort();
        
        if (isMavlink2) {
             this.temperature_press_diff = payload.getShort();
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_scaled_pressure3() {
        this.msgid = MAVLINK_MSG_ID_SCALED_PRESSURE3;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_scaled_pressure3( long time_boot_ms, float press_abs, float press_diff, short temperature, short temperature_press_diff) {
        this.msgid = MAVLINK_MSG_ID_SCALED_PRESSURE3;

        this.time_boot_ms = time_boot_ms;
        this.press_abs = press_abs;
        this.press_diff = press_diff;
        this.temperature = temperature;
        this.temperature_press_diff = temperature_press_diff;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_scaled_pressure3( long time_boot_ms, float press_abs, float press_diff, short temperature, short temperature_press_diff, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_SCALED_PRESSURE3;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.time_boot_ms = time_boot_ms;
        this.press_abs = press_abs;
        this.press_diff = press_diff;
        this.temperature = temperature;
        this.temperature_press_diff = temperature_press_diff;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_scaled_pressure3(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_SCALED_PRESSURE3;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_scaled_pressure3(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_SCALED_PRESSURE3;

        readJSONheader(jo);
        
        this.time_boot_ms = jo.optLong("time_boot_ms",0);
        this.press_abs = (float)jo.optDouble("press_abs",0);
        this.press_diff = (float)jo.optDouble("press_diff",0);
        this.temperature = (short)jo.optInt("temperature",0);
        
        this.temperature_press_diff = (short)jo.optInt("temperature_press_diff",0);
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    @Override
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("time_boot_ms", time_boot_ms);
        jo.put("press_abs", (double)press_abs);
        jo.put("press_diff", (double)press_diff);
        jo.put("temperature", temperature);
        
        jo.put("temperature_press_diff", temperature_press_diff);
        
        return jo;
    }

              
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_SCALED_PRESSURE3 - sysid:"+sysid+" compid:"+compid+" time_boot_ms:"+time_boot_ms+" press_abs:"+press_abs+" press_diff:"+press_diff+" temperature:"+temperature+" temperature_press_diff:"+temperature_press_diff+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_SCALED_PRESSURE3";
    }
}
        