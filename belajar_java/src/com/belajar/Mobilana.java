package com.belajar;

public class Mobilana {
    //variabel static
    static String Warna = "Hitam";
    static int TahunProduksi = 2025;
    //method static
    static void ubah(){
        Warna = "ireng";

    }
    static void tampil(){
        System.out.println("Warna Mobil : " + Warna);
        System.out.println("Tahun Produksi : " + TahunProduksi);
    }
    public static void main(String[] args) {
        //pemanggilan method static
        Mobilana.ubah();
        Mobilana.tampil();
    }
}
