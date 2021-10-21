package com.andruav.protocol.commands.textMessages.systemCommands;

import com.andruav.protocol.commands.textMessages.AndruavMessageBase;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.ParseException;

public class AndruavSystem_LogoutCommServer  extends AndruavMessageBase {

    public final static int TYPE_AndruavSystem_LogoutCommServer = 9006;


    public String  Message;

    public AndruavSystem_LogoutCommServer () {
        messageTypeID = TYPE_AndruavSystem_LogoutCommServer;
    }

    @Override
    public void setMessageText(String messageText) throws JSONException, ParseException {

        JSONObject json_receive_data = new JSONObject(messageText);

        if (json_receive_data.has("s")) Message = json_receive_data.getString("s");
    }


    @Override
    public String getJsonMessage () throws org.json.JSONException
    {
        JSONObject json_data= new JSONObject();

        if ((Message != null) && (!Message.isEmpty())) json_data.accumulate("s",Message);

        return json_data.toString();
    }
}
