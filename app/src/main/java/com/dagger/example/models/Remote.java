package com.dagger.example.models;

import android.util.Log;

import com.dagger.example.models.Car;

import javax.inject.Inject;

import static android.content.ContentValues.TAG;

public class Remote {
    @Inject
    public Remote() {
    }

    public void setListener(Car car) {
        Log.d(TAG, "setListener: Remote Connected");
    }
}
