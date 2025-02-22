public class Dosen22 {

    String idDosen, nama, bidangKeahlian;
    int tahunBergabung;
    boolean statusAktif = false;

    public Dosen22() {
    }

    public Dosen22(String nm, String iD, String bk, int thb, boolean sts) {
        this.idDosen = iD;
        this.nama = nm;
        this.bidangKeahlian = bk;
        this.tahunBergabung = thb;
        this.statusAktif = sts;
    }

    void tampilkanInformasi() {
        System.out.println("\nNama Dosen: " + this.nama);
        System.out.println("ID Dosen: " + this.idDosen);
        System.out.println("Bidang Keahlian: " + this.bidangKeahlian);
        System.out.println("Tahun Bergabung: " + this.tahunBergabung);
        System.out.println("Status Aktif: " + (this.statusAktif ? "Aktif" : "Tidak Aktif"));
    }

    void setStatusAktif(boolean status) {
        this.statusAktif = status;
    }

    int hitungMasaKerja(int thnSkrng) {
        return thnSkrng - this.tahunBergabung;
    }

    void ubahKeahlian(String bidang) {
        this.bidangKeahlian = bidang;
    }
}
