public class Dosen22 {
    String kode, nama;
    boolean jenisKelamin;
    int usia;

    public Dosen22(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    void tampil() {
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin ? "Perempuan" : "Laki-laki")); // Perubahan di sini
        System.out.println("Usia: " + usia);
    }
}