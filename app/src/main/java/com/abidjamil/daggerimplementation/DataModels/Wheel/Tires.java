package com.abidjamil.daggerimplementation.DataModels.Wheel;

import android.util.Log;

import javax.inject.Inject;

public class Tires {

    private static final String TAG = "Car";
    @Inject
    public Tires() {
        Log.d(TAG, "Tires:...");
    }
}
