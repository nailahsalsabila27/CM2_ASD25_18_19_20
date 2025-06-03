public class nodeKendaraan {
    kendaraan data;
    nodeKendaraan next;
    nodeKendaraan tail;

    nodeKendaraan(kendaraan data, nodeKendaraan next, nodeKendaraan tail) {
        this.data = data;
        this.next = next;
    }

}
