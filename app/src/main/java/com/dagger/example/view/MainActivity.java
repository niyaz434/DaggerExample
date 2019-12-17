package com.dagger.example.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dagger.example.R;
import com.dagger.example.adapter.RecyclerAdapter;
import com.dagger.example.component.AdapterComponent;
import com.dagger.example.component.DaggerAdapterComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recycler_view;

    @Inject
    RecyclerAdapter recyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*setting with dagger component*/
        AdapterComponent adapterComponent = DaggerAdapterComponent.create();
        adapterComponent.inject(this);

        /*setting recycler view*/
        recycler_view = findViewById(R.id.recycler_view);
        recycler_view.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
        recycler_view.setHasFixedSize(true);
        recycler_view.setAdapter(recyclerAdapter);
    }
}
