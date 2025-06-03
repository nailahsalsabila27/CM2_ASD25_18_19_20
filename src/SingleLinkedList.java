public class SingleLinkedList {
    nodeKendaraan head;
    nodeKendaraan tail;

    int size = 0;

    boolean isEmpty() {
        return (head == null);
    }

    public int size() {
        return size;
    }

    public void printAntrian() {
        if (head == null) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Antrian Kendaraan:");
        System.out.printf("%-20s %-20s &-20s\n", "Plat Nomor", "Jenis", "Merk");
        nodeKendaraan current = head;
        while (current != null) {
            current.data.tampilkanInformasi();
            current = current.next;
        }
    }

    public void addLast(kendaraan input) {
        nodeKendaraan ndInput = new nodeKendaraan(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
            size++;
        } else {
            tail.next = ndInput;
            tail = ndInput;
            size++;
        }
    }

    public kendaraan removeFirst() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada kendaraan yang bisa dilayani.");
            return null;
        } else {
            kendaraan removed = head.data;
            head = head.next;
            size--;

            if (head == null) {
                tail = null;
            }

            return removed;
        }
    }

}
