public class kendaraan {
    String platNomor;
    String tipe;
    String merk;

    kendaraan(String platNomor, String tipe, String merk){
        this.platNomor = platNomor;
        this.tipe = tipe;
        this.merk = merk;
    }

    public void tampilkanInformasi() {
        System.out.printf("%-20s %-20s %-20s\n", platNomor, tipe, merk);
    }
}