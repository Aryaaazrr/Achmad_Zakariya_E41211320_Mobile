package com.example.cardview;

public class DataMahasiswa {
    String nama= "", alamat = "";
    DataMahasiswa(String setNama, String setAlamat) {
        this.nama=setNama;
        this.alamat=setAlamat;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }
}
