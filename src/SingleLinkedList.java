public class SingleLinkedList {
    nodeKendaraan head;
    nodeKendaraan tail;

    boolean isEmpty() {
        return (head == null);
    }

    public void addLast(kendaraan input) {
        nodeKendaraan ndInput = new nodeKendaraan(input,null);
        if (isEmpty()) {
            head = ndInput;
            tail=ndInput;
        } else {
            tail.next=ndInput;
            tail= ndInput;
        }
    }
    
    public void sorting(){
        if(head==null) return;
        boolean swapped;
        do {
            swapped = false;
            nodeKendaraan curr = head;
            while (curr.next !=null) {
                if(curr.data.platNomor.compareTo(curr.next.data.platNomor) > 0) {
                    kendaraan temp = curr.data;
                    curr.data = curr.next.data;
                    curr.next.data= temp;
                    swapped = true;
                }
                curr= curr.next;
            }

        }while(swapped);
    }
    
    public void tampilSorting(){
        
    }
    
    
    

}
