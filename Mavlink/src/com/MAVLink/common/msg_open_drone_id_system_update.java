/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE OPEN_DRONE_ID_SYSTEM_UPDATE PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
import com.MAVLink.Messages.Units;
import com.MAVLink.Messages.Description;

/**
 * Update the data in the OPEN_DRONE_ID_SYSTEM message with new location information. This can be sent to update the location information for the operator when no other information in the SYSTEM message has changed. This message allows for efficient operation on radio links which have limited uplink bandwidth while meeting requirements for update frequency of the operator location.
 */
public class msg_open_drone_id_system_update extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_OPEN_DRONE_ID_SYSTEM_UPDATE = 12919;
    public static final int MAVLINK_MSG_LENGTH = 18;
    private static final long serialVersionUID = MAVLINK_MSG_ID_OPEN_DRONE_ID_SYSTEM_UPDATE;

    
    /**
     * Latitude of the operator. If unknown: 0 (both Lat/Lon).
     */
    @Description("Latitude of the operator. If unknown: 0 (both Lat/Lon).")
    @Units("degE7")
    public int operator_latitude;
    
    /**
     * Longitude of the operator. If unknown: 0 (both Lat/Lon).
     */
    @Description("Longitude of the operator. If unknown: 0 (both Lat/Lon).")
    @Units("degE7")
    public int operator_longitude;
    
    /**
     * Geodetic altitude of the operator relative to WGS84. If unknown: -1000 m.
     */
    @Description("Geodetic altitude of the operator relative to WGS84. If unknown: -1000 m.")
    @Units("m")
    public float operator_altitude_geo;
    
    /**
     * 32 bit Unix Timestamp in seconds since 00:00:00 01/01/2019.
     */
    @Description("32 bit Unix Timestamp in seconds since 00:00:00 01/01/2019.")
    @Units("s")
    public long timestamp;
    
    /**
     * System ID (0 for broadcast).
     */
    @Description("System ID (0 for broadcast).")
    @Units("")
    public short target_system;
    
    /**
     * Component ID (0 for broadcast).
     */
    @Description("Component ID (0 for broadcast).")
    @Units("")
    public short target_component;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_OPEN_DRONE_ID_SYSTEM_UPDATE;

        packet.payload.putInt(operator_latitude);
        packet.payload.putInt(operator_longitude);
        packet.payload.putFloat(operator_altitude_geo);
        packet.payload.putUnsignedInt(timestamp);
        packet.payload.putUnsignedByte(target_system);
        packet.payload.putUnsignedByte(target_component);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a open_drone_id_system_update message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.operator_latitude = payload.getInt();
        this.operator_longitude = payload.getInt();
        this.operator_altitude_geo = payload.getFloat();
        this.timestamp = payload.getUnsignedInt();
        this.target_system = payload.getUnsignedByte();
        this.target_component = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_open_drone_id_system_update() {
        this.msgid = MAVLINK_MSG_ID_OPEN_DRONE_ID_SYSTEM_UPDATE;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_open_drone_id_system_update( int operator_latitude, int operator_longitude, float operator_altitude_geo, long timestamp, short target_system, short target_component) {
        this.msgid = MAVLINK_MSG_ID_OPEN_DRONE_ID_SYSTEM_UPDATE;

        this.operator_latitude = operator_latitude;
        this.operator_longitude = operator_longitude;
        this.operator_altitude_geo = operator_altitude_geo;
        this.timestamp = timestamp;
        this.target_system = target_system;
        this.target_component = target_component;
        
    }

    /**
     * Constructor for a new message, initializes everything
     */
    public msg_open_drone_id_system_update( int operator_latitude, int operator_longitude, float operator_altitude_geo, long timestamp, short target_system, short target_component, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_OPEN_DRONE_ID_SYSTEM_UPDATE;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.operator_latitude = operator_latitude;
        this.operator_longitude = operator_longitude;
        this.operator_altitude_geo = operator_altitude_geo;
        this.timestamp = timestamp;
        this.target_system = target_system;
        this.target_component = target_component;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_open_drone_id_system_update(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_OPEN_DRONE_ID_SYSTEM_UPDATE;

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
        return "MAVLINK_MSG_ID_OPEN_DRONE_ID_SYSTEM_UPDATE - sysid:"+sysid+" compid:"+compid+" operator_latitude:"+operator_latitude+" operator_longitude:"+operator_longitude+" operator_altitude_geo:"+operator_altitude_geo+" timestamp:"+timestamp+" target_system:"+target_system+" target_component:"+target_component+"";
    }

    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_OPEN_DRONE_ID_SYSTEM_UPDATE";
    }
}
        