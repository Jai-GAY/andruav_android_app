package com.andruav.event.droneReport_7adath;


import com.andruav.andruavUnit.AndruavUnitBase;

/**
 * Created by mhefny on 6/19/16.
 */
public class _7adath_GeoFence_Ready {

    public AndruavUnitBase andruavWe7da;
    public String fenceName;


    public _7adath_GeoFence_Ready(AndruavUnitBase andruavUnit, String fenceName)
    {
        andruavWe7da = andruavUnit;
        this.fenceName = fenceName;
    }
}
