public class Layanan {
    private String serviceName;
    private double servicePrice;

    public Layanan(String serviceName, double servicePrice) {
        this.serviceName = serviceName;
        this.servicePrice = servicePrice;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(double servicePrice) {
        this.servicePrice = servicePrice;
    }

    // Perhitungan total biaya berdasarkan jenis kendaraan
    public double hitungTotalBiaya(String tipeKendaraan) {
        if (tipeKendaraan.equalsIgnoreCase("Mobil")) {
            return servicePrice + 50000;
        } else if (tipeKendaraan.equalsIgnoreCase("Sepeda Motor")) {
            return servicePrice + 20000;
        }
        return servicePrice;
    }
} 