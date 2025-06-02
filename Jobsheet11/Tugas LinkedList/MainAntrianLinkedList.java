import java.util.Scanner;

public class MainAntrianLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianLinkedList antrian = new AntrianLinkedList();
        int pilih;

        do {
            System.out.println("\n=== Menu Antrian Unit Kemahasiswaan ===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Panggil Mahasiswa");
            System.out.println("3. Cek Antrian Kosong");
            System.out.println("4. Cek Antrian Penuh");
            System.out.println("5. Kosongkan Antrian");
            System.out.println("6. Lihat Antrian Terdepan");
            System.out.println("7. Lihat Antrian Paling Akhir");
            System.out.println("8. Tampilkan Semua Antrian");
            System.out.println("9. Jumlah Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    antrian.enqueue(new Mahasiswa(nim, nama, kelas, prodi));
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    System.out.println(antrian.isEmpty() ? "Antrian kosong." : "Antrian tidak kosong.");
                    break;
                case 4:
                    System.out.println(antrian.isFull() ? "Antrian penuh." : "Antrian tidak penuh.");
                    break;
                case 5:
                    antrian.kosongkanAntrian();
                    break;
                case 6:
                    antrian.peekDepan();
                    break;
                case 7:
                    antrian.peekBelakang();
                    break;
                case 8:
                    antrian.tampilkanSemua();
                    break;
                case 9:
                    antrian.jumlahAntrian();
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilih != 0);
        sc.close();
    }
}
