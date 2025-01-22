package com.belajar;

public class Latihan3 {
    //menggunakan operator logika
    public static void main(String[] args) {
        int A = 40;
        int B = 70;
        int C = 90;
        boolean a = A > B && B < C || C < B;
        boolean b = A < B || B < C && C < B;
        System.out.println(a);
        System.out.println(b);
    }
}
