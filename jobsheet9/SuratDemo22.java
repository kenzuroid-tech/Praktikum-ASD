import java.util.Scanner;

public class SuratDemo22 {
    public static void main(String[] args) {
        StackSurat22 stack = new StackSurat22(5);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\n===== MENU SURAT IZIN =====");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Tampilkan Semua Surat");
            System.out.println("6. Keluar");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine(); // buang newline

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat       : ");
                    String id = scan.nextLine();
                    System.out.print("Nama Mahasiswa : ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas          : ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = scan.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi (hari)  : ");
                    int durasi = scan.nextInt();
                    scan.nextLine(); // buang newline
                    
                    Surat22 surat = new Surat22(id, nama, kelas, jenis, durasi);
                    stack.push(surat);
                    break;
                case 2:
                    Surat22 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Surat berikut telah diproses:");
                        diproses.tampilkanSurat();
                    }
                    break;
                case 3:
                    Surat22 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat Terakhir:");
                        terakhir.tampilkanSurat();
                    } else {
                        System.out.println("Stack kosong.");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama: ");
                    String cari = scan.nextLine();
                    stack.cariSurat(cari);
                    break;
                case 5:
                    stack.print();
                    break;
                case 6:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilih != 6);
        scan.close();
    }
}
