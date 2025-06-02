public class DoubleLinkedList22 {
    Node22 head;
    Node22 tail;

    public DoubleLinkedList22(){
        head = null;
        tail = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(Mahasiswa22 data){
        Node22 newNode = new Node22(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa22 data){
        Node22 newNode = new Node22(data);
        if (isEmpty()) {
            head = tail = newNode; 
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa22 data){
        Node22 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node22 newNode = new Node22(data);

        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }

        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    public void removeFirst(){
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        } else {
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
        }
        System.out.println("Data berhasil dihapus");
    }

    public void removeLast(){
        if (isEmpty()) {
            System.out.println("List Kosong, tidak bisa dihapus");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        System.out.println("Data berhasil dihapus");
    }

    public Mahasiswa22 search(String nim){
        Node22 current = head;

        while (current != null) {
            if (current.data.getNim().equals(nim)) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    public void print(){
        Node22 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }
}
