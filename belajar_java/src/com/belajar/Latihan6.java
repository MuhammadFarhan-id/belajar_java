package com.belajar;

import java.util.Scanner;

public class Latihan6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // input usia
        System.out.print("Masukkan usia : ");
        int usia = scanner.nextInt();
        
        if (usia < 12) {
            System.out.println("termasuk kategori Anak-anak");
        } else if (usia >= 12 && usia <= 17) {
            System.out.println("termasuk kategori Remaja");
        } else {
            System.out.println("termasuk kategori Dewasa");
        }
        
    }
}

