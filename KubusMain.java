package BangunRuang;

public class KubusMain {
    public static void main(String[] args) {
        // Menggunakan referensi Bentuk3D untuk objek Kubus
        BangunRuang kubus = new Kubus(4);

        // Menghitung volume dan luas permukaan kubus
        System.out.println("Volume Kubus: " + kubus.hitungVolume());
        System.out.println("Luas Permukaan Kubus: " + kubus.hitungLuasPermukaan());
    }
}
