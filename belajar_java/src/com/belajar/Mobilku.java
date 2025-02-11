package com.belajar;
// Latihan method non void
public class Mobilku {
    String warna;
    int tahunProduksi;
    int nomorMesin;
    int nomorRangka;
    //method mengisi variabel instance
    void isi(String warna, int tahunProduksi, int nomorMesin, int nomorRangka) {
       this.warna = warna;
         this.tahunProduksi = tahunProduksi;
            this.nomorMesin = nomorMesin;
                this.nomorRangka = nomorRangka;
    }
    //method menampilkan isi variabel
   String ambilWarna() {
        return warna;
    }
    int ambilTahunProduksi() {
        return tahunProduksi;
    }
    int ambilNomorMesin() {
        return nomorMesin;
    }
    int ambilNomorRangka() {
        return nomorRangka;
    }
    public static void main(String[] args) {
        Mobilku mobilNiaga = new Mobilku();
        //pemanggilan method non void
        mobilNiaga.isi("Merah", 2025, 111111, 12212112);
        System.out.println("Warna Mobil : " + mobilNiaga.ambilWarna());
        System.out.println("Tahun Produksi : " + mobilNiaga.ambilTahunProduksi());
        System.out.println("Nomor Mesin : " + mobilNiaga.ambilNomorMesin());
        System.out.println("Nomor Rangka : " + mobilNiaga.ambilNomorRangka());
    }
}