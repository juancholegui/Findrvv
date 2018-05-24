package com.finder.infinitumk.findr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.hsalf.smilerating.SmileRating;

public class barRating extends AppCompatActivity {
RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_rating);


recyclerView= findViewById(R.id.rv);
        LinearLayoutManager layoutManager= new LinearLayoutManager(this);
RecyclerView.LayoutManager rvLayoutManager =layoutManager;

recyclerView.setLayoutManager(rvLayoutManager);

    }
}
