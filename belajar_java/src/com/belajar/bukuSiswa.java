package com.belajar;

public class bukuSiswa extends buku {
    public static void main(String[] args){
        buku modul = new buku();
        System.out.println(modul.judul);
        System.out.println(modul.tahunTerbit);
        modul.kategori();
    }
}
