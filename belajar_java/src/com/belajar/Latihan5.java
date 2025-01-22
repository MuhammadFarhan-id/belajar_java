package com.belajar;
import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args) {
        int idPasien;
        String namaPasien, alamat, keluhan;
        Scanner Input = new Scanner(System.in);
        System.out.println("Data Pasien");
        System.out.println("-----------");
        System.out.print("idPasien : ");
        idPasien = Input.nextInt();
        System.out.print("namaPasien : ");
        namaPasien = Input.next();
        System.out.print("alamat : ");
        alamat = Input.next();
        System.out.print("keluhan : ");
        keluhan = Input.next();

    
        // Menampilkan data pasien
        System.out.println("DATA PASIEN");
        System.out.println("-----------");
        System.out.println("IdPasien: " + idPasien);
        System.out.println("namaPasien: " + namaPasien);
        System.out.println("alamat: " + alamat);
        System.out.println("keluhan: " + keluhan);
    }
}
