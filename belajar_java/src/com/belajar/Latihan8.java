package com.belajar;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Latihan8 {
    public static void main(String[] args) throws IOException{
        String nama;
        int umur;
        // Membuat objek inputstream
        InputStreamReader isr = new InputStreamReader(System.in);
        // Membuat objek BufferedReader
        BufferedReader br = new BufferedReader(isr);
        // Mengisi variabel nama dengan BufferedReader
        System.out.print("inputkan nama anda : ");
        nama = br.readLine();
        System.out.print("Inputkan Umur Anda : ");
        umur = Integer.parseInt(br.readLine());

        // Tampilkan output isi variabel nama
        System.out.println("Nama Anda Adalah " + nama);
        System.out.println("Umur Anda Adalah " + umur);
    
    }
}
