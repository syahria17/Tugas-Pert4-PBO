package BangunRuang;

public class BalokMain {
    public static void main(String[] args) {
        // Membuat objek Balok
        Balok balok = new Balok();

        // Menghitung volume dan luas permukaan balok
        double panjang = 5, lebar = 3, tinggi = 2;
        double volumeBalok = balok.hitungVolume(panjang, lebar, tinggi);
        double luasPermukaanBalok = balok.hitungLuasPermukaan(panjang, lebar, tinggi);

        // Menampilkan hasil perhitungan
        System.out.println("Volume Balok: " + volumeBalok);
        System.out.println("Luas Permukaan Balok: " + luasPermukaanBalok);
    }
}
