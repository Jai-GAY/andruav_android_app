/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE SET_HOME_POSITION PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * The position the system will return to and land on. The position is set automatically by the system during the takeoff in case it was not explicitly set by the operator before or after. The global and local positions encode the position in the respective coordinate frames, while the q parameter encodes the orientation of the surface. Under normal conditions it describes the heading and terrain slope, which can be used by the aircraft to adjust the approach. The approach 3D vector describes the point to which the system should fly in normal flight mode and then perform a landing sequence along the vector.
 */
public class msg_set_home_position extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_SET_HOME_POSITION = 243;
    public static final int MAVLINK_MSG_LENGTH = 61;
    private static final long serialVersionUID = MAVLINK_MSG_ID_SET_HOME_POSITION;

      
    /**
     * Latitude (WGS84)
     */
    public int latitude;
      
    /**
     * Longitude (WGS84)
     */
    public int longitude;
      
    /**
     * Altitude (MSL). Positive for up.
     */
    public int altitude;
      
    /**
     * Local X position of this position in the local coordinate frame
     */
    public float x;
      
    /**
     * Local Y position of this position in the local coordinate frame
     */
    public float y;
      
    /**
     * Local Z position of this position in the local coordinate frame
     */
    public float z;
      
    /**
     * World to surface normal and heading transformation of the takeoff position. Used to indicate the heading and slope of the ground
     */
    public float[] q = new float[4];
      
    /**
     * Local X position of the end of the approach vector. Multicopters should set this position based on their takeoff path. Grass-landing fixed wing aircraft should set it the same way as multicopters. Runway-landing fixed wing aircraft should set it to the opposite direction of the takeoff, assuming the takeoff happened from the threshold / touchdown zone.
     */
    public float approach_x;
      
    /**
     * Local Y position of the end of the approach vector. Multicopters should set this position based on their takeoff path. Grass-landing fixed wing aircraft should set it the same way as multicopters. Runway-landing fixed wing aircraft should set it to the opposite direction of the takeoff, assuming the takeoff happened from the threshold / touchdown zone.
     */
    public float approach_y;
      
    /**
     * Local Z position of the end of the approach vector. Multicopters should set this position based on their takeoff path. Grass-landing fixed wing aircraft should set it the same way as multicopters. Runway-landing fixed wing aircraft should set it to the opposite direction of the takeoff, assuming the takeoff happened from the threshold / touchdown zone.
     */
    public float approach_z;
      
    /**
     * System ID.
     */
    public short target_system;
      
    /**
     * Timestamp (UNIX Epoch time or time since system boot). The receiving end can infer timestamp format (since 1.1.1970 or since system boot) by checking for the magnitude of the number.
     */
    public long time_usec;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_SET_HOME_POSITION;
        
        packet.payload.putInt(latitude);
        packet.payload.putInt(longitude);
        packet.payload.putInt(altitude);
        packet.payload.putFloat(x);
        packet.payload.putFloat(y);
        packet.payload.putFloat(z);
        
        for (int i = 0; i < q.length; i++) {
            packet.payload.putFloat(q[i]);
        }
                    
        packet.payload.putFloat(approach_x);
        packet.payload.putFloat(approach_y);
        packet.payload.putFloat(approach_z);
        packet.payload.putUnsignedByte(target_system);
        
        if (isMavlink2) {
             packet.payload.putUnsignedLong(time_usec);
            
        }
        return packet;
    }

    /**
     * Decode a set_home_position message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.latitude = payload.getInt();
        this.longitude = payload.getInt();
        this.altitude = payload.getInt();
        this.x = payload.getFloat();
        this.y = payload.getFloat();
        this.z = payload.getFloat();
         
        for (int i = 0; i < this.q.length; i++) {
            this.q[i] = payload.getFloat();
        }
                
        this.approach_x = payload.getFloat();
        this.approach_y = payload.getFloat();
        this.approach_z = payload.getFloat();
        this.target_system = payload.getUnsignedByte();
        
        if (isMavlink2) {
             this.time_usec = payload.getUnsignedLong();
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_set_home_position() {
        this.msgid = MAVLINK_MSG_ID_SET_HOME_POSITION;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_set_home_position( int latitude, int longitude, int altitude, float x, float y, float z, float[] q, float approach_x, float approach_y, float approach_z, short target_system, long time_usec) {
        this.msgid = MAVLINK_MSG_ID_SET_HOME_POSITION;

        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
        this.x = x;
        this.y = y;
        this.z = z;
        this.q = q;
        this.approach_x = approach_x;
        this.approach_y = approach_y;
        this.approach_z = approach_z;
        this.target_system = target_system;
        this.time_usec = time_usec;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_set_home_position( int latitude, int longitude, int altitude, float x, float y, float z, float[] q, float approach_x, float approach_y, float approach_z, short target_system, long time_usec, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_SET_HOME_POSITION;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
        this.x = x;
        this.y = y;
        this.z = z;
        this.q = q;
        this.approach_x = approach_x;
        this.approach_y = approach_y;
        this.approach_z = approach_z;
        this.target_system = target_system;
        this.time_usec = time_usec;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_set_home_position(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_SET_HOME_POSITION;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_set_home_position(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_SET_HOME_POSITION;

        readJSONheader(jo);
        
        this.latitude = jo.optInt("latitude",0);
        this.longitude = jo.optInt("longitude",0);
        this.altitude = jo.optInt("altitude",0);
        this.x = (float)jo.optDouble("x",0);
        this.y = (float)jo.optDouble("y",0);
        this.z = (float)jo.optDouble("z",0);
         
        if (jo.has("q")) {
            JSONArray ja_q = jo.optJSONArray("q");
            if (ja_q == null) {
                this.q[0] = (float)jo.optDouble("q", 0);
            } else {
                for (int i = 0; i < Math.min(this.q.length, ja_q.length()); i++) {
                    this.q[i] = (float)ja_q.optDouble(i,0);
                }
            }
        }
                    
        this.approach_x = (float)jo.optDouble("approach_x",0);
        this.approach_y = (float)jo.optDouble("approach_y",0);
        this.approach_z = (float)jo.optDouble("approach_z",0);
        this.target_system = (short)jo.optInt("target_system",0);
        
         
        if (jo.has("time_usec")) {
            final JSONArray ja_time_usec = jo.optJSONArray("time_usec");
            if (ja_time_usec == null) {
                this.time_usec = jo.optLong("time_usec", 0);
            } else if (ja_time_usec.length() > 0) {
                this.time_usec = ja_time_usec.optLong(0, 0);
            }
        }
                    
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    @Override
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("latitude", latitude);
        jo.put("longitude", longitude);
        jo.put("altitude", altitude);
        jo.put("x", (double)x);
        jo.put("y", (double)y);
        jo.put("z", (double)z);
         
        JSONArray ja_q = new JSONArray();
        for (int i = 0; i < this.q.length; i++) {
            ja_q.put(this.q[i]);
        }
        jo.putOpt("q", ja_q);
                
        jo.put("approach_x", (double)approach_x);
        jo.put("approach_y", (double)approach_y);
        jo.put("approach_z", (double)approach_z);
        jo.put("target_system", target_system);
        
        jo.put("time_usec", time_usec);
        
        return jo;
    }

                            
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_SET_HOME_POSITION - sysid:"+sysid+" compid:"+compid+" latitude:"+latitude+" longitude:"+longitude+" altitude:"+altitude+" x:"+x+" y:"+y+" z:"+z+" q:"+q+" approach_x:"+approach_x+" approach_y:"+approach_y+" approach_z:"+approach_z+" target_system:"+target_system+" time_usec:"+time_usec+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_SET_HOME_POSITION";
    }
}
        