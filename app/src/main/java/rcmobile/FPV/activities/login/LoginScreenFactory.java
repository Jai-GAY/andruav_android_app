package rcmobile.FPV.activities.login;

import android.content.Context;
import android.content.Intent;

import com.andruav.AndruavSettings;

import rcmobile.FPV.activities.login.drone.MainDroneActiviy;

/**
 * Created by mhefny on 4/21/16.
 */
public class LoginScreenFactory {

    public static Intent getIntentLoginActivity(Context context) {

        Intent intent;


        if (AndruavSettings.andruavWe7daBase.getIsCGS()) {
             intent = new Intent(context, GCSLoginShasha.class);


         } else {  // you cannot use a drone if mobile does not have a cam
            intent = new Intent(context, MainDroneActiviy.DroneLoginShasha.class);



        }

        return intent;
    }


    public static void startLoginActivity(Context context) {


        final Intent intent = getIntentLoginActivity(context);

        context.startActivity(intent);
        return ;
    }
}
