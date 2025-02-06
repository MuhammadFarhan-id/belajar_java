package com.belajar;
import java.util.Scanner;

public class latihan10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan nama barang : ");
        String namaBarang = scanner.nextLine();

        System.out.print("masukan harga barang : ");
        double harga = scanner.nextDouble();

        System.out.print("masukan jumlah barang : ");
        int jumlahBarang = scanner.nextInt();

        double totalHarga = harga * jumlahBarang;

        System.out.println("Nama Barang Yang Dibeli: " + namaBarang);
        System.out.println("Harga Barang: " + harga);
        System.out.println("Jumlah Yang Dibeli: " + jumlahBarang);
        System.out.println("Total Harga: " + totalHarga);
        System.out.println();
    }
}
