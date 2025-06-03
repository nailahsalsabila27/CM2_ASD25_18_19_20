public class SingleLinkedList {
    nodeKendaraan head;
    nodeKendaraan tail;

    boolean isEmpty() {
        return (head == null);
    }

    public void printAntrian() {
        if (head == null) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Antrian Kendaraan:");
        nodeKendaraan current = head;
        while (current != null) {
            System.out.printf("%-15s %-15s %-15s\n",
                current.data.platNomor,
                current.data.tipe,
                current.data.merk);
            current = current.next;
        }
    }
}
