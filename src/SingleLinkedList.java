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
        nodeKendaraan current = head;
        while (current != null) {
            System.out.printf("%-15s %-15s %-15s\n",
                    current.data.platNomor,
                    current.data.tipe,
                    current.data.merk);
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

    public void sorting() {
        if (head == null)
            return;
        boolean swapped;
        do {
            swapped = false;
            nodeKendaraan curr = head;
            while (curr.next != null) {
                if (curr.data.platNomor.compareTo(curr.next.data.platNomor) > 0) {
                    kendaraan temp = curr.data;
                    curr.data = curr.next.data;
                    curr.next.data = temp;
                    swapped = true;
                }
                curr = curr.next;
            }

        } while (swapped);
    }

    public void tampilSorting() {

    }

}
