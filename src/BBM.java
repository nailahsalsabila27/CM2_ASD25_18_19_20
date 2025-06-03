public class BBM {
    String namaBBM;
    double hargaPerLiter;

    public BBM(String namaBBM, double hargaPerLiter) {
        this.namaBBM = namaBBM;
        this.hargaPerLiter = hargaPerLiter;
    }

    public void tampilkanInformasiBBM() {
        System.out.printf("%-15s %-15.2f\n", namaBBM, hargaPerLiter);
    }

    public static BBM[] daftarBBM = {
            new BBM("Pertalite", 10000),
            new BBM("Pertamax", 12400),
            new BBM("Biosolar", 6800),
            new BBM("DexLite", 13400)
    };
}
