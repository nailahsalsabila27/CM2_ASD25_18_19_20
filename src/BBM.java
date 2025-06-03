public class BBM {
    String namaBBM;
    double hargaPerLiter;

    BBM(String namaBBM, double hargaPerLiter) {
        this.namaBBM = namaBBM;
        this.hargaPerLiter = hargaPerLiter;
    }

    public void tampilkanInformasiBBM() {
        System.out.printf("-15%s, -15%s, -15%s", namaBBM, hargaPerLiter);
    }
}