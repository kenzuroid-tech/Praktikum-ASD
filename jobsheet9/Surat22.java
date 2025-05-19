public class Surat22 {
    String idSurat, namaMahasiswa, kelas;
    int durasi;
    char jenisIzin;

    public Surat22() {
    }

    public Surat22(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    public void tampilkanSurat() {
        System.out.println("ID Surat       : " + idSurat);
        System.out.println("Nama Mahasiswa : " + namaMahasiswa);
        System.out.println("Kelas          : " + kelas);
        System.out.println("Jenis Izin     : " + (jenisIzin == 'S' ? "Sakit" : "Izin lain"));
        System.out.println("Durasi         : " + durasi + " hari");
        System.out.println("===============================================");
    }
}
