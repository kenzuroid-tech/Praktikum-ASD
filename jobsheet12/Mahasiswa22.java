public class Mahasiswa22 {
    String nama, kelas, nim;
    double ipk;

    public Mahasiswa22 (){

    }

    public Mahasiswa22(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampil(){
        System.out.println("NIM: " + nim + ", Nama: " + nama + ", Kelas: " + kelas + ", IPK: " + ipk);
    }

    public String getNim(){
        return nim;
    }
}
