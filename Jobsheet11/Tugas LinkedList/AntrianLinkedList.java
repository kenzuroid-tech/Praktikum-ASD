class Node {
    Mahasiswa data;
    Node next;

    public Node(Mahasiswa data) {
        this.data = data;
        this.next = null;
    }
}

public class AntrianLinkedList {
    private Node front;
    private Node rear;
    private int size;

    public AntrianLinkedList() {
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return false; // LinkedList dinamis, tidak penuh
    }

    public void enqueue(Mahasiswa mhs) {
        Node baru = new Node(mhs);
        if (isEmpty()) {
            front = rear = baru;
        } else {
            rear.next = baru;
            rear = baru;
        }
        size++;
        System.out.println(mhs.nama + " berhasil masuk antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Mahasiswa yang dipanggil: ");
            front.data.tampil();
            front = front.next;
            size--;
            if (front == null) {
                rear = null;
            }
        }
    }

    public void peekDepan() {
        if (!isEmpty()) {
            System.out.print("Mahasiswa terdepan: ");
            front.data.tampil();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void peekBelakang() {
        if (!isEmpty()) {
            System.out.print("Mahasiswa terakhir: ");
            rear.data.tampil();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Daftar antrian:");
            Node current = front;
            while (current != null) {
                current.data.tampil();
                current = current.next;
            }
        }
    }

    public void kosongkanAntrian() {
        front = rear = null;
        size = 0;
        System.out.println("Semua antrian dikosongkan.");
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah mahasiswa yang masih mengantre: " + size);
    }
}
