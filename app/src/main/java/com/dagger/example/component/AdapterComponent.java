package com.dagger.example.component;

import com.dagger.example.view.MainActivity;
import com.dagger.example.module.RecyclerModule;

import dagger.Component;

@Component(modules = RecyclerModule.class)
public interface AdapterComponent {
    void inject(MainActivity mainActivity);
}
