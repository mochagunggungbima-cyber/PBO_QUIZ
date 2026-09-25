import java.util.ArrayList;
import java.util.List;

public class Pelanggan {
    private String nama;
    private String nomorTelepon;
    private List<Kendaraan> daftarKendaraan;

    public Pelanggan(String nama, String nomorTelepon) {
        this.nama = nama;
        this.nomorTelepon = nomorTelepon;
        this.daftarKendaraan = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public List<Kendaraan> getDaftarKendaraan() {
        return daftarKendaraan;
    }

    public void tambahKendaraan(Kendaraan kendaraan) {
        daftarKendaraan.add(kendaraan);
    }
}