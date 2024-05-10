/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE HIL_STATE PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
import com.MAVLink.Messages.Units;
import com.MAVLink.Messages.Description;

/**
 * Sent from simulation to autopilot. This packet is useful for high throughput applications such as hardware in the loop simulations.
 */
public class msg_hil_state extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_HIL_STATE = 90;
    public static final int MAVLINK_MSG_LENGTH = 56;
    private static final long serialVersionUID = MAVLINK_MSG_ID_HIL_STATE;

    
    /**
     * Timestamp (UNIX Epoch time or time since system boot). The receiving end can infer timestamp format (since 1.1.1970 or since system boot) by checking for the magnitude of the number.
     */
    @Description("Timestamp (UNIX Epoch time or time since system boot). The receiving end can infer timestamp format (since 1.1.1970 or since system boot) by checking for the magnitude of the number.")
    @Units("us")
    public long time_usec;
    
    /**
     * Roll angle
     */
    @Description("Roll angle")
    @Units("rad")
    public float roll;
    
    /**
     * Pitch angle
     */
    @Description("Pitch angle")
    @Units("rad")
    public float pitch;
    
    /**
     * Yaw angle
     */
    @Description("Yaw angle")
    @Units("rad")
    public float yaw;
    
    /**
     * Body frame roll / phi angular speed
     */
    @Description("Body frame roll / phi angular speed")
    @Units("rad/s")
    public float rollspeed;
    
    /**
     * Body frame pitch / theta angular speed
     */
    @Description("Body frame pitch / theta angular speed")
    @Units("rad/s")
    public float pitchspeed;
    
    /**
     * Body frame yaw / psi angular speed
     */
    @Description("Body frame yaw / psi angular speed")
    @Units("rad/s")
    public float yawspeed;
    
    /**
     * Latitude
     */
    @Description("Latitude")
    @Units("degE7")
    public int lat;
    
    /**
     * Longitude
     */
    @Description("Longitude")
    @Units("degE7")
    public int lon;
    
    /**
     * Altitude
     */
    @Description("Altitude")
    @Units("mm")
    public int alt;
    
    /**
     * Ground X Speed (Latitude)
     */
    @Description("Ground X Speed (Latitude)")
    @Units("cm/s")
    public short vx;
    
    /**
     * Ground Y Speed (Longitude)
     */
    @Description("Ground Y Speed (Longitude)")
    @Units("cm/s")
    public short vy;
    
    /**
     * Ground Z Speed (Altitude)
     */
    @Description("Ground Z Speed (Altitude)")
    @Units("cm/s")
    public short vz;
    
    /**
     * X acceleration
     */
    @Description("X acceleration")
    @Units("mG")
    public short xacc;
    
    /**
     * Y acceleration
     */
    @Description("Y acceleration")
    @Units("mG")
    public short yacc;
    
    /**
     * Z acceleration
     */
    @Description("Z acceleration")
    @Units("mG")
    public short zacc;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_HIL_STATE;

        packet.payload.putUnsignedLong(time_usec);
        packet.payload.putFloat(roll);
        packet.payload.putFloat(pitch);
        packet.payload.putFloat(yaw);
        packet.payload.putFloat(rollspeed);
        packet.payload.putFloat(pitchspeed);
        packet.payload.putFloat(yawspeed);
        packet.payload.putInt(lat);
        packet.payload.putInt(lon);
        packet.payload.putInt(alt);
        packet.payload.putShort(vx);
        packet.payload.putShort(vy);
        packet.payload.putShort(vz);
        packet.payload.putShort(xacc);
        packet.payload.putShort(yacc);
        packet.payload.putShort(zacc);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a hil_state message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.time_usec = payload.getUnsignedLong();
        this.roll = payload.getFloat();
        this.pitch = payload.getFloat();
        this.yaw = payload.getFloat();
        this.rollspeed = payload.getFloat();
        this.pitchspeed = payload.getFloat();
        this.yawspeed = payload.getFloat();
        this.lat = payload.getInt();
        this.lon = payload.getInt();
        this.alt = payload.getInt();
        this.vx = payload.getShort();
        this.vy = payload.getShort();
        this.vz = payload.getShort();
        this.xacc = payload.getShort();
        this.yacc = payload.getShort();
        this.zacc = payload.getShort();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_hil_state() {
        this.msgid = MAVLINK_MSG_ID_HIL_STATE;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_hil_state( long time_usec, float roll, float pitch, float yaw, float rollspeed, float pitchspeed, float yawspeed, int lat, int lon, int alt, short vx, short vy, short vz, short xacc, short yacc, short zacc) {
        this.msgid = MAVLINK_MSG_ID_HIL_STATE;

        this.time_usec = time_usec;
        this.roll = roll;
        this.pitch = pitch;
        this.yaw = yaw;
        this.rollspeed = rollspeed;
        this.pitchspeed = pitchspeed;
        this.yawspeed = yawspeed;
        this.lat = lat;
        this.lon = lon;
        this.alt = alt;
        this.vx = vx;
        this.vy = vy;
        this.vz = vz;
        this.xacc = xacc;
        this.yacc = yacc;
        this.zacc = zacc;
        
    }

    /**
     * Constructor for a new message, initializes everything
     */
    public msg_hil_state( long time_usec, float roll, float pitch, float yaw, float rollspeed, float pitchspeed, float yawspeed, int lat, int lon, int alt, short vx, short vy, short vz, short xacc, short yacc, short zacc, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_HIL_STATE;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.time_usec = time_usec;
        this.roll = roll;
        this.pitch = pitch;
        this.yaw = yaw;
        this.rollspeed = rollspeed;
        this.pitchspeed = pitchspeed;
        this.yawspeed = yawspeed;
        this.lat = lat;
        this.lon = lon;
        this.alt = alt;
        this.vx = vx;
        this.vy = vy;
        this.vz = vz;
        this.xacc = xacc;
        this.yacc = yacc;
        this.zacc = zacc;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_hil_state(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_HIL_STATE;

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
        return "MAVLINK_MSG_ID_HIL_STATE - sysid:"+sysid+" compid:"+compid+" time_usec:"+time_usec+" roll:"+roll+" pitch:"+pitch+" yaw:"+yaw+" rollspeed:"+rollspeed+" pitchspeed:"+pitchspeed+" yawspeed:"+yawspeed+" lat:"+lat+" lon:"+lon+" alt:"+alt+" vx:"+vx+" vy:"+vy+" vz:"+vz+" xacc:"+xacc+" yacc:"+yacc+" zacc:"+zacc+"";
    }

    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_HIL_STATE";
    }
}
        