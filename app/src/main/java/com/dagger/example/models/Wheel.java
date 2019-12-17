package com.dagger.example.models;

public class Wheel {
    Rim rim;
    Tyres tyres;

    public Wheel(Rim rim, Tyres tyres) {
        this.rim = rim;
        this.tyres = tyres;
    }

}
