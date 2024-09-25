package BangunRuang;

public class KubusMain {
     public static void main(String[] args) {
        // Membuat objek Kubus
        Kubus kubus = new Kubus();

        // Menghitung volume dan luas permukaan kubus
        double sisi = 4;
        double volumeKubus = kubus.hitungVolume(sisi);
        double luasPermukaanKubus = kubus.hitungLuasPermukaan(sisi);

        // Menampilkan hasil perhitungan
        System.out.println("Volume Kubus: " + volumeKubus);
        System.out.println("Luas Permukaan Kubus: " + luasPermukaanKubus);
    }
}
