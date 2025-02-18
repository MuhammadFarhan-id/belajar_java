package com.belajar;

public class Kucing extends Mamalia {
    public static void main(String[] args) {
        Binatang b = new Binatang();
        Mamalia m = new Mamalia();
        Kucing k = new Kucing();

        System.out.println(b instanceof Binatang);
        System.out.println(m instanceof Mamalia);
        System.out.println(k instanceof Kucing);
        }
}
// Output:
// true 
// true
// true
// Penjelasan:
// Kucing adalah turunan dari Mamalia, dan Mamalia adalah turunan dari Binatang.
// Karena Kucing adalah turunan dari Mamalia, maka Kucing juga merupakan turunan dari Binatang.
// Karena Kucing adalah turunan dari Mamalia, maka Kucing juga merupakan turunan dari Object.
// Karena Mamalia adalah turunan dari Binatang, maka Mamalia juga merupakan turunan dari Object.
// Karena Binatang adalah turunan dari Object, maka Binatang juga merupakan turunan dari Object.
// Karena semua class di Java adalah turunan dari Object, maka semua class di Java juga merupakan turunan dari Object.