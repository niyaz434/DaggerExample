package com.dagger.example.models;

import android.util.Log;

import javax.inject.Inject;

import static android.content.ContentValues.TAG;

public class Engine {

    @Inject
    public Engine() {
    }

    void setup() {
        Log.d(TAG, "setup: Engine got setup along with the car");
    }
}
