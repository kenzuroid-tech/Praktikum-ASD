public class MahasiswaBerprestasi22 {
    Mahasiswa22[] listMhs = new Mahasiswa22[5];
    int idx;

    void tambah (Mahasiswa22 m){
        if (idx<listMhs.length) {
            listMhs[idx]=m;
            idx++;
        } else {
            System.out.println("Data Sudah Penuh");
        }
    }

    void tampil(){
        for (Mahasiswa22 m : listMhs) {
            m.tampilInformasi();
            System.out.println("--------------------------");
        }
    }

    void tampilPosisi(double x, int pos){
        if (pos!=-1) {
            System.out.println("data Mahasiswa dengan IPK: " +x+ " ditemukan pada index " + pos);
        } else{
            System.out.println("data " +x+ " tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos){
        if (pos!=-1) {
            System.out.println("Nim\t : " +listMhs[pos].nim);
            System.out.println("Nama\t : " +listMhs[pos].nama);
            System.out.println("Kelas\t : " +listMhs[pos].kelas);
            System.out.println("Ipk\t : " +listMhs[pos].ipk);
        } else {
            System.out.println("Data Mahasiswa dengan Ipk " +x+ " tidak ditemukan");
        }
    }

    int sequentialSearching(double cari){
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].ipk==cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    int findBinarySearch(double cari, int left, int right){
        int mid;
        if (right>=left) {
            mid =(left+right)/2;
            if (cari ==listMhs[mid].ipk) {
                return (mid); 
            } else if (listMhs[mid].ipk<cari) {
                return findBinarySearch(cari, left, mid-1); 
            } else {
                return findBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }
}



