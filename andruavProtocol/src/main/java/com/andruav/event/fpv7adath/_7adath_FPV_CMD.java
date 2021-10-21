package com.andruav.event.fpv7adath;

import androidx.collection.SimpleArrayMap;

import com.andruav.protocol.commands.textMessages.Control.AndruavMessage_Ctrl_Camera;

/**
 * Holds camera related commands sent to Drone from other units.
 * <br><br>*Created by M.Hefny on 02-Nov-14.
 */
public class _7adath_FPV_CMD {

    /***
     * This commands has two parameters:
     * NumberofImages : number of images to take
     * SendBackImages : 0-no 1-yes
     * TimeBetweenShots : time between two consequtive images in milliseconds.
     */
    public final static int FPV_CMD_TAKEIMAGE   = 1;
    public final static int FPV_CMD_ROTATECAM   = 2;
    public final static int FPV_CMD_STREAMVIDEO = 3;
    public final static int FPV_CMD_RECORDVIDEO = 4;
    public final static int FPV_CMD_SWITCHCAM   = 5;
    public final static int FPV_CMD_FLASHCAM    = 6;

    public int CMD_ID;
    public Boolean ACT;
    public SimpleArrayMap<String, String> Variables = new SimpleArrayMap<String, String>() ;

    public String Requester;


    public int CameraSource             = AndruavMessage_Ctrl_Camera.CAMERA_SOURCE_MOBILE;
    public int NumberOfImages           = 1;
    public boolean SaveImageLocally     = true;
    /***
     * in milli seconds
     */
    public long TimeBetweenShotes           = 0;
    /***
     * in meters
     */
    public double DistanceBetweenShotes     = 0;

    public boolean SendBackImages = true;       // sendMessageToModule images back to Requested GCS
    
    public _7adath_FPV_CMD(int msource)
    {
        CMD_ID = msource;
    }

    public int getIntValue(String andruavCmdNavLoiterUnlim)
    {
        return Integer.parseInt(Variables.get(andruavCmdNavLoiterUnlim));
    }


    public byte getByteValue(String source)
    {
        return Byte.parseByte(Variables.get(source));
    }


    public Boolean getBooleanValue (String mavMissionClearSearchUrlTextAppearanceWidgetAppCompatLight)
    {
        return Boolean.parseBoolean(Variables.get(mavMissionClearSearchUrlTextAppearanceWidgetAppCompatLight));

    }

    public String getStringValue(String packet)
    {
        return Variables.get(packet);
    }

}
