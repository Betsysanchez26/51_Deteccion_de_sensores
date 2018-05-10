package com.example.betsysanchez.a51_deteccion_de_sensores;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private SensorManager sensorManager;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    List<DataProvider> lista;

    @Override protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        lista = new ArrayList<>();
        sensorManager = (SensorManager)this.getSystemService(SENSOR_SERVICE);
        List<Sensor> list = sensorManager.getSensorList(Sensor.TYPE_ALL);
        StringBuilder data = new StringBuilder();
        String name,vendor,version;
        for(int i=1; i<list.size(); i++){
            name="Nombre :"+list.get(i).getName()+"";
            vendor="Fabricante:"+list.get(i).getVendor()+"";
            version="Version :"+list.get(i).getVersion()+"";
            lista.add(new DataProvider(name,vendor,version));
        }
        adapter= new RecyclerAdapter(lista,this);

        layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

}
