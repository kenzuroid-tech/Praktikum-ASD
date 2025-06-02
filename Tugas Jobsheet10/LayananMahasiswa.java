public class LayananMahasiswa {
    
    dataMahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;

    public LayananMahasiswa(int max) {
        this.max = max;
        this.data = new dataMahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void tambahAntrian(dataMahasiswa mhs) {
        if (isFull()) {
            System.out.println("Maaf Tidak Bisa Menambah Antrian");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " data berhasil ditambahkan");
    }

    public dataMahasiswa layaniMahasiswa() {
        if (isEmpty()) {
            System.out.println("Data masih kosong");
            return null;
        }
        dataMahasiswa mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }

    public void tampilkanAntrian(){
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        } 
        System.out.println("Daftar mahasiswa dalam antrian: ");
        System.out.println("NIM - NAMA - KELAS - PRODI");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i+1) + ".");
            data[index].tampilkanData();
        }
    }

    public void tampilkan2DataTerdepan(){
        if (isEmpty()) {
            System.out.println("Maaf antrian masih kosong");
        } else {
            System.out.println("Tampilkan Data Mahasiswa");
            System.out.println("NIM - NAMA - KELAS - PRODI");

            data[front].tampilkanData();
            data[front + 1].tampilkanData();
        }
    }

    public void tampilkanDataTerakhir(){
        if (isEmpty()) {
            System.out.println("Maaf antrian masih kosong");
        } else {
            System.out.println("Tampilkan Data Mahasiswa");
            System.out.println("NIM - NAMA - KELAS - PRODI");

            data[rear].tampilkanData();
        }
    }

    public void cetakJumlahAntrian(){
         if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (true) {
                System.out.print(data[i] + " ");
                if (i == rear)
                    break;
                i = (i + 1) % max;
            }
            System.out.println("\nJumlah elemen = " + size);
        }
    }
}