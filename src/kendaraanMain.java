import java.util.Scanner;

public class kendaraanMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList data = new SingleLinkedList();
        SingleLinkedListTr tr = new SingleLinkedListTr();
        SingleLinkedListBBM sllBBM = new SingleLinkedListBBM();
        sllBBM.tambahSemuaBBM(); // ⬅️ Tambahkan semua BBM
        int menu;

        do {
            System.out.println("\nSistem Antrian SPBU");
            System.out.println("1. Tambah Antrian.");
            System.out.println("2. Lihat Antrian.");
            System.out.println("3. Cek Sisa Antrian Kendaraan.");
            System.out.println("4. Layani Kendaraan.");
            System.out.println("5. Lihat Riwayat Transaksi.");
            System.out.println("6. Sort Riwayat Transaksi.");
            System.out.println("7. Keluar.");
            System.out.print("Pilih Menu : ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Input plat nomor: ");
                    String plat = sc.nextLine();
                    System.out.print("Input jenis kendaraan: ");
                    String jenis = sc.nextLine();
                    System.out.print("Input merk: ");
                    String merk = sc.nextLine();
                    kendaraan add = new kendaraan(plat, jenis, merk);
                    data.addLast(add);
                    break;
                case 2:
                    data.printAntrian();
                    break;
                case 3:
                    System.out.println(">> Sisa antrian : " + data.size());
                    break;
                case 4:
                    if (data.isEmpty()) {
                        System.out.println("Tidak ada kendaraan dalam antrian.");
                        break;
                    }
                    kendaraan dilayani = data.removeFirst();
                    System.out.println("Kendaraan " + dilayani.platNomor);
                    System.out.println("Daftar Jenis BBM:");
                    System.out.printf("%-15s %-15s\n", "Jenis BBM", "Harga");
                    sllBBM.tampilDataBBM();

                    System.out.print("\nPilih BBM:\ninput jenis BBM: ");
                    String cari = sc.nextLine();
                    BBM bbmDipilih = sllBBM.cariBBM(cari);
                    if (bbmDipilih != null) {
                        System.out.print("Input jumlah (liter): ");
                        double liter = sc.nextDouble();
                        sc.nextLine();
                        double total = liter * bbmDipilih.hargaPerLiter;
                        TransaksiPengisian t = new TransaksiPengisian(dilayani, bbmDipilih, liter, total);
                        tr.addRiwayat(t);
                        System.out.println(">> Transaksi berhasil dicatat");
                    } else {
                        System.out.println("BBM tidak ditemukan.");
                    }
                    break;
                case 5:
                    System.out.println("-- Riwayat Transaksi --");
                    tr.tampilRiwayat();
                    break;
                case 6:
                    data.sorting();
                    System.out.println("Data kendaraan telah disorting.");
                    break;
                case 7:
                    System.out.println("Terima Kasih!");
                    break;
                default:
                    System.out.println("Menu tidak tersedia.");
                    break;
            }
        } while (menu != 7);
        sc.close();
    }

}