package BangunRuang;

public class BalokMain {
    public static void main(String[] args) {
        // Menggunakan referensi Bentuk3D untuk objek Balok
        BangunRuang balok = new Balok(5, 3, 2);

        // Menghitung volume dan luas permukaan balok
        System.out.println("Volume Balok: " + balok.hitungVolume());
        System.out.println("Luas Permukaan Balok: " + balok.hitungLuasPermukaan());
    }
}
