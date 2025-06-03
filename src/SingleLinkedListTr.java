public class SingleLinkedListTr {
    NodeTransaksi head;
    NodeTransaksi tail;
    NodeBBM headbbm;

    boolean isEmpty() {
        return (head == null);
    }

    public void tampilRiwayat() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong");
        } else {
            NodeTransaksi tmp = head;
            while (tmp != null) {
                tmp.data.tampilRiwayatTransaksi();
                tmp = tmp.next;
            }
        }
    }

    // public int TransaksiHargaBBM(double liter){
    // BBM data = new BBM(null, liter);
    // double total = liter * data.hargaPerLiter;
    // return total;
    // }
}
