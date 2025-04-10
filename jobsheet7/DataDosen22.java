public class DataDosen22 {
    Dosen22[] listDosen22 = new Dosen22[10];
    int idx;

    void tambah(Dosen22 dsn) {
        if (idx < listDosen22.length) {
            listDosen22[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data Sudah Penuh");
        }
    }

    void tampil() {
        for (Dosen22 dsn : listDosen22) {
            if (dsn != null) {
                dsn.tampil();
                System.out.println("===========================");
            }
        }
    }

    // Sequential Search untuk Nama (Case-Insensitive)
    int sequentialSearchNama(String cari) {
        for (int i = 0; i < idx; i++) {
            if (listDosen22[i].nama.equalsIgnoreCase(cari)) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search untuk Usia (Data HARUS Terurut)
    int binarySearchUsia(int cari, int left, int right) {
        if (right >= left) {
            int mid = (left + right) / 2;
            if (listDosen22[mid].usia == cari) {
                return mid;
            } else if (listDosen22[mid].usia > cari) {
                return binarySearchUsia(cari, left, mid - 1);
            } else {
                return binarySearchUsia(cari, mid + 1, right);
            }
        }
        return -1;
    }

    // Menampilkan Posisi dan Data Dosen
    void tampilPosisi(String x, int pos) {
        if (pos != -1) {
            System.out.println("Dosen dengan nama '" + x + "' ditemukan pada index " + pos);
        } else {
            System.out.println("Data '" + x + "' tidak ditemukan");
        }
    }

    void tampilDataSearch(String x, int pos) {
        if (pos != -1) {
            System.out.println("Kode\t\t : " + listDosen22[pos].kode);
            System.out.println("Nama\t\t : " + listDosen22[pos].nama);
            System.out.println("Jenis Kelamin\t : " + (listDosen22[pos].jenisKelamin ? "Perempuan" : "Laki-laki")); // Perubahan di sini
            System.out.println("Usia\t\t : " + listDosen22[pos].usia);
        } else {
            System.out.println("Data Dosen dengan nama '" + x + "' tidak ditemukan");
        }
    }

    // Deteksi Hasil Pencarian Ganda
    void cekHasilGanda(String nama) {
        int count = 0;
        for (int i = 0; i < idx; i++) {
            if (listDosen22[i].nama.equalsIgnoreCase(nama)) {
                count++;
                if (count > 1) {
                    System.out.println("Peringatan: Ditemukan lebih dari 1 dosen dengan nama '" + nama + "'!");
                    break;
                }
            }
        }
    }

    void SortingASC(){
        for (int i = 0; i < listDosen22.length-1; i++) {
            for (int j = 1; j < listDosen22.length-i; j++) {
                if (listDosen22[j].usia<listDosen22[j-1].usia) {
                    Dosen22 temp = listDosen22[j];
                    listDosen22[j]=listDosen22[j-1];
                    listDosen22[j-1]=temp;
                }
            }
        }
    }
}