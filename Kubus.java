package BangunRuang;

public class Kubus extends BangunRuang {
    private float sisi;

    // Konstruktor untuk Kubus
    public Kubus(float sisi) {
        this.sisi = sisi;
    }

    // Implementasi metode hitungVolume untuk Kubus
    @Override
    public float hitungVolume() {
        return sisi * sisi * sisi;
    }

    // Implementasi metode hitungLuasPermukaan untuk Kubus
    @Override
    public float hitungLuasPermukaan() {
        return 6 * sisi * sisi;
    }
}
