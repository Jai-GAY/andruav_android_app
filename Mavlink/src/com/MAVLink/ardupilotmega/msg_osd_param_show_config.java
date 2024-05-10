/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE OSD_PARAM_SHOW_CONFIG PACKING
package com.MAVLink.ardupilotmega;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
import com.MAVLink.Messages.Units;
import com.MAVLink.Messages.Description;

/**
 * Read a configured an OSD parameter slot.
 */
public class msg_osd_param_show_config extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_OSD_PARAM_SHOW_CONFIG = 11035;
    public static final int MAVLINK_MSG_LENGTH = 8;
    private static final long serialVersionUID = MAVLINK_MSG_ID_OSD_PARAM_SHOW_CONFIG;

    
    /**
     * Request ID - copied to reply.
     */
    @Description("Request ID - copied to reply.")
    @Units("")
    public long request_id;
    
    /**
     * System ID.
     */
    @Description("System ID.")
    @Units("")
    public short target_system;
    
    /**
     * Component ID.
     */
    @Description("Component ID.")
    @Units("")
    public short target_component;
    
    /**
     * OSD parameter screen index.
     */
    @Description("OSD parameter screen index.")
    @Units("")
    public short osd_screen;
    
    /**
     * OSD parameter display index.
     */
    @Description("OSD parameter display index.")
    @Units("")
    public short osd_index;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_OSD_PARAM_SHOW_CONFIG;

        packet.payload.putUnsignedInt(request_id);
        packet.payload.putUnsignedByte(target_system);
        packet.payload.putUnsignedByte(target_component);
        packet.payload.putUnsignedByte(osd_screen);
        packet.payload.putUnsignedByte(osd_index);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a osd_param_show_config message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.request_id = payload.getUnsignedInt();
        this.target_system = payload.getUnsignedByte();
        this.target_component = payload.getUnsignedByte();
        this.osd_screen = payload.getUnsignedByte();
        this.osd_index = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_osd_param_show_config() {
        this.msgid = MAVLINK_MSG_ID_OSD_PARAM_SHOW_CONFIG;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_osd_param_show_config( long request_id, short target_system, short target_component, short osd_screen, short osd_index) {
        this.msgid = MAVLINK_MSG_ID_OSD_PARAM_SHOW_CONFIG;

        this.request_id = request_id;
        this.target_system = target_system;
        this.target_component = target_component;
        this.osd_screen = osd_screen;
        this.osd_index = osd_index;
        
    }

    /**
     * Constructor for a new message, initializes everything
     */
    public msg_osd_param_show_config( long request_id, short target_system, short target_component, short osd_screen, short osd_index, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_OSD_PARAM_SHOW_CONFIG;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.request_id = request_id;
        this.target_system = target_system;
        this.target_component = target_component;
        this.osd_screen = osd_screen;
        this.osd_index = osd_index;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_osd_param_show_config(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_OSD_PARAM_SHOW_CONFIG;

        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

              
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_OSD_PARAM_SHOW_CONFIG - sysid:"+sysid+" compid:"+compid+" request_id:"+request_id+" target_system:"+target_system+" target_component:"+target_component+" osd_screen:"+osd_screen+" osd_index:"+osd_index+"";
    }

    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_OSD_PARAM_SHOW_CONFIG";
    }
}
        