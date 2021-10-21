/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE ACTUATOR_OUTPUT_STATUS PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * The raw values of the actuator outputs (e.g. on Pixhawk, from MAIN, AUX ports). This message supersedes SERVO_OUTPUT_RAW.
 */
public class msg_actuator_output_status extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_ACTUATOR_OUTPUT_STATUS = 375;
    public static final int MAVLINK_MSG_LENGTH = 140;
    private static final long serialVersionUID = MAVLINK_MSG_ID_ACTUATOR_OUTPUT_STATUS;

      
    /**
     * Timestamp (since system boot).
     */
    public long time_usec;
      
    /**
     * Active outputs
     */
    public long active;
      
    /**
     * Servo / motor output array values. Zero values indicate unused channels.
     */
    public float[] actuator = new float[32];
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_ACTUATOR_OUTPUT_STATUS;
        
        packet.payload.putUnsignedLong(time_usec);
        packet.payload.putUnsignedInt(active);
        
        for (int i = 0; i < actuator.length; i++) {
            packet.payload.putFloat(actuator[i]);
        }
                    
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a actuator_output_status message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.time_usec = payload.getUnsignedLong();
        this.active = payload.getUnsignedInt();
         
        for (int i = 0; i < this.actuator.length; i++) {
            this.actuator[i] = payload.getFloat();
        }
                
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_actuator_output_status() {
        this.msgid = MAVLINK_MSG_ID_ACTUATOR_OUTPUT_STATUS;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_actuator_output_status( long time_usec, long active, float[] actuator) {
        this.msgid = MAVLINK_MSG_ID_ACTUATOR_OUTPUT_STATUS;

        this.time_usec = time_usec;
        this.active = active;
        this.actuator = actuator;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_actuator_output_status( long time_usec, long active, float[] actuator, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_ACTUATOR_OUTPUT_STATUS;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.time_usec = time_usec;
        this.active = active;
        this.actuator = actuator;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_actuator_output_status(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_ACTUATOR_OUTPUT_STATUS;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_actuator_output_status(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_ACTUATOR_OUTPUT_STATUS;

        readJSONheader(jo);
        
         
        if (jo.has("time_usec")) {
            final JSONArray ja_time_usec = jo.optJSONArray("time_usec");
            if (ja_time_usec == null) {
                this.time_usec = jo.optLong("time_usec", 0);
            } else if (ja_time_usec.length() > 0) {
                this.time_usec = ja_time_usec.optLong(0, 0);
            }
        }
                    
        this.active = jo.optLong("active",0);
         
        if (jo.has("actuator")) {
            JSONArray ja_actuator = jo.optJSONArray("actuator");
            if (ja_actuator == null) {
                this.actuator[0] = (float)jo.optDouble("actuator", 0);
            } else {
                for (int i = 0; i < Math.min(this.actuator.length, ja_actuator.length()); i++) {
                    this.actuator[i] = (float)ja_actuator.optDouble(i,0);
                }
            }
        }
                    
        
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    @Override
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("time_usec", time_usec);
        jo.put("active", active);
         
        JSONArray ja_actuator = new JSONArray();
        for (int i = 0; i < this.actuator.length; i++) {
            ja_actuator.put(this.actuator[i]);
        }
        jo.putOpt("actuator", ja_actuator);
                
        
        
        return jo;
    }

          
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_ACTUATOR_OUTPUT_STATUS - sysid:"+sysid+" compid:"+compid+" time_usec:"+time_usec+" active:"+active+" actuator:"+actuator+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_ACTUATOR_OUTPUT_STATUS";
    }
}
        