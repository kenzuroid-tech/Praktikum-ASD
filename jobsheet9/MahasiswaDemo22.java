import java.util.Scanner;
public class MahasiswaDemo22 {
    public static void main(String[] args) {
        int pilih;
        
        Scanner scan = new Scanner(System.in);
        StackTugasMahasiswa22 stack = new StackTugasMahasiswa22(5);

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Terbawah");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Lihat Jumlah Tugas yang Sudah Dimasukkan");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    Mahasiswa22 mhs = new Mahasiswa22(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa22 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        scan.nextLine(); 
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s berhasil dikumpulkan\n", dinilai.nama);
                    } else {
                        System.out.println("Tidak ada tugas yang bisa dinilai.");
                    }
                    break;
                 case 3:
                    Mahasiswa22 lihat = stack.peekbuttom();
                    if (lihat != null) {
                    System.out.println("Tugas pertama dikumpulkan oleh " + lihat.nama);   
                    } else {
                        System.out.println("Belum ada tugas yang dikumpulkan");
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas:");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 5:
                    int jumlah = stack.jumlahTugas();
                    System.out.println("Jumlah tugas yang sudah dikumpulkan: " + jumlah);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilih >= 1 && pilih <= 4);
    }
}
