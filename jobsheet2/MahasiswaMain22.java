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
    }
}
