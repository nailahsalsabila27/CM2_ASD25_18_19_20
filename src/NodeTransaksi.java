public class NodeTransaksi {
    TransaksiPengisian data;
    NodeTransaksi next;

    NodeTransaksi(TransaksiPengisian data, NodeTransaksi next) {
        this.data = data;
        this.next = next;
    }
}
