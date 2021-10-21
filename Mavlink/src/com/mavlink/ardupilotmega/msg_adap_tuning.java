/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE ADAP_TUNING PACKING
package com.mavlink.ardupilotmega;
import com.mavlink.MAVLinkPacket;
import com.mavlink.messages.MAVLinkMessage;
import com.mavlink.messages.MAVLinkPayload;

import org.json.JSONException;
import org.json.JSONObject;

        
/**
 * Adaptive Controller tuning information.
 */
public class msg_adap_tuning extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_ADAP_TUNING = 11010;
    public static final int MAVLINK_MSG_LENGTH = 49;
    private static final long serialVersionUID = MAVLINK_MSG_ID_ADAP_TUNING;

      
    /**
     * Desired rate.
     */
    public float desired;
      
    /**
     * Achieved rate.
     */
    public float achieved;
      
    /**
     * Error between model and vehicle.
     */
    public float error;
      
    /**
     * Theta estimated state predictor.
     */
    public float theta;
      
    /**
     * Omega estimated state predictor.
     */
    public float omega;
      
    /**
     * Sigma estimated state predictor.
     */
    public float sigma;
      
    /**
     * Theta derivative.
     */
    public float theta_dot;
      
    /**
     * Omega derivative.
     */
    public float omega_dot;
      
    /**
     * Sigma derivative.
     */
    public float sigma_dot;
      
    /**
     * Projection operator value.
     */
    public float f;
      
    /**
     * Projection operator derivative.
     */
    public float f_dot;
      
    /**
     * u adaptive controlled output command.
     */
    public float u;
      
    /**
     * Axis.
     */
    public short axis;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_ADAP_TUNING;
        
        packet.payload.putFloat(desired);
        packet.payload.putFloat(achieved);
        packet.payload.putFloat(error);
        packet.payload.putFloat(theta);
        packet.payload.putFloat(omega);
        packet.payload.putFloat(sigma);
        packet.payload.putFloat(theta_dot);
        packet.payload.putFloat(omega_dot);
        packet.payload.putFloat(sigma_dot);
        packet.payload.putFloat(f);
        packet.payload.putFloat(f_dot);
        packet.payload.putFloat(u);
        packet.payload.putUnsignedByte(axis);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a adap_tuning message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.desired = payload.getFloat();
        this.achieved = payload.getFloat();
        this.error = payload.getFloat();
        this.theta = payload.getFloat();
        this.omega = payload.getFloat();
        this.sigma = payload.getFloat();
        this.theta_dot = payload.getFloat();
        this.omega_dot = payload.getFloat();
        this.sigma_dot = payload.getFloat();
        this.f = payload.getFloat();
        this.f_dot = payload.getFloat();
        this.u = payload.getFloat();
        this.axis = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_adap_tuning() {
        this.msgid = MAVLINK_MSG_ID_ADAP_TUNING;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_adap_tuning( float desired, float achieved, float error, float theta, float omega, float sigma, float theta_dot, float omega_dot, float sigma_dot, float f, float f_dot, float u, short axis) {
        this.msgid = MAVLINK_MSG_ID_ADAP_TUNING;

        this.desired = desired;
        this.achieved = achieved;
        this.error = error;
        this.theta = theta;
        this.omega = omega;
        this.sigma = sigma;
        this.theta_dot = theta_dot;
        this.omega_dot = omega_dot;
        this.sigma_dot = sigma_dot;
        this.f = f;
        this.f_dot = f_dot;
        this.u = u;
        this.axis = axis;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_adap_tuning( float desired, float achieved, float error, float theta, float omega, float sigma, float theta_dot, float omega_dot, float sigma_dot, float f, float f_dot, float u, short axis, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_ADAP_TUNING;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.desired = desired;
        this.achieved = achieved;
        this.error = error;
        this.theta = theta;
        this.omega = omega;
        this.sigma = sigma;
        this.theta_dot = theta_dot;
        this.omega_dot = omega_dot;
        this.sigma_dot = sigma_dot;
        this.f = f;
        this.f_dot = f_dot;
        this.u = u;
        this.axis = axis;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_adap_tuning(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_ADAP_TUNING;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from JSON Object
     */
    public msg_adap_tuning(JSONObject jo) {
        this.msgid = MAVLINK_MSG_ID_ADAP_TUNING;

        readJSONheader(jo);
        
        this.desired = (float)jo.optDouble("desired",0);
        this.achieved = (float)jo.optDouble("achieved",0);
        this.error = (float)jo.optDouble("error",0);
        this.theta = (float)jo.optDouble("theta",0);
        this.omega = (float)jo.optDouble("omega",0);
        this.sigma = (float)jo.optDouble("sigma",0);
        this.theta_dot = (float)jo.optDouble("theta_dot",0);
        this.omega_dot = (float)jo.optDouble("omega_dot",0);
        this.sigma_dot = (float)jo.optDouble("sigma_dot",0);
        this.f = (float)jo.optDouble("f",0);
        this.f_dot = (float)jo.optDouble("f_dot",0);
        this.u = (float)jo.optDouble("u",0);
        this.axis = (short)jo.optInt("axis",0);
        
        
    }
    
    /**
     * Convert this class to a JSON Object
     */
    @Override
    public JSONObject toJSON() throws JSONException {
        final JSONObject jo = getJSONheader();
        
        jo.put("desired", (double)desired);
        jo.put("achieved", (double)achieved);
        jo.put("error", (double)error);
        jo.put("theta", (double)theta);
        jo.put("omega", (double)omega);
        jo.put("sigma", (double)sigma);
        jo.put("theta_dot", (double)theta_dot);
        jo.put("omega_dot", (double)omega_dot);
        jo.put("sigma_dot", (double)sigma_dot);
        jo.put("f", (double)f);
        jo.put("f_dot", (double)f_dot);
        jo.put("u", (double)u);
        jo.put("axis", axis);
        
        
        return jo;
    }

                              
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_ADAP_TUNING - sysid:"+sysid+" compid:"+compid+" desired:"+desired+" achieved:"+achieved+" error:"+error+" theta:"+theta+" omega:"+omega+" sigma:"+sigma+" theta_dot:"+theta_dot+" omega_dot:"+omega_dot+" sigma_dot:"+sigma_dot+" f:"+f+" f_dot:"+f_dot+" u:"+u+" axis:"+axis+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_ADAP_TUNING";
    }
}
        