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

}
