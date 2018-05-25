 package com.finder.infinitumk.findr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

 public class bars extends AppCompatActivity {
RecyclerView recyclerView;
ArrayList<ModelBar>barslist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bars);

        recyclerView=findViewById(R.id.rv);

        barslist= new ArrayList<>();
barslist.add(new ModelBar(R.drawable.picbr,"Dora'sPUB", "PUB", "Pick up"));
        barslist.add(new ModelBar(R.drawable.gordo,"Dora'sPUB", "PUB", "Pick up"));
        barslist.add(new ModelBar(R.drawable.gordo2,"Dora'sPUB", "PUB", "Pick up"));
        barslist.add(new ModelBar(R.drawable.gordo3,"Dora'sPUB", "PUB", "Pick up"));

        LinearLayoutManager layoutManager= new LinearLayoutManager(this);
        RecyclerView.LayoutManager rvLayoutManager=layoutManager;
        recyclerView.setLayoutManager(rvLayoutManager);
bars_Adapter adapter=new bars_Adapter(this,barslist);
recyclerView.setAdapter(adapter);

    }
}
