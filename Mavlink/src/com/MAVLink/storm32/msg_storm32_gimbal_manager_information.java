/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE STORM32_GIMBAL_MANAGER_INFORMATION PACKING
package com.MAVLink.storm32;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
import com.MAVLink.Messages.Units;
import com.MAVLink.Messages.Description;

/**
 * Information about a gimbal manager. This message should be requested by a ground station using MAV_CMD_REQUEST_MESSAGE. It mirrors some fields of the STORM32_GIMBAL_DEVICE_INFORMATION message, but not all. If the additional information is desired, also STORM32_GIMBAL_DEVICE_INFORMATION should be requested.
 */
public class msg_storm32_gimbal_manager_information extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_STORM32_GIMBAL_MANAGER_INFORMATION = 60010;
    public static final int MAVLINK_MSG_LENGTH = 33;
    private static final long serialVersionUID = MAVLINK_MSG_ID_STORM32_GIMBAL_MANAGER_INFORMATION;

    
    /**
     * Gimbal device capability flags.
     */
    @Description("Gimbal device capability flags.")
    @Units("")
    public long device_cap_flags;
    
    /**
     * Gimbal manager capability flags.
     */
    @Description("Gimbal manager capability flags.")
    @Units("")
    public long manager_cap_flags;
    
    /**
     * Hardware minimum roll angle (positive: roll to the right, NaN if unknown).
     */
    @Description("Hardware minimum roll angle (positive: roll to the right, NaN if unknown).")
    @Units("rad")
    public float roll_min;
    
    /**
     * Hardware maximum roll angle (positive: roll to the right, NaN if unknown).
     */
    @Description("Hardware maximum roll angle (positive: roll to the right, NaN if unknown).")
    @Units("rad")
    public float roll_max;
    
    /**
     * Hardware minimum pitch/tilt angle (positive: tilt up, NaN if unknown).
     */
    @Description("Hardware minimum pitch/tilt angle (positive: tilt up, NaN if unknown).")
    @Units("rad")
    public float pitch_min;
    
    /**
     * Hardware maximum pitch/tilt angle (positive: tilt up, NaN if unknown).
     */
    @Description("Hardware maximum pitch/tilt angle (positive: tilt up, NaN if unknown).")
    @Units("rad")
    public float pitch_max;
    
    /**
     * Hardware minimum yaw/pan angle (positive: pan to the right, relative to the vehicle/gimbal base, NaN if unknown).
     */
    @Description("Hardware minimum yaw/pan angle (positive: pan to the right, relative to the vehicle/gimbal base, NaN if unknown).")
    @Units("rad")
    public float yaw_min;
    
    /**
     * Hardware maximum yaw/pan angle (positive: pan to the right, relative to the vehicle/gimbal base, NaN if unknown).
     */
    @Description("Hardware maximum yaw/pan angle (positive: pan to the right, relative to the vehicle/gimbal base, NaN if unknown).")
    @Units("rad")
    public float yaw_max;
    
    /**
     * Gimbal ID (component ID or 1-6 for non-MAVLink gimbal) that this gimbal manager is responsible for.
     */
    @Description("Gimbal ID (component ID or 1-6 for non-MAVLink gimbal) that this gimbal manager is responsible for.")
    @Units("")
    public short gimbal_id;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_STORM32_GIMBAL_MANAGER_INFORMATION;

        packet.payload.putUnsignedInt(device_cap_flags);
        packet.payload.putUnsignedInt(manager_cap_flags);
        packet.payload.putFloat(roll_min);
        packet.payload.putFloat(roll_max);
        packet.payload.putFloat(pitch_min);
        packet.payload.putFloat(pitch_max);
        packet.payload.putFloat(yaw_min);
        packet.payload.putFloat(yaw_max);
        packet.payload.putUnsignedByte(gimbal_id);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a storm32_gimbal_manager_information message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.device_cap_flags = payload.getUnsignedInt();
        this.manager_cap_flags = payload.getUnsignedInt();
        this.roll_min = payload.getFloat();
        this.roll_max = payload.getFloat();
        this.pitch_min = payload.getFloat();
        this.pitch_max = payload.getFloat();
        this.yaw_min = payload.getFloat();
        this.yaw_max = payload.getFloat();
        this.gimbal_id = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_storm32_gimbal_manager_information() {
        this.msgid = MAVLINK_MSG_ID_STORM32_GIMBAL_MANAGER_INFORMATION;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_storm32_gimbal_manager_information( long device_cap_flags, long manager_cap_flags, float roll_min, float roll_max, float pitch_min, float pitch_max, float yaw_min, float yaw_max, short gimbal_id) {
        this.msgid = MAVLINK_MSG_ID_STORM32_GIMBAL_MANAGER_INFORMATION;

        this.device_cap_flags = device_cap_flags;
        this.manager_cap_flags = manager_cap_flags;
        this.roll_min = roll_min;
        this.roll_max = roll_max;
        this.pitch_min = pitch_min;
        this.pitch_max = pitch_max;
        this.yaw_min = yaw_min;
        this.yaw_max = yaw_max;
        this.gimbal_id = gimbal_id;
        
    }

    /**
     * Constructor for a new message, initializes everything
     */
    public msg_storm32_gimbal_manager_information( long device_cap_flags, long manager_cap_flags, float roll_min, float roll_max, float pitch_min, float pitch_max, float yaw_min, float yaw_max, short gimbal_id, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_STORM32_GIMBAL_MANAGER_INFORMATION;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.device_cap_flags = device_cap_flags;
        this.manager_cap_flags = manager_cap_flags;
        this.roll_min = roll_min;
        this.roll_max = roll_max;
        this.pitch_min = pitch_min;
        this.pitch_max = pitch_max;
        this.yaw_min = yaw_min;
        this.yaw_max = yaw_max;
        this.gimbal_id = gimbal_id;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_storm32_gimbal_manager_information(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_STORM32_GIMBAL_MANAGER_INFORMATION;

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
        return "MAVLINK_MSG_ID_STORM32_GIMBAL_MANAGER_INFORMATION - sysid:"+sysid+" compid:"+compid+" device_cap_flags:"+device_cap_flags+" manager_cap_flags:"+manager_cap_flags+" roll_min:"+roll_min+" roll_max:"+roll_max+" pitch_min:"+pitch_min+" pitch_max:"+pitch_max+" yaw_min:"+yaw_min+" yaw_max:"+yaw_max+" gimbal_id:"+gimbal_id+"";
    }

    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_STORM32_GIMBAL_MANAGER_INFORMATION";
    }
}
        