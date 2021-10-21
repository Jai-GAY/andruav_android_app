/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE REMOTE_LOG_DATA_BLOCK PACKING
package com.mavlink.ardupilotmega;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * Send a block of log data to remote location.
 */
public class msg_remote_log_data_block extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_REMOTE_LOG_DATA_BLOCK = 184;
    public static final int MAVLINK_MSG_LENGTH = 206;
    private static final long serialVersionUID = MAVLINK_MSG_ID_REMOTE_LOG_DATA_BLOCK;

      
    /**
     * Log data block sequence number.
     */
    public long seqno;
      
    /**
     * System ID.
     */
    public short target_system;
      
    /**
     * Component ID.
     */
    public short target_component;
      
    /**
     * Log data block.
     */
    public short[] data = new short[200];
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_REMOTE_LOG_DATA_BLOCK;
        
        packet.payload.putUnsignedInt(seqno);
        packet.payload.putUnsignedByte(target_system);
        packet.payload.putUnsignedByte(target_component);
        
        for (int i = 0; i < data.length; i++) {
            packet.payload.putUnsignedByte(data[i]);
        }
                    
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a remote_log_data_block message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.seqno = payload.getUnsignedInt();
        this.target_system = payload.getUnsignedByte();
        this.target_component = payload.getUnsignedByte();
         
        for (int i = 0; i < this.data.length; i++) {
            this.data[i] = payload.getUnsignedByte();
        }
                
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_remote_log_data_block() {
        this.msgid = MAVLINK_MSG_ID_REMOTE_LOG_DATA_BLOCK;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_remote_log_data_block( long seqno, short target_system, short target_component, short[] data) {
        this.msgid = MAVLINK_MSG_ID_REMOTE_LOG_DATA_BLOCK;

        this.seqno = seqno;
        this.target_system = target_system;
        this.target_component = target_component;
        this.data = data;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_remote_log_data_block( long seqno, short target_system, short target_component, short[] data, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_REMOTE_LOG_DATA_BLOCK;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.seqno = seqno;
        this.target_system = target_system;
        this.target_component = target_component;
        this.data = data;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_remote_log_data_block(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_REMOTE_LOG_DATA_BLOCK;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_remote_log_data_block(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_REMOTE_LOG_DATA_BLOCK;

        readJSONheader(jo);
        
        this.seqno = jo.optLong("seqno",0);
        this.target_system = (short)jo.optInt("target_system",0);
        this.target_component = (short)jo.optInt("target_component",0);
         
        if (jo.has("data")) {
            JSONArray ja_data = jo.optJSONArray("data");
            if (ja_data == null) {
                this.data[0] = (short)jo.optInt("data", 0);
            } else {
                for (int i = 0; i < Math.min(this.data.length, ja_data.length()); i++) {
                    this.data[i] = (short)ja_data.optInt(i,0);
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
        
        jo.put("seqno", seqno);
        jo.put("target_system", target_system);
        jo.put("target_component", target_component);
         
        JSONArray ja_data = new JSONArray();
        for (int i = 0; i < this.data.length; i++) {
            ja_data.put(this.data[i]);
        }
        jo.putOpt("data", ja_data);
                
        
        
        return jo;
    }

            
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_REMOTE_LOG_DATA_BLOCK - sysid:"+sysid+" compid:"+compid+" seqno:"+seqno+" target_system:"+target_system+" target_component:"+target_component+" data:"+data+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_REMOTE_LOG_DATA_BLOCK";
    }
}
        