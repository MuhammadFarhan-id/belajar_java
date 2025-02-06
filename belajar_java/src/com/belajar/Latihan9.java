package com.belajar;
import java.util.Scanner;

public class Latihan9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nama barang: \nlaptop \ntv \nhp \nkamera \ntablet \nhanya yang tertulis diatas yang tersedia :  ");
        String inputBarang = scanner.nextLine();
        
        System.out.print("Masukkan jumlah barang yang ingin dibeli: ");
        int jumlahBarang = scanner.nextInt();

        int hargaBarang = 0;
        
        switch (inputBarang.toLowerCase()) { 
            case "laptop":
                hargaBarang = 1000;
                break;
            case "tv":
                hargaBarang = 2000;
                break;
            case "hp":
                hargaBarang = 3000;
                break;
            case "kamera":
                hargaBarang = 4000;
                break;
            case "tablet":
                hargaBarang = 5000;
                break;
            default:
                System.out.println("Barang yang Anda masukkan tidak ditemukan.");
                break;
        }
        
        int totalHarga = hargaBarang * jumlahBarang;
        
        System.out.println("Anda membeli " + jumlahBarang + " " + inputBarang);
        System.out.println("Total harga: Rp " + totalHarga);
    }
}


