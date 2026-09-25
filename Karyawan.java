public class Karyawan {
    private String karyawanId;
    private String namaKaryawan;
    private String posisi;

    public Karyawan(String karyawanId, String namaKaryawan, String posisi) {
        this.karyawanId = karyawanId;
        this.namaKaryawan = namaKaryawan;
        this.posisi = posisi;
    }

    public String getKaryawanId() {
        return karyawanId;
    }

    public void setKaryawanId(String karyawanId) {
        this.karyawanId = karyawanId;
    }

    public String getNamaKaryawan() {
        return namaKaryawan;
    }

    public void setNamaKaryawan(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }

    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public void melayaniServis(Pelanggan pelanggan, Kendaraan kendaraan, Layanan layanan) {
        double totalBiaya = layanan.hitungTotalBiaya(kendaraan.getTipeKendaraan());
        System.out.println("Teknisi/Karyawan : " + namaKaryawan + " (" + posisi + ")");
        System.out.println("Pelanggan        : " + pelanggan.getNama() + " (" + pelanggan.getNomorTelepon() + ")");
        System.out.println("Kendaraan        : " + kendaraan.getMerek() + " " + kendaraan.getModel() + 
                           " [" + kendaraan.getPlatNomor() + "] - " + kendaraan.getTipeKendaraan());
        System.out.println("Layanan          : " + layanan.getServiceName() + " (Harga Dasar: Rp " + (long)layanan.getServicePrice() + ")");
        System.out.println("Total Biaya      : Rp " + (long)totalBiaya);
        System.out.println("------------------------------------------------------------------");
    }
}