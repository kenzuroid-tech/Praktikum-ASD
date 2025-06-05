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

        public void add(int index, Mahasiswa22 data) {
            if (index < 0) {
                System.out.println("Index tidak valid!");
                return;
            }
            
            if (index == 0) {
                addFirst(data);
                return;
            }
            
            Node22 current = head;
            int currentIndex = 0;
            
            while (current != null && currentIndex < index - 1) {
                current = current.next;
                currentIndex++;
            }
            
            if (current == null) {
                System.out.println("Index melebihi panjang list!");
                return;
            }
            
            Node22 newNode = new Node22(data);
            newNode.next = current.next;
            newNode.prev = current;
            
            if (current.next != null) {
                current.next.prev = newNode;
            } else {
                tail = newNode;
            }
            
            current.next = newNode;
        }
    
        public void removeAfter(String keyNim) {
            if (isEmpty()) {
                System.out.println("List kosong!");
                return;
            }
            
            Node22 current = head;
            while (current != null && !current.data.nim.equals(keyNim)) {
                current = current.next;
            }
            
            if (current == null || current.next == null) {
                System.out.println("Tidak ada node setelah " + keyNim + " atau key tidak ditemukan");
                return;
            }
            
            Node22 toRemove = current.next;
            current.next = toRemove.next;
            
            if (toRemove.next != null) {
                toRemove.next.prev = current;
            } else {
                tail = current;
            }
            
            System.out.println("Node setelah " + keyNim + " berhasil dihapus");
        }
    
        public void remove(int index) {
            if (isEmpty() || index < 0) {
                System.out.println("List kosong atau index tidak valid!");
                return;
            }
            
            if (index == 0) {
                removeFirst();
                return;
            }
            
            Node22 current = head;
            int currentIndex = 0;
            
            while (current != null && currentIndex < index) {
                current = current.next;
                currentIndex++;
            }
            
            if (current == null) {
                System.out.println("Index melebihi panjang list!");
                return;
            }
            
            if (current == tail) {
                removeLast();
                return;
            }
            
            current.prev.next = current.next;
            current.next.prev = current.prev;
            
            System.out.println("Node pada index " + index + " berhasil dihapus");
        }
    
        public Mahasiswa22 getFirst() {
            if (isEmpty()) {
                System.out.println("List kosong!");
                return null;
            }
            return head.data;
        }
    
        public Mahasiswa22 getLast() {
            if (isEmpty()) {
                System.out.println("List kosong!");
                return null;
            }
            return tail.data;
        }
    
        public Mahasiswa22 getIndex(int index) {
            if (isEmpty() || index < 0) {
                System.out.println("List kosong atau index tidak valid!");
                return null;
            }
            
            Node22 current = head;
            int currentIndex = 0;
            
            while (current != null && currentIndex < index) {
                current = current.next;
                currentIndex++;
            }
            
            if (current == null) {
                System.out.println("Index melebihi panjang list!");
                return null;
            }
            
            return current.data;
        }
    
        public int size() {
            int count = 0;
            Node22 current = head;
            
            while (current != null) {
                count++;
                current = current.next;
            }
            
            return count;
        }
    
        public Mahasiswa22 search(String nim) {
            Node22 current = head;
            
            while (current != null) {
                if (current.data.nim.equals(nim)) {
                    return current.data;
                }
                current = current.next;
            }
            
            return null;
        }
    }

