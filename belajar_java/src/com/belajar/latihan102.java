package com.belajar;

import java.util.ArrayList;
import java.util.Scanner;

class Barang {
    String nama;
    int jumlah;
    double harga;

    // Konstruktor untuk membuat objek Barang
    public Barang(String nama, int jumlah, double harga) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    // Metode untuk mengurangi stok barang
    public void kurangiStok(int jumlahYangDikurangi) {
        if (jumlahYangDikurangi <= jumlah) {
            jumlah -= jumlahYangDikurangi;
            System.out.println("Stok " + nama + " berhasil dikurangi sebanyak " + jumlahYangDikurangi);
        } else {
            System.out.println("Stok tidak cukup untuk mengurangi " + jumlahYangDikurangi + " barang.");
        }
    }

    // Menampilkan informasi barang
    public void tampilkanInfo() {
        System.out.println("Nama Barang: " + nama + ", Harga: Rp" + harga + ", Stok: " + jumlah);
    }
}

public class latihan102 {
    static ArrayList<Barang> daftarBarang = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    // Menambah barang baru ke dalam daftar
    public static void tambahBarang(String nama, int jumlah, double harga) {
        daftarBarang.add(new Barang(nama, jumlah, harga));
    }

    // Menampilkan semua daftar barang
    public static void tampilkanDaftarBarang() {
        if (daftarBarang.isEmpty()) {
            System.out.println("Daftar barang kosong.");
        } else {
            for (int i = 0; i < daftarBarang.size(); i++) {
                Barang barang = daftarBarang.get(i);
                System.out.println((i + 1) + ". " + barang.nama + " - Harga: Rp" + barang.harga + " - Stok: " + barang.jumlah);
            }
        }
    }

    public static void main(String[] args) {
        // Menambahkan 10 barang dengan harga dan stok awal 10
        tambahBarang("Beras 5kg", 10, 50000);
        tambahBarang("Gula Pasir 1kg", 10, 15000);
        tambahBarang("Minyak Goreng 1L", 10, 22000);
        tambahBarang("Tepung Terigu 1kg", 10, 10000);
        tambahBarang("Telur Ayam 1 Papan", 10, 25000);
        tambahBarang("Susu UHT 1L", 10, 12000);
        tambahBarang("Mie Instan (Pack)", 10, 4000);
        tambahBarang("Kopi Bubuk 250g", 10, 18000);
        tambahBarang("Roti Tawar 1 Loaf", 10, 10000);
        tambahBarang("Sabun Cuci Piring 500ml", 10, 7000);

        // Menampilkan menu interaktif
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Beli Barang");
            System.out.println("2. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();  // Membersihkan buffer setelah nextInt
            switch (pilihan) {
                case 1:
                    // Memilih barang untuk dibeli
                    tampilkanDaftarBarang();
                    System.out.print("Pilih nomor barang yang akan dibeli: ");
                    int pilihanBarang = scanner.nextInt();
                    scanner.nextLine();  // Membersihkan buffer

                    if (pilihanBarang < 1 || pilihanBarang > daftarBarang.size()) {
                        System.out.println("Barang tidak ditemukan.");
                        break;
                    }

                    Barang barangTerpilih = daftarBarang.get(pilihanBarang - 1);
                    System.out.print("Masukkan jumlah barang yang ingin dibeli: ");
                    int jumlahBeli = scanner.nextInt();
                    scanner.nextLine();  // Membersihkan buffer1


                    if (jumlahBeli <= 0) {
                        System.out.println("Jumlah yang dibeli tidak valid.");
                        break;
                    } 
                    System.out.println("ada tambahan y/n");
                    String tambahan = scanner.nextLine();
                    if (tambahan.equals("y")) {
                        System.out.print("Masukkan tambahan barang: ");
                        tampilkanDaftarBarang();
                        int tambahanBarang = scanner.nextInt();
                    }
                    // Menghitung total harga
                    double totalHarga = barangTerpilih.harga * jumlahBeli;
                    System.out.println("Nama Barang: " + barangTerpilih.nama);
                    System.out.println("Harga Barang: Rp" + barangTerpilih.harga);
                    System.out.println("Jumlah Barang: " + jumlahBeli);
                    System.out.println("Total Harga: Rp" + totalHarga);

                    // Memasukkan uang yang dibayar
                    System.out.print("Masukkan uang yang dibayar: Rp");
                    double uangDibayar = scanner.nextDouble();
                    scanner.nextLine();  // Membersihkan buffer

                    // Menghitung kembalian
                    if (uangDibayar < totalHarga) {
                        System.out.println("Uang tidak cukup untuk membeli barang tersebut.");
                    } else {
                        double kembalian = uangDibayar - totalHarga;
                        System.out.println("Jumlah Yang Dibeli: " + jumlahBeli);
                        System.out.println("Total Harga: Rp" + totalHarga);
                        System.out.println("Uang Dibayar: Rp" + uangDibayar);
                        System.out.println("Kembalian: Rp" + kembalian);

                        // Mengurangi stok barang                                                       
                        barangTerpilih.kurangiStok(jumlahBeli);
                    }
                    break;

                case 2:
                    System.out.println("Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
