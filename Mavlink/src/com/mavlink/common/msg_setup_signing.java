/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE SETUP_SIGNING PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * Setup a MAVLink2 signing key. If called with secret_key of all zero and zero initial_timestamp will disable signing
 */
public class msg_setup_signing extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_SETUP_SIGNING = 256;
    public static final int MAVLINK_MSG_LENGTH = 42;
    private static final long serialVersionUID = MAVLINK_MSG_ID_SETUP_SIGNING;

      
    /**
     * initial timestamp
     */
    public long initial_timestamp;
      
    /**
     * system id of the target
     */
    public short target_system;
      
    /**
     * component ID of the target
     */
    public short target_component;
      
    /**
     * signing key
     */
    public short[] secret_key = new short[32];
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_SETUP_SIGNING;
        
        packet.payload.putUnsignedLong(initial_timestamp);
        packet.payload.putUnsignedByte(target_system);
        packet.payload.putUnsignedByte(target_component);
        
        for (int i = 0; i < secret_key.length; i++) {
            packet.payload.putUnsignedByte(secret_key[i]);
        }
                    
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a setup_signing message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.initial_timestamp = payload.getUnsignedLong();
        this.target_system = payload.getUnsignedByte();
        this.target_component = payload.getUnsignedByte();
         
        for (int i = 0; i < this.secret_key.length; i++) {
            this.secret_key[i] = payload.getUnsignedByte();
        }
                
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_setup_signing() {
        this.msgid = MAVLINK_MSG_ID_SETUP_SIGNING;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_setup_signing( long initial_timestamp, short target_system, short target_component, short[] secret_key) {
        this.msgid = MAVLINK_MSG_ID_SETUP_SIGNING;

        this.initial_timestamp = initial_timestamp;
        this.target_system = target_system;
        this.target_component = target_component;
        this.secret_key = secret_key;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_setup_signing( long initial_timestamp, short target_system, short target_component, short[] secret_key, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_SETUP_SIGNING;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.initial_timestamp = initial_timestamp;
        this.target_system = target_system;
        this.target_component = target_component;
        this.secret_key = secret_key;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_setup_signing(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_SETUP_SIGNING;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_setup_signing(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_SETUP_SIGNING;

        readJSONheader(jo);
        
         
        if (jo.has("initial_timestamp")) {
            final JSONArray ja_initial_timestamp = jo.optJSONArray("initial_timestamp");
            if (ja_initial_timestamp == null) {
                this.initial_timestamp = jo.optLong("initial_timestamp", 0);
            } else if (ja_initial_timestamp.length() > 0) {
                this.initial_timestamp = ja_initial_timestamp.optLong(0, 0);
            }
        }
                    
        this.target_system = (short)jo.optInt("target_system",0);
        this.target_component = (short)jo.optInt("target_component",0);
         
        if (jo.has("secret_key")) {
            JSONArray ja_secret_key = jo.optJSONArray("secret_key");
            if (ja_secret_key == null) {
                this.secret_key[0] = (short)jo.optInt("secret_key", 0);
            } else {
                for (int i = 0; i < Math.min(this.secret_key.length, ja_secret_key.length()); i++) {
                    this.secret_key[i] = (short)ja_secret_key.optInt(i,0);
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
        
        jo.put("initial_timestamp", initial_timestamp);
        jo.put("target_system", target_system);
        jo.put("target_component", target_component);
         
        JSONArray ja_secret_key = new JSONArray();
        for (int i = 0; i < this.secret_key.length; i++) {
            ja_secret_key.put(this.secret_key[i]);
        }
        jo.putOpt("secret_key", ja_secret_key);
                
        
        
        return jo;
    }

            
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_SETUP_SIGNING - sysid:"+sysid+" compid:"+compid+" initial_timestamp:"+initial_timestamp+" target_system:"+target_system+" target_component:"+target_component+" secret_key:"+secret_key+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_SETUP_SIGNING";
    }
}
        