package bangundatar;

public class lingkaran extends BangunDatar {
    int r;

    public lingkaran(int r) {
        this.r = r;
    }

    @Override
    public float luas() {
        return (float) (Math.PI * this.r * this.r);
    }

    @Override
    public float keliling() {
        return (float) (2 * Math.PI * this.r);
    }
}
