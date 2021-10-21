/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE GOPRO_HEARTBEAT PACKING
package com.mavlink.ardupilotmega;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * Heartbeat from a HeroBus attached GoPro.
 */
public class msg_gopro_heartbeat extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_GOPRO_HEARTBEAT = 215;
    public static final int MAVLINK_MSG_LENGTH = 3;
    private static final long serialVersionUID = MAVLINK_MSG_ID_GOPRO_HEARTBEAT;

      
    /**
     * Status.
     */
    public short status;
      
    /**
     * Current capture mode.
     */
    public short capture_mode;
      
    /**
     * Additional status bits.
     */
    public short flags;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_GOPRO_HEARTBEAT;
        
        packet.payload.putUnsignedByte(status);
        packet.payload.putUnsignedByte(capture_mode);
        packet.payload.putUnsignedByte(flags);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a gopro_heartbeat message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.status = payload.getUnsignedByte();
        this.capture_mode = payload.getUnsignedByte();
        this.flags = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_gopro_heartbeat() {
        this.msgid = MAVLINK_MSG_ID_GOPRO_HEARTBEAT;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_gopro_heartbeat( short status, short capture_mode, short flags) {
        this.msgid = MAVLINK_MSG_ID_GOPRO_HEARTBEAT;

        this.status = status;
        this.capture_mode = capture_mode;
        this.flags = flags;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_gopro_heartbeat( short status, short capture_mode, short flags, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_GOPRO_HEARTBEAT;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.status = status;
        this.capture_mode = capture_mode;
        this.flags = flags;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_gopro_heartbeat(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_GOPRO_HEARTBEAT;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_gopro_heartbeat(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_GOPRO_HEARTBEAT;

        readJSONheader(jo);
        
        this.status = (short)jo.optInt("status",0);
        this.capture_mode = (short)jo.optInt("capture_mode",0);
        this.flags = (short)jo.optInt("flags",0);
        
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    @Override
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("status", status);
        jo.put("capture_mode", capture_mode);
        jo.put("flags", flags);
        
        
        return jo;
    }

          
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_GOPRO_HEARTBEAT - sysid:"+sysid+" compid:"+compid+" status:"+status+" capture_mode:"+capture_mode+" flags:"+flags+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_GOPRO_HEARTBEAT";
    }
}
        