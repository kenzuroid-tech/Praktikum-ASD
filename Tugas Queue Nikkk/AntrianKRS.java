public class AntrianKRS {
    Mahasiswa[] daftar;
    int front, rear, size, max;
    int totalDiproses = 0;

    public AntrianKRS(int kapasitas) {
        max = kapasitas;
        daftar = new Mahasiswa[max];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean kosong() {
        return size == 0;
    }

    public boolean penuh() {
        return size == max;
    }

    public void tambah(Mahasiswa mhs) {
        if (penuh()) {
            System.out.println("Antrian sudah penuh.");
        } else {
            rear = (rear + 1) % max;
            daftar[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " masuk ke antrian.");
        }
    }

    public void panggil2Mahasiswa() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2.");
        } else {
            System.out.println("Mahasiswa yang diproses:");
            for (int i = 0; i < 2; i++) {
                daftar[front].tampil();
                front = (front + 1) % max;
                size--;
                totalDiproses++;
            }
        }
    }

    public void tampilSemua() {
        if (kosong()) {
            System.out.println("Antrian masih kosong.");
        } else {
            System.out.println("Daftar antrian:");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                System.out.print((i + 1) + ". ");
                daftar[index].tampil();
            }
        }
    }

    public void lihat2Terdepan() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2.");
        } else {
            System.out.println("2 Mahasiswa terdepan:");
            daftar[front].tampil();
            int kedua = (front + 1) % max;
            daftar[kedua].tampil();
        }
    }

    public void lihatAkhir() {
        if (!kosong()) {
            System.out.println("Mahasiswa terakhir:");
            daftar[rear].tampil();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void hapusSemua() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public void tampilJumlah() {
        System.out.println("Jumlah antrian: " + size);
    }

    public void tampilSudahDiproses() {
        System.out.println("Jumlah sudah proses KRS: " + totalDiproses);
    }

    public void tampilBelumDiproses() {
        System.out.println("Belum diproses: " + size);
    }
}
