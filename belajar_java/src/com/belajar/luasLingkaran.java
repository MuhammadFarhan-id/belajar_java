package com.belajar;
import java.util.Scanner;

public class luasLingkaran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jari-jari lingkaran : ");
        double r = scanner.nextDouble();
        
        double luas = 3.14 * r * r;
        System.out.println("Luas lingkaran: " + luas);
    }
}   
