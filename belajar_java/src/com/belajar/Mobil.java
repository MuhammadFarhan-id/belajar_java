package com.belajar;
//latihan void method
public class Mobil {
    String warna;
    int tahunProduksi;
    int nomorMesin;
    int nomorRangka;
    public static void main(String[] args) {
        Mobil mobilNiaga = new Mobil();
        //pemanggilan method void
        mobilNiaga.isi ();
        mobilNiaga.tampil();
    }
    //mengisi variabel instance
    void isi() {
        warna = "Merah";
        tahunProduksi = 2025;
        nomorMesin = 111111;
        nomorRangka = 12212112;
    }
    //menampilkan isi variabel 
    void tampil() {
        System.out.println("Warna Mobil : " + warna);
        System.out.println("Tahun Produksi : " + tahunProduksi);
        System.out.println("Nomor Mesin : " + nomorMesin);
        System.out.println("Nomor Rangka : " + nomorRangka);
    }
}
