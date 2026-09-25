public class Main {
    public static void main(String[] args) {
        // 1. Buat data Karyawan & Layanan
        Karyawan mekanik = new Karyawan("K001", "Budi Santoso", "Mekanik Senior");
        Layanan servisRutin = new Layanan("Servis Berkala", 100000);

        // 2. Buat Pelanggan
        Pelanggan pelanggan1 = new Pelanggan("Andi", "08123456789");

        // 3. Buat 2 Mobil & 2 Sepeda Motor
        Kendaraan mobil1 = new Kendaraan("N 1234 AB", "Toyota", "Avanza", "Mobil");
        Kendaraan mobil2 = new Kendaraan("N 5678 CD", "Honda", "CR-V", "Mobil");
        Kendaraan motor1 = new Kendaraan("N 9101 EF", "Yamaha", "NMAX", "Sepeda Motor");
        Kendaraan motor2 = new Kendaraan("N 1121 GH", "Honda", "Vario", "Sepeda Motor");

        // 4. Hubungkan Kendaraan ke Pelanggan (1 Pelanggan punya banyak kendaraan)
        pelanggan1.tambahKendaraan(mobil1);
        pelanggan1.tambahKendaraan(mobil2);
        pelanggan1.tambahKendaraan(motor1);
        pelanggan1.tambahKendaraan(motor2);

        // 5. Output Informasi Layanan & Transaksi
        System.out.println("=== SISTEM MANAJEMEN BENGKEL MAJU ===");
        System.out.println("Layanan Tersedia : " + servisRutin.getServiceName() + " | Rp " + (long)servisRutin.getServicePrice());
        System.out.println("==================================================\n");

        for (Kendaraan k : pelanggan1.getDaftarKendaraan()) {
            mekanik.melayaniServis(pelanggan1, k, servisRutin);
        }
    }
}