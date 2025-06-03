import org.w3c.dom.Node;

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

    public void print(){
        if (isEmpty()) {
            System.out.println("Linked list masih kosong!!!");
        } else {
        Node22 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
        }
    }

    public void removeFirst(){
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }

        Mahasiswa22 dataDihapus = head.data;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = head;
        }
        System.out.println("Data sudah berhasil dihapus. Data yang berhasil dihapus adalah " + dataDihapus);
    }

    public void removeLast(){
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
        }
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void insertAfter(Node22 prevNode, Mahasiswa22 data) {
        if (prevNode == null) {
            System.out.println("Tidak bisa menambahkan data");
            return;
        }
    
        Node22 newNode = new Node22(data);
    
        newNode.next = prevNode.next;
        newNode.prev = prevNode;
        prevNode.next = newNode;
    
        if (newNode.next != null) {
            newNode.next.prev = newNode;
        }
    }

    public void search(String nim){

    }
}
