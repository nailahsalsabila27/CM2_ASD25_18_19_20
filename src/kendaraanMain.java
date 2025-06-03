import java.util.Scanner;

public class kendaraanMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList data = new SingleLinkedList();
        SingleLinkedListTr tr = new SingleLinkedListTr();
        int menu;

        do {
            System.out.println("\nSistem Antrian SPBU");
            System.out.println("1. Tambah Antrian.");
            System.out.println("2. Lihat Antrian.");
            System.out.println("3. Cek Sisa Antrian Kendaraan.");
            System.out.println("4. Layani Kendaraan.");
            System.out.println("5. Lihat Riwayat Transaksi.");
            System.out.println("6. Sort Riwayat Transaksi.");
            System.out.println("7. keluar.");
            System.out.print("Pilih Menu : ");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("input plat nomor: ");
                    String plat = sc.nextLine();
                    System.out.print("input jenis kendaraan: ");
                    String jenis = sc.nextLine();
                    System.out.print("input merk: ");
                    String merk = sc.nextLine();
                    kendaraan add = new kendaraan(plat, jenis, merk);
                    data.addLast(add);
                    break;
                case 2:
                    data.printAntrian();
                    break;
                case 3:
                    System.out.println(">> sisa antrian : " + data.size());
                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("-- Riwayat Transaksi --");
                    tr.tampilRiwayat();
                    break;
                case 6:
                    data.sorting();

                    break;
                case 7:
                    System.out.println("Terima Kasih!");
                    break;
                default:
                    break;
            }
        } while (menu != 7);
        sc.close();
    }
}