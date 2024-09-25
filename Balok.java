package BangunRuang;

public class Balok {
    // Metode untuk menghitung volume balok
    public double hitungVolume(double panjang, double lebar, double tinggi) {
        return panjang * lebar * tinggi;
    }

    // Metode untuk menghitung luas permukaan balok
    public double hitungLuasPermukaan(double panjang, double lebar, double tinggi) {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
}

