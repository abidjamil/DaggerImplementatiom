package com.abidjamil.daggerimplementation.DataModels.Car;

import android.util.Log;

import com.abidjamil.daggerimplementation.DataModels.Car.Car;

import javax.inject.Inject;

class Remote {

    private static final String TAG = "Car";
    @Inject
    public Remote() {
    }

    public void setListener(Car car)
    {
        Log.d(TAG, "setListener: Remote ");
    }
}
