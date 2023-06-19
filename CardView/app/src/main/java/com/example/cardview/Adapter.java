package com.example.cardview;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends BaseAdapter {

    LayoutInflater layoutInflater;
    Context context;
    ArrayList<DataMahasiswa> model;
    Adapter(Context context, ArrayList<DataMahasiswa> model)    {
        this.context=context;
        this.layoutInflater=LayoutInflater.from(context);
        this.model=model;
    }

    @Override
    public int getCount() {
        return model.size();
    }

    @Override
    public Object getItem(int index) {
        return model.get(index);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    TextView nama, alamat;
    @Override
    public View getView(int index, View view, ViewGroup viewGroup) {
        View view1=layoutInflater.inflate(R.layout.list_item, viewGroup, false);
        nama=view1.findViewById(R.id.nama);
        alamat=view1.findViewById(R.id.alamat);

        nama.setText(model.get(index).getNama());
        alamat.setText(model.get(index).getAlamat());
        return view1;
    }
}
