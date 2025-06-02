import java.util.Scanner;

public class MainAntrianKRS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS(10);
        int pilih;

        do {
            System.out.println("\n--- MENU ANTRIAN KRS ---");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil 2 Mahasiswa");
            System.out.println("3. Tampilkan Semua");
            System.out.println("4. Lihat 2 Terdepan");
            System.out.println("5. Lihat Mahasiswa Terakhir");
            System.out.println("6. Cek Antrian Kosong");
            System.out.println("7. Cek Antrian Penuh");
            System.out.println("8. Hapus Semua Antrian");
            System.out.println("9. Jumlah Antrian");
            System.out.println("10. Jumlah Diproses");
            System.out.println("11. Jumlah Belum Diproses");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = input.nextLine();
                    System.out.print("Nama  : ");
                    String nama = input.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = input.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = input.nextLine();
                    Mahasiswa m = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambah(m);
                    break;
                case 2:
                    antrian.panggil2Mahasiswa();
                    break;
                case 3:
                    antrian.tampilSemua();
                    break;
                case 4:
                    antrian.lihat2Terdepan();
                    break;
                case 5:
                    antrian.lihatAkhir();
                    break;
                case 6:
                    System.out.println(antrian.kosong() ? "Antrian kosong." : "Masih ada antrian.");
                    break;
                case 7:
                    System.out.println(antrian.penuh() ? "Antrian penuh." : "Masih ada tempat.");
                    break;
                case 8:
                    antrian.hapusSemua();
                    break;
                case 9:
                    antrian.tampilJumlah();
                    break;
                case 10:
                    antrian.tampilSudahDiproses();
                    break;
                case 11:
                    antrian.tampilBelumDiproses();
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak ada.");
            }

        } while (pilih != 0);
    }
}
