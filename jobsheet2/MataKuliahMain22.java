public class MataKuliahMain22{
    public static void main(String[] args) {
        MataKuliah22 mk1 = new MataKuliah22();
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.kodeMK = "RTI242008";
        mk1.sks = 2;
        mk1.jmlhJam = 4;

        mk1.tampilkanInformasi();
        mk1.ubahSKS(3);
        mk1.tambahJam(1);
        mk1.kurangiJam(2);
        mk1.tampilkanInformasi();

    MataKuliah22 mk2 = new MataKuliah22("Praktikum Algoritma dan Struktur Data", "RTI242009", 3, 2);
    mk2.ubahSKS(4);
    mk2.tampilkanInformasi();
    }
}