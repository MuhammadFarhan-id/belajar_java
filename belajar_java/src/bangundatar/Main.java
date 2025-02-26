package bangundatar;

public class Main {
    public static void main(String[] args) {
        BangunDatar bangunDatar = new BangunDatar();
        persegi persegi = new persegi(4);
        segitiga segitiga = new segitiga(6, 3);
        lingkaran lingkaran = new lingkaran(7);

        //memanggil method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();

        System.out.println("Luas persegi: " + persegi.luas());
        System.out.println("Keliling persegi: " + persegi.keliling());
        System.out.println("Luas segitiga: " + segitiga.luas());
        System.out.println("Luas lingkaran: " + lingkaran.luas());
        System.out.println("Keliling lingkaran: " + lingkaran.keliling());

    }
}
