public class SingleLinkedListTr {
    NodeTransaksi head;
    NodeTransaksi tail;

    boolean isEmpty() {
        return (head == null);
    }

    public void addRiwayat(TransaksiPengisian transaksi) {
        NodeTransaksi newNode = new NodeTransaksi(transaksi, null);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
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

    public void sorting() {
        if (head == null)
            return;
        boolean swapped;
        do {
            swapped = false;
            NodeTransaksi curr = head;
            while (curr.next != null) {
                if (curr.data.kendaraan.platNomor.compareTo(curr.next.data.kendaraan.platNomor) > 0) {
                    TransaksiPengisian temp = curr.data;
                    curr.data = curr.next.data;
                    curr.next.data = temp;
                    swapped = true;
                }
                curr = curr.next;
            }

        } while (swapped);
    }

}
