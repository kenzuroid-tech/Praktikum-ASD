public class DosenMain22 {
    public static void main(String[] args) {
        Dosen22 dosen1 = new Dosen22();
        dosen1.nama = "Harianto";
        dosen1.idDosen = "25567890";
        dosen1.bidangKeahlian = "Matematika";
        dosen1.tahunBergabung = 2010;
        dosen1.statusAktif = true;

        dosen1.tampilkanInformasi();
        System.out.println("Masa Kerja: " + dosen1.hitungMasaKerja(2025) + " tahun\n");

        dosen1.ubahKeahlian("Aljabar Linier");
        dosen1.setStatusAktif(false);
        dosen1.tampilkanInformasi();
        System.out.println("Masa Kerja: " + dosen1.hitungMasaKerja(2025) + " tahun\n");

        Dosen22 dosen2 = new Dosen22("Budianto", "26678906", "Fisika", 2011, true);
        dosen2.ubahKeahlian("Fisika Murni");
        dosen2.tampilkanInformasi();
        System.out.println("Masa Kerja: " + dosen2.hitungMasaKerja(2025) + " tahun");
    }
}
