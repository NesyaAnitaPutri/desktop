/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class tugas {
    private String ID;
    private String nama;
    private String tanggalProduksi;
    private String warna;
    private String jumlah ;
    private String harga;

    public tugas(String ID, String nama, String tanggalProduksi, String warna, String jumlah , String harga) {
        this.ID = ID;
        this.nama = nama;
        this.tanggalProduksi = tanggalProduksi;
        this.warna = warna;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTanggalProduksi() {
        return tanggalProduksi;
    }

    public void setTanggalProduksi(String tanggalProduksi) {
        this.tanggalProduksi = tanggalProduksi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    public String getHarga(){
        return harga;
    }
    public void setHarga(String harga){
        this.harga =harga;
    }
}