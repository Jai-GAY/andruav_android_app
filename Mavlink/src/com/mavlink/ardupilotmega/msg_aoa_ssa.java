/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE AOA_SSA PACKING
package com.mavlink.ardupilotmega;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * Angle of Attack and Side Slip Angle.
 */
public class msg_aoa_ssa extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_AOA_SSA = 11020;
    public static final int MAVLINK_MSG_LENGTH = 16;
    private static final long serialVersionUID = MAVLINK_MSG_ID_AOA_SSA;

      
    /**
     * Timestamp (since boot or Unix epoch).
     */
    public long time_usec;
      
    /**
     * Angle of Attack.
     */
    public float AOA;
      
    /**
     * Side Slip Angle.
     */
    public float SSA;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_AOA_SSA;
        
        packet.payload.putUnsignedLong(time_usec);
        packet.payload.putFloat(AOA);
        packet.payload.putFloat(SSA);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a aoa_ssa message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.time_usec = payload.getUnsignedLong();
        this.AOA = payload.getFloat();
        this.SSA = payload.getFloat();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_aoa_ssa() {
        this.msgid = MAVLINK_MSG_ID_AOA_SSA;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_aoa_ssa( long time_usec, float AOA, float SSA) {
        this.msgid = MAVLINK_MSG_ID_AOA_SSA;

        this.time_usec = time_usec;
        this.AOA = AOA;
        this.SSA = SSA;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_aoa_ssa( long time_usec, float AOA, float SSA, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_AOA_SSA;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.time_usec = time_usec;
        this.AOA = AOA;
        this.SSA = SSA;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_aoa_ssa(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_AOA_SSA;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_aoa_ssa(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_AOA_SSA;

        readJSONheader(jo);
        
         
        if (jo.has("time_usec")) {
            final JSONArray ja_time_usec = jo.optJSONArray("time_usec");
            if (ja_time_usec == null) {
                this.time_usec = jo.optLong("time_usec", 0);
            } else if (ja_time_usec.length() > 0) {
                this.time_usec = ja_time_usec.optLong(0, 0);
            }
        }
                    
        this.AOA = (float)jo.optDouble("AOA",0);
        this.SSA = (float)jo.optDouble("SSA",0);
        
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    @Override
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("time_usec", time_usec);
        jo.put("AOA", (double)AOA);
        jo.put("SSA", (double)SSA);
        
        
        return jo;
    }

          
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_AOA_SSA - sysid:"+sysid+" compid:"+compid+" time_usec:"+time_usec+" AOA:"+AOA+" SSA:"+SSA+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_AOA_SSA";
    }
}
        