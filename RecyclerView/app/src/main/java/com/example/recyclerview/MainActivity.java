package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {

    // cara pertama
    String[] nama={
            "Arya",
            "Mansur",
            "Cecep",
            "Tomo"
    };

    // cara kedua
    ArrayList<String> data_nama;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listView);
        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, nama);
        listView.setAdapter(adapter);
    }

    // sambungan cara kedua
    void data() {
        data_nama = new ArrayList<String>();
        data_nama.add("Arya");
        data_nama.add("Mansur");
        data_nama.add("Cecep");
        data_nama.add("Tomo");
    }
}