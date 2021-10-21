/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE GPS_STATUS PACKING
package com.mavlink.common;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * The positioning status, as reported by GPS. This message is intended to display status information about each satellite visible to the receiver. See message GLOBAL_POSITION for the global position estimate. This message can contain information for up to 20 satellites.
 */
public class msg_gps_status extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_GPS_STATUS = 25;
    public static final int MAVLINK_MSG_LENGTH = 101;
    private static final long serialVersionUID = MAVLINK_MSG_ID_GPS_STATUS;

      
    /**
     * Number of satellites visible
     */
    public short satellites_visible;
      
    /**
     * Global satellite ID
     */
    public short[] satellite_prn = new short[20];
      
    /**
     * 0: Satellite not used, 1: used for localization
     */
    public short[] satellite_used = new short[20];
      
    /**
     * Elevation (0: right on top of receiver, 90: on the horizon) of satellite
     */
    public short[] satellite_elevation = new short[20];
      
    /**
     * Direction of satellite, 0: 0 deg, 255: 360 deg.
     */
    public short[] satellite_azimuth = new short[20];
      
    /**
     * Signal to noise ratio of satellite
     */
    public short[] satellite_snr = new short[20];
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_GPS_STATUS;
        
        packet.payload.putUnsignedByte(satellites_visible);
        
        for (int i = 0; i < satellite_prn.length; i++) {
            packet.payload.putUnsignedByte(satellite_prn[i]);
        }
                    
        
        for (int i = 0; i < satellite_used.length; i++) {
            packet.payload.putUnsignedByte(satellite_used[i]);
        }
                    
        
        for (int i = 0; i < satellite_elevation.length; i++) {
            packet.payload.putUnsignedByte(satellite_elevation[i]);
        }
                    
        
        for (int i = 0; i < satellite_azimuth.length; i++) {
            packet.payload.putUnsignedByte(satellite_azimuth[i]);
        }
                    
        
        for (int i = 0; i < satellite_snr.length; i++) {
            packet.payload.putUnsignedByte(satellite_snr[i]);
        }
                    
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a gps_status message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.satellites_visible = payload.getUnsignedByte();
         
        for (int i = 0; i < this.satellite_prn.length; i++) {
            this.satellite_prn[i] = payload.getUnsignedByte();
        }
                
         
        for (int i = 0; i < this.satellite_used.length; i++) {
            this.satellite_used[i] = payload.getUnsignedByte();
        }
                
         
        for (int i = 0; i < this.satellite_elevation.length; i++) {
            this.satellite_elevation[i] = payload.getUnsignedByte();
        }
                
         
        for (int i = 0; i < this.satellite_azimuth.length; i++) {
            this.satellite_azimuth[i] = payload.getUnsignedByte();
        }
                
         
        for (int i = 0; i < this.satellite_snr.length; i++) {
            this.satellite_snr[i] = payload.getUnsignedByte();
        }
                
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_gps_status() {
        this.msgid = MAVLINK_MSG_ID_GPS_STATUS;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_gps_status( short satellites_visible, short[] satellite_prn, short[] satellite_used, short[] satellite_elevation, short[] satellite_azimuth, short[] satellite_snr) {
        this.msgid = MAVLINK_MSG_ID_GPS_STATUS;

        this.satellites_visible = satellites_visible;
        this.satellite_prn = satellite_prn;
        this.satellite_used = satellite_used;
        this.satellite_elevation = satellite_elevation;
        this.satellite_azimuth = satellite_azimuth;
        this.satellite_snr = satellite_snr;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_gps_status( short satellites_visible, short[] satellite_prn, short[] satellite_used, short[] satellite_elevation, short[] satellite_azimuth, short[] satellite_snr, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_GPS_STATUS;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.satellites_visible = satellites_visible;
        this.satellite_prn = satellite_prn;
        this.satellite_used = satellite_used;
        this.satellite_elevation = satellite_elevation;
        this.satellite_azimuth = satellite_azimuth;
        this.satellite_snr = satellite_snr;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_gps_status(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_GPS_STATUS;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_gps_status(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_GPS_STATUS;

        readJSONheader(jo);
        
        this.satellites_visible = (short)jo.optInt("satellites_visible",0);
         
        if (jo.has("satellite_prn")) {
            JSONArray ja_satellite_prn = jo.optJSONArray("satellite_prn");
            if (ja_satellite_prn == null) {
                this.satellite_prn[0] = (short)jo.optInt("satellite_prn", 0);
            } else {
                for (int i = 0; i < Math.min(this.satellite_prn.length, ja_satellite_prn.length()); i++) {
                    this.satellite_prn[i] = (short)ja_satellite_prn.optInt(i,0);
                }
            }
        }
                    
         
        if (jo.has("satellite_used")) {
            JSONArray ja_satellite_used = jo.optJSONArray("satellite_used");
            if (ja_satellite_used == null) {
                this.satellite_used[0] = (short)jo.optInt("satellite_used", 0);
            } else {
                for (int i = 0; i < Math.min(this.satellite_used.length, ja_satellite_used.length()); i++) {
                    this.satellite_used[i] = (short)ja_satellite_used.optInt(i,0);
                }
            }
        }
                    
         
        if (jo.has("satellite_elevation")) {
            JSONArray ja_satellite_elevation = jo.optJSONArray("satellite_elevation");
            if (ja_satellite_elevation == null) {
                this.satellite_elevation[0] = (short)jo.optInt("satellite_elevation", 0);
            } else {
                for (int i = 0; i < Math.min(this.satellite_elevation.length, ja_satellite_elevation.length()); i++) {
                    this.satellite_elevation[i] = (short)ja_satellite_elevation.optInt(i,0);
                }
            }
        }
                    
         
        if (jo.has("satellite_azimuth")) {
            JSONArray ja_satellite_azimuth = jo.optJSONArray("satellite_azimuth");
            if (ja_satellite_azimuth == null) {
                this.satellite_azimuth[0] = (short)jo.optInt("satellite_azimuth", 0);
            } else {
                for (int i = 0; i < Math.min(this.satellite_azimuth.length, ja_satellite_azimuth.length()); i++) {
                    this.satellite_azimuth[i] = (short)ja_satellite_azimuth.optInt(i,0);
                }
            }
        }
                    
         
        if (jo.has("satellite_snr")) {
            JSONArray ja_satellite_snr = jo.optJSONArray("satellite_snr");
            if (ja_satellite_snr == null) {
                this.satellite_snr[0] = (short)jo.optInt("satellite_snr", 0);
            } else {
                for (int i = 0; i < Math.min(this.satellite_snr.length, ja_satellite_snr.length()); i++) {
                    this.satellite_snr[i] = (short)ja_satellite_snr.optInt(i,0);
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
        
        jo.put("satellites_visible", satellites_visible);
         
        JSONArray ja_satellite_prn = new JSONArray();
        for (int i = 0; i < this.satellite_prn.length; i++) {
            ja_satellite_prn.put(this.satellite_prn[i]);
        }
        jo.putOpt("satellite_prn", ja_satellite_prn);
                
         
        JSONArray ja_satellite_used = new JSONArray();
        for (int i = 0; i < this.satellite_used.length; i++) {
            ja_satellite_used.put(this.satellite_used[i]);
        }
        jo.putOpt("satellite_used", ja_satellite_used);
                
         
        JSONArray ja_satellite_elevation = new JSONArray();
        for (int i = 0; i < this.satellite_elevation.length; i++) {
            ja_satellite_elevation.put(this.satellite_elevation[i]);
        }
        jo.putOpt("satellite_elevation", ja_satellite_elevation);
                
         
        JSONArray ja_satellite_azimuth = new JSONArray();
        for (int i = 0; i < this.satellite_azimuth.length; i++) {
            ja_satellite_azimuth.put(this.satellite_azimuth[i]);
        }
        jo.putOpt("satellite_azimuth", ja_satellite_azimuth);
                
         
        JSONArray ja_satellite_snr = new JSONArray();
        for (int i = 0; i < this.satellite_snr.length; i++) {
            ja_satellite_snr.put(this.satellite_snr[i]);
        }
        jo.putOpt("satellite_snr", ja_satellite_snr);
                
        
        
        return jo;
    }

                
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_GPS_STATUS - sysid:"+sysid+" compid:"+compid+" satellites_visible:"+satellites_visible+" satellite_prn:"+satellite_prn+" satellite_used:"+satellite_used+" satellite_elevation:"+satellite_elevation+" satellite_azimuth:"+satellite_azimuth+" satellite_snr:"+satellite_snr+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_GPS_STATUS";
    }
}
        