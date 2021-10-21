/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE AHRS3 PACKING
package com.mavlink.ardupilotmega;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * Status of third AHRS filter if available. This is for ANU research group (Ali and Sean).
 */
public class msg_ahrs3 extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_AHRS3 = 182;
    public static final int MAVLINK_MSG_LENGTH = 40;
    private static final long serialVersionUID = MAVLINK_MSG_ID_AHRS3;

      
    /**
     * Roll angle.
     */
    public float roll;
      
    /**
     * Pitch angle.
     */
    public float pitch;
      
    /**
     * Yaw angle.
     */
    public float yaw;
      
    /**
     * Altitude (MSL).
     */
    public float altitude;
      
    /**
     * Latitude.
     */
    public int lat;
      
    /**
     * Longitude.
     */
    public int lng;
      
    /**
     * Test variable1.
     */
    public float v1;
      
    /**
     * Test variable2.
     */
    public float v2;
      
    /**
     * Test variable3.
     */
    public float v3;
      
    /**
     * Test variable4.
     */
    public float v4;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_AHRS3;
        
        packet.payload.putFloat(roll);
        packet.payload.putFloat(pitch);
        packet.payload.putFloat(yaw);
        packet.payload.putFloat(altitude);
        packet.payload.putInt(lat);
        packet.payload.putInt(lng);
        packet.payload.putFloat(v1);
        packet.payload.putFloat(v2);
        packet.payload.putFloat(v3);
        packet.payload.putFloat(v4);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a ahrs3 message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.roll = payload.getFloat();
        this.pitch = payload.getFloat();
        this.yaw = payload.getFloat();
        this.altitude = payload.getFloat();
        this.lat = payload.getInt();
        this.lng = payload.getInt();
        this.v1 = payload.getFloat();
        this.v2 = payload.getFloat();
        this.v3 = payload.getFloat();
        this.v4 = payload.getFloat();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_ahrs3() {
        this.msgid = MAVLINK_MSG_ID_AHRS3;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_ahrs3( float roll, float pitch, float yaw, float altitude, int lat, int lng, float v1, float v2, float v3, float v4) {
        this.msgid = MAVLINK_MSG_ID_AHRS3;

        this.roll = roll;
        this.pitch = pitch;
        this.yaw = yaw;
        this.altitude = altitude;
        this.lat = lat;
        this.lng = lng;
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.v4 = v4;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_ahrs3( float roll, float pitch, float yaw, float altitude, int lat, int lng, float v1, float v2, float v3, float v4, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_AHRS3;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.roll = roll;
        this.pitch = pitch;
        this.yaw = yaw;
        this.altitude = altitude;
        this.lat = lat;
        this.lng = lng;
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.v4 = v4;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_ahrs3(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_AHRS3;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_ahrs3(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_AHRS3;

        readJSONheader(jo);
        
        this.roll = (float)jo.optDouble("roll",0);
        this.pitch = (float)jo.optDouble("pitch",0);
        this.yaw = (float)jo.optDouble("yaw",0);
        this.altitude = (float)jo.optDouble("altitude",0);
        this.lat = jo.optInt("lat",0);
        this.lng = jo.optInt("lng",0);
        this.v1 = (float)jo.optDouble("v1",0);
        this.v2 = (float)jo.optDouble("v2",0);
        this.v3 = (float)jo.optDouble("v3",0);
        this.v4 = (float)jo.optDouble("v4",0);
        
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    @Override
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("roll", (double)roll);
        jo.put("pitch", (double)pitch);
        jo.put("yaw", (double)yaw);
        jo.put("altitude", (double)altitude);
        jo.put("lat", lat);
        jo.put("lng", lng);
        jo.put("v1", (double)v1);
        jo.put("v2", (double)v2);
        jo.put("v3", (double)v3);
        jo.put("v4", (double)v4);
        
        
        return jo;
    }

                        
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_AHRS3 - sysid:"+sysid+" compid:"+compid+" roll:"+roll+" pitch:"+pitch+" yaw:"+yaw+" altitude:"+altitude+" lat:"+lat+" lng:"+lng+" v1:"+v1+" v2:"+v2+" v3:"+v3+" v4:"+v4+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_AHRS3";
    }
}
        