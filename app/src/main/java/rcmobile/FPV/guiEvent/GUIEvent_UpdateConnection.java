package rcmobile.FPV.guiEvent;

import com.andruav.andruavUnit.AndruavUnitBase;

/**
 * Created by mhefny on 12/4/16.
 */

public class GUIEvent_UpdateConnection {

    public AndruavUnitBase andruavUnitBase;

    public GUIEvent_UpdateConnection (final AndruavUnitBase andruavUnitBase)
    {
        this.andruavUnitBase = andruavUnitBase;
    }
}
