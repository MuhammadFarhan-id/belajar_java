package com.belajar;
import javax.swing.JOptionPane;

public class Latihan7 {
    public static void main(String[] args) {
        String nama = " ";
        nama = JOptionPane.showInputDialog("silahkan masukan nama anda");
        String msg = "Hello " + nama + "!";
        JOptionPane.showMessageDialog(null, msg);
    }
}
