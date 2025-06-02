public class Mahasiswa {
    String nim;
    String nama;
    String kelas;
    String prodi;

    public Mahasiswa(String nim, String nama, String kelas, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.prodi = prodi;
    }

    public void tampil() {
        System.out.println(nim + " - " + nama + " -" + kelas + " - " + prodi);
    }
}
