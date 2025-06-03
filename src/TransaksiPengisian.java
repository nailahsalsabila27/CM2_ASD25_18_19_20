public class TransaksiPengisian {
    kendaraan kendaraan;
    BBM bbm;
    double liter;
    double totalBayar;

    public TransaksiPengisian(kendaraan kendaraan, BBM bbm, double liter, double totalBayar) {
        this.kendaraan = kendaraan;
        this.bbm = bbm;
        this.liter = liter;
        this.totalBayar = totalBayar;
    }

    public void tampilRiwayatTransaksi() {
        System.out.printf("%-10s %-10s %-10d %-10d\n", kendaraan.platNomor, kendaraan.tipe, bbm.namaBBM, totalBayar);
        System.out.println();
    }

}
