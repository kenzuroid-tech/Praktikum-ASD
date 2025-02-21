public class Mahasiswa22 {

    String nama, nim, kelas;
    double ipk;

    void tampilkanInformasi(){
        System.out.print("Nama: " + nama);
        System.out.print("NIM: " + nim);
        System.out.print("IPK: " + ipk);
        System.out.print("Kelas: " + kelas);
    }

    void ubahKelas(String kelasBaru){
        kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru){
        ipk = ipkBaru;
    }

    String nilaiKinerja(){
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja baik";
        } else if (ipk >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }
}
