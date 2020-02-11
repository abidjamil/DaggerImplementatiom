package com.abidjamil.daggerimplementation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.abidjamil.daggerimplementation.Components.CarComponent;

import com.abidjamil.daggerimplementation.Components.DaggerCarComponent;
import com.abidjamil.daggerimplementation.DataModels.Car.Car;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject Car car;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent carComponent = DaggerCarComponent.create();
        car = carComponent.getcar();
        car.drive();

    }
}
