package com.abidjamil.daggerimplementation.Components;

import com.abidjamil.daggerimplementation.DataModels.Car.Wheels;
import com.abidjamil.daggerimplementation.DataModels.Wheel.Tires;
import com.abidjamil.daggerimplementation.DataModels.Wheel.Rims;
import dagger.Module;
import dagger.Provides;

@Module
public class WheelModule {

    @Provides
    Tires provideTires() {
        return  new Tires();
    }
    @Provides
    Rims provideRims() {
        return  new Rims();
    }

    @Provides
    Wheels provideWheels(Rims rims, Tires tires){
      return new Wheels(tires, rims);
    }
}
