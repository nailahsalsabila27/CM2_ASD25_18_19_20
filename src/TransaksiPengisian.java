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
        System.out.printf("%-15s %-15s %-15s %-10.2f\n",
                kendaraan.platNomor,
                kendaraan.tipe,
                bbm.namaBBM,
                totalBayar);
    }

}
