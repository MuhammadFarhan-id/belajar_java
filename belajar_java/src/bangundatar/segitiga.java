package bangundatar;

public class segitiga extends BangunDatar {
    int alas, tinggi;

    public segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public float luas() {
        return this.alas * this.tinggi;
    }    
}
