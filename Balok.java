package BangunRuang;

public class Balok extends BangunRuang {
    private float panjang, lebar, tinggi;

    // Konstruktor untuk Balok
    public Balok(float panjang, float lebar, float tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    // Implementasi metode hitungVolume untuk Balok
    @Override
    public float hitungVolume() {
        return panjang * lebar * tinggi;
    }

    // Implementasi metode hitungLuasPermukaan untuk Balok
    @Override
    public float hitungLuasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
}


