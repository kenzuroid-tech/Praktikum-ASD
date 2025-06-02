import java.util.Scanner;

public class LayaniMahasiswaDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LayananMahasiswa antrian = new LayananMahasiswa(10);

        int pilihan;
        do {
            System.out.println("\n=====MENU ANTRIAN MAHASISWA=====");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian untuk Proses KRS");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Antrian terdepan");
            System.out.println("5. Tampilkan antrian paling belakang");
            System.out.println("6. Cetak Jumlah Antrian");
            System.out.println("7. Cetak Jumlah Antrian yang Sudah Melakukan Proses KRS");
            System.out.println("8. Kosongkan Semua Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    dataMahasiswa mhs = new dataMahasiswa(nim, nama, kelas, prodi);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    dataMahasiswa dilayani = antrian.layaniMahasiswa();
                    if (dilayani != null) {
                        System.out.println("Melayani mahasiswa: ");
                        dilayani.tampilkanData();
                    }
                    break;
                
                case 3:
                    antrian.tampilkanAntrian();
                    break;

                case 4:
                    antrian.tampilkan2DataTerdepan();
                    break;

                case 5:
                    antrian.tampilkanDataTerakhir();
                    break;

                case  6:
                    antrian.cetakJumlahAntrian();
                    break;
                case 0:
                    System.out.println("Keluar program.");
                    break;

                default:
                    System.out.println("Pilihan Tidak valid");
                    break;
            }
        } while (pilihan != 0);
    }
}
