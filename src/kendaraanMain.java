import java.util.Scanner;

public class kendaraanMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    System.out.println("Terima Kasih!");
                    break;
                default:
                    break;
            }
        } while (menu != 7 );
        sc.close();
    }
}