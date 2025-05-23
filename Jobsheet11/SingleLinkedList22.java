public class SingleLinkedList22 {
    
    NodeMahasiswa22 head;
    NodeMahasiswa22 tail;

    boolean isEmpty(){
        return (head == null);
    }

    public void print(){
        if (!isEmpty()) {
            NodeMahasiswa22 tmp = head;
            System.out.println("Isi Linked List:\t");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("linked List kosong");
        }
    }

    public void addFirst(Mahasiswa22 input){
        NodeMahasiswa22 ndInput = new NodeMahasiswa22(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa22 input){
        NodeMahasiswa22 ndInput = new NodeMahasiswa22(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, Mahasiswa22 input){
        NodeMahasiswa22 ndInput = new NodeMahasiswa22(input, null);
        NodeMahasiswa22 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
        } while (temp != null);
    }

    public void insertAt(int index, Mahasiswa22 input){
        if (index < 0) {
            System.out.println("Index salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            NodeMahasiswa22 temp = head;
            for (int i = 0; i < index -1; i++) {
                temp = temp.next;
            }
            temp.next = new NodeMahasiswa22(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}
