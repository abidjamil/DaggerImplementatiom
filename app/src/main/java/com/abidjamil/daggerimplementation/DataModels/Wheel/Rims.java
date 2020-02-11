package com.abidjamil.daggerimplementation.DataModels.Wheel;

import android.util.Log;

import javax.inject.Inject;

public class Rims {

    private static final String TAG = "Car";
    @Inject
    public Rims() {
        Log.d(TAG, "Rims: ...");
    }
}
