package com.abidjamil.daggerimplementation.DataModels.Car;

import com.abidjamil.daggerimplementation.DataModels.Wheel.Rims;
import com.abidjamil.daggerimplementation.DataModels.Wheel.Tires;

import javax.inject.Inject;

public class Wheels {
    @Inject
    Tires tires;
    @Inject
    Rims rims;

    @Inject
    public Wheels() {
    }

    public Wheels(Tires tires, Rims rims) {
        this.tires = tires;
        this.rims = rims;
    }
}
