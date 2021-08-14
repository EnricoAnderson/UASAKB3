package com.example.uas_akb3;
// Dibuat oleh 10118353 Enrico Anderson IF8 pada 14 Agustus 2021
public class DataIsi {
    private String Nama;
    private String Alamat;
    private Double longitude;
    private Double latitude;


    public void setNama(String nama) {
        Nama = nama;
    }

    public String getNama() {
        return Nama;
    }

    public void setAlamat(String alamat) {
        Alamat = alamat;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLatitude() {
        return latitude;
    }


}
