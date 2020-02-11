package com.abidjamil.daggerimplementation.Components;

import com.abidjamil.daggerimplementation.DataModels.Car.Car;
import com.abidjamil.daggerimplementation.MainActivity;

import dagger.Component;

@Component (modules = WheelModule.class)
public interface CarComponent {

    Car getcar();

    void inject (MainActivity activity);
}
