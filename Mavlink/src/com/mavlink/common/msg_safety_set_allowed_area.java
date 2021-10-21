/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE SAFETY_SET_ALLOWED_AREA PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * Set a safety zone (volume), which is defined by two corners of a cube. This message can be used to tell the MAV which setpoints/waypoints to accept and which to reject. Safety areas are often enforced by national or competition regulations.
 */
public class msg_safety_set_allowed_area extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_SAFETY_SET_ALLOWED_AREA = 54;
    public static final int MAVLINK_MSG_LENGTH = 27;
    private static final long serialVersionUID = MAVLINK_MSG_ID_SAFETY_SET_ALLOWED_AREA;

      
    /**
     * x position 1 / Latitude 1
     */
    public float p1x;
      
    /**
     * y position 1 / Longitude 1
     */
    public float p1y;
      
    /**
     * z position 1 / Altitude 1
     */
    public float p1z;
      
    /**
     * x position 2 / Latitude 2
     */
    public float p2x;
      
    /**
     * y position 2 / Longitude 2
     */
    public float p2y;
      
    /**
     * z position 2 / Altitude 2
     */
    public float p2z;
      
    /**
     * System ID
     */
    public short target_system;
      
    /**
     * Component ID
     */
    public short target_component;
      
    /**
     * Coordinate frame. Can be either global, GPS, right-handed with Z axis up or local, right handed, Z axis down.
     */
    public short frame;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_SAFETY_SET_ALLOWED_AREA;
        
        packet.payload.putFloat(p1x);
        packet.payload.putFloat(p1y);
        packet.payload.putFloat(p1z);
        packet.payload.putFloat(p2x);
        packet.payload.putFloat(p2y);
        packet.payload.putFloat(p2z);
        packet.payload.putUnsignedByte(target_system);
        packet.payload.putUnsignedByte(target_component);
        packet.payload.putUnsignedByte(frame);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a safety_set_allowed_area message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.p1x = payload.getFloat();
        this.p1y = payload.getFloat();
        this.p1z = payload.getFloat();
        this.p2x = payload.getFloat();
        this.p2y = payload.getFloat();
        this.p2z = payload.getFloat();
        this.target_system = payload.getUnsignedByte();
        this.target_component = payload.getUnsignedByte();
        this.frame = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_safety_set_allowed_area() {
        this.msgid = MAVLINK_MSG_ID_SAFETY_SET_ALLOWED_AREA;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_safety_set_allowed_area( float p1x, float p1y, float p1z, float p2x, float p2y, float p2z, short target_system, short target_component, short frame) {
        this.msgid = MAVLINK_MSG_ID_SAFETY_SET_ALLOWED_AREA;

        this.p1x = p1x;
        this.p1y = p1y;
        this.p1z = p1z;
        this.p2x = p2x;
        this.p2y = p2y;
        this.p2z = p2z;
        this.target_system = target_system;
        this.target_component = target_component;
        this.frame = frame;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_safety_set_allowed_area( float p1x, float p1y, float p1z, float p2x, float p2y, float p2z, short target_system, short target_component, short frame, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_SAFETY_SET_ALLOWED_AREA;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.p1x = p1x;
        this.p1y = p1y;
        this.p1z = p1z;
        this.p2x = p2x;
        this.p2y = p2y;
        this.p2z = p2z;
        this.target_system = target_system;
        this.target_component = target_component;
        this.frame = frame;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_safety_set_allowed_area(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_SAFETY_SET_ALLOWED_AREA;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_safety_set_allowed_area(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_SAFETY_SET_ALLOWED_AREA;

        readJSONheader(jo);
        
        this.p1x = (float)jo.optDouble("p1x",0);
        this.p1y = (float)jo.optDouble("p1y",0);
        this.p1z = (float)jo.optDouble("p1z",0);
        this.p2x = (float)jo.optDouble("p2x",0);
        this.p2y = (float)jo.optDouble("p2y",0);
        this.p2z = (float)jo.optDouble("p2z",0);
        this.target_system = (short)jo.optInt("target_system",0);
        this.target_component = (short)jo.optInt("target_component",0);
        this.frame = (short)jo.optInt("frame",0);
        
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    @Override
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("p1x", (double)p1x);
        jo.put("p1y", (double)p1y);
        jo.put("p1z", (double)p1z);
        jo.put("p2x", (double)p2x);
        jo.put("p2y", (double)p2y);
        jo.put("p2z", (double)p2z);
        jo.put("target_system", target_system);
        jo.put("target_component", target_component);
        jo.put("frame", frame);
        
        
        return jo;
    }

                      
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_SAFETY_SET_ALLOWED_AREA - sysid:"+sysid+" compid:"+compid+" p1x:"+p1x+" p1y:"+p1y+" p1z:"+p1z+" p2x:"+p2x+" p2y:"+p2y+" p2z:"+p2z+" target_system:"+target_system+" target_component:"+target_component+" frame:"+frame+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_SAFETY_SET_ALLOWED_AREA";
    }
}
        