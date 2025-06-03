public class SingleLinkedListBBM {
    NodeBBM head;
    NodeBBM tail;

    boolean isEmpty() {
        return (head == null);
    }

    public BBM cariBBM(String nama) {
        NodeBBM current = head;
        while (current != null) {
            if (current.data.namaBBM.equalsIgnoreCase(nama)) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    public void tampilDataBBM() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong");
        } else {
            NodeBBM tmp = head;
            while (tmp != null) {
                tmp.data.tampilkanInformasiBBM();
                tmp = tmp.next;
            }
        }
    }

    public void tambahSemuaBBM() {
        for (BBM b : BBM.daftarBBM) {
            NodeBBM newNode = new NodeBBM(b, null);
            if (isEmpty()) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
    }

}
