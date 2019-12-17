package com.dagger.example.models;

import android.util.Log;

import javax.inject.Inject;

import static android.content.ContentValues.TAG;

public class Car {
    Engine engine;
    Wheel wheel;

    @Inject
    public Car(Engine engine, Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }

    @Inject
    public void enableConnect(Remote remote) {
        remote.setListener(this);
    }

    public void drive() {
        Log.d(TAG, "drive: ++ Driving a car via dagger");
    }
}
