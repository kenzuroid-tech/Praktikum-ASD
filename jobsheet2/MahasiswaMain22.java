public class MahasiswaMain22 {
    public static void main(String[] args) {
        Mahasiswa22 mhs1 = new Mahasiswa22();
        mhs1.nama = "Siti Nikmatus Sholihah";
        mhs1.nim = "244107020014";
        mhs1.kelas = "TI 1B";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("TI 1A");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        
    Mahasiswa22 mhs2 = new Mahasiswa22("Annisa Nabila", "244107020016", 3.25, "TI 1B");
    mhs2.updateIpk(3.30);
    mhs2.tampilkanInformasi();

    Mahasiswa22 nikma = new Mahasiswa22("Akhmad Ainul Habibi", "244107020017", 3.7, "TE 3C");
    nikma.tampilkanInformasi();
    }
}
