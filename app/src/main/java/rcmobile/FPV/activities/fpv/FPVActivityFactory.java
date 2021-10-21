package rcmobile.FPV.activities.fpv;

import android.content.Context;
import android.content.Intent;

import com.andruav.AndruavSettings;

import rcmobile.FPV.activities.fpv.drone.FPVDroneRTCWebCamActivity;

import com.andruav.event.fpv7adath._7adath_InitAndroidCamera;

import rcmobile.FPV.activities.fpv.drone.FPVModuleRTCWebCamActivity;

/**
 * Created by M.Hefny on 18-Jul-15.
 */
public class FPVActivityFactory {

    public static void startFPVActivity (final Context context)
    {
        startFPVActivity (context,null);
    }

    public static void startFPVActivity (final Context context,  final _7adath_InitAndroidCamera a7adath_fpv_cmd) {

        if (context == null)
        {
            return ;
        }
        if (AndruavSettings.andruavWe7daBase.getIsCGS()) {
            return ;
        } else {  // you cannot use a drone if mobile does not have a cam


                    Intent intent;
                    if (AndruavSettings.andruavWe7daBase.mIsModule)
                    {
                        intent = new Intent(context, FPVModuleRTCWebCamActivity.class);
                    }
                    else
                    {
                        intent = new Intent(context, FPVDroneRTCWebCamActivity.class);
                    }
                    // enforce RTC
                    //final Intent intent = new Intent(context, FPVDroneRTCWebChromeCamActivity.class);
                    context.startActivity(intent);

        }
    }

}
