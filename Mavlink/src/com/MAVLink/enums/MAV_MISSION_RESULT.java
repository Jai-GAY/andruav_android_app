/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

package com.MAVLink.enums;

/**
 * Result of mission operation (in a MISSION_ACK message).
 */
public class MAV_MISSION_RESULT {
   public static final int MAV_MISSION_ACCEPTED = 0; /* mission accepted OK | */
   public static final int MAV_MISSION_ERROR = 1; /* Generic error / not accepting mission commands at all right now. | */
   public static final int MAV_MISSION_UNSUPPORTED_FRAME = 2; /* Coordinate frame is not supported. | */
   public static final int MAV_MISSION_UNSUPPORTED = 3; /* Command is not supported. | */
   public static final int MAV_MISSION_NO_SPACE = 4; /* Mission items exceed storage space. | */
   public static final int MAV_MISSION_INVALID = 5; /* One of the parameters has an invalid value. | */
   public static final int MAV_MISSION_INVALID_PARAM1 = 6; /* param1 has an invalid value. | */
   public static final int MAV_MISSION_INVALID_PARAM2 = 7; /* param2 has an invalid value. | */
   public static final int MAV_MISSION_INVALID_PARAM3 = 8; /* param3 has an invalid value. | */
   public static final int MAV_MISSION_INVALID_PARAM4 = 9; /* param4 has an invalid value. | */
   public static final int MAV_MISSION_INVALID_PARAM5_X = 10; /* x / param5 has an invalid value. | */
   public static final int MAV_MISSION_INVALID_PARAM6_Y = 11; /* y / param6 has an invalid value. | */
   public static final int MAV_MISSION_INVALID_PARAM7 = 12; /* z / param7 has an invalid value. | */
   public static final int MAV_MISSION_INVALID_SEQUENCE = 13; /* Mission item received out of sequence | */
   public static final int MAV_MISSION_DENIED = 14; /* Not accepting any mission commands from this communication partner. | */
   public static final int MAV_MISSION_OPERATION_CANCELLED = 15; /* Current mission operation cancelled (e.g. mission upload, mission download). | */
   public static final int MAV_MISSION_RESULT_ENUM_END = 16; /*  | */
}