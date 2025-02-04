package com.belajar;
import java.util.Scanner;

public class Latihan9 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nama barang : ");
        String inputBarang = scanner.nextLine();  
        
        switch (inputBarang) { 
            case "laptop":
                System.out.println("Harga Laptop adalah Rp 15.000.000");
                break;
            case "smartphone":
                System.out.println("Harga Smartphone adalah Rp 7.000.000");
                break;
            case "headphone":
                System.out.println("Harga Headphone adalah Rp 1.000.000");
                break;
            case "kamera":
                System.out.println("Harga Kamera adalah Rp 5.000.000");
                break;
            case "tablet":
                System.out.println("Harga Tablet adalah Rp 4.000.000");
                break;
            default:
                System.out.println("Barang yang Anda masukkan tidak ditemukan.");
                break;
        }
        
        
    }
}


