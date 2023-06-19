package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayList<DataMahasiswa> list;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tambah_data();
        listView=findViewById(R.id.listview);
        Adapter adapter = new Adapter(getApplicationContext(), list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Toast.makeText(getApplicationContext(), list.get(i).getNama(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    void tambah_data() {
        list=new ArrayList<>();
        list.add(new DataMahasiswa("Mansur", "Jl. Veteran Gg 5"));
        list.add(new DataMahasiswa("Samsul", "Jl. Balaikambang"));
    }
}