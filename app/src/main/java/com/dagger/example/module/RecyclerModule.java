package com.dagger.example.module;

import com.dagger.example.adapter.RecyclerAdapter;

import java.util.ArrayList;

import dagger.Module;
import dagger.Provides;

@Module
public class RecyclerModule {

    @Provides
    RecyclerAdapter recyclerAdapter(){
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("This is text no 1");
        stringArrayList.add("This is text no 2");
        stringArrayList.add("This is text no 3");
        return new RecyclerAdapter(stringArrayList);
    }
}
