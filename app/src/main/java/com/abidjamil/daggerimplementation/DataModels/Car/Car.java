package com.abidjamil.daggerimplementation.DataModels.Car;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";

    private Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    public void drive(){
        Log.d(TAG, "driving ....");
    }

    @Inject
    public void enableRemote(Remote remote)
    {
        remote.setListener(this);
    }
}
