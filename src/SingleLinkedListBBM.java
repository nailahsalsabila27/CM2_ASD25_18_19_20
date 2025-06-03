public class SingleLinkedListBBM {
    NodeBBM head;
    NodeBBM tail;

    boolean isEmpty() {
        return (head == null);
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
}
