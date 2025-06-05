import java.util.Scanner;
public class DLLMain {
    public static void main(String[] args) {
        DoubleLinkedList22 list = new DoubleLinkedList22();
        Scanner scan = new Scanner(System.in);
        int pilihan;
        
        do {
            System.out.println("\nMenu DoubleLinkedList Mahasiswa");
            System.out.println("1. Tambah diawal");
            System.out.println("2. Tambah diakhir");
            System.out.println("3. Tambah pada indeks tertentu");
            System.out.println("4. Hapus diawal");
            System.out.println("5. Hapus diakhir");
            System.out.println("6. Hapus pada indeks tertentu");
            System.out.println("7. Hapus setelah NIM tertentu");
            System.out.println("8. Tampilkan data");
            System.out.println("9. Cari berdasarkan NIM");
            System.out.println("10. Sisipkan data menggunakan key");
            System.out.println("11. Tampilkan data pertama");
            System.out.println("12. Tampilkan data terakhir");
            System.out.println("13. Tampilkan data pada indeks");
            System.out.println("14. Tampilkan jumlah data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1 -> {
                    Mahasiswa22 mhs = inputMahasiswa(scan);
                    list.addFirst(mhs);
                }
                case 2 -> {
                    Mahasiswa22 mhs = inputMahasiswa(scan);
                    list.addLast(mhs);
                }
                case 3 -> {
                    System.out.print("Masukkan indeks: ");
                    int index = scan.nextInt();
                    scan.nextLine();
                    Mahasiswa22 mhs = inputMahasiswa(scan);
                    list.add(index, mhs);
                }
                case 4 -> list.removeFirst();
                case 5 -> list.removeLast();
                case 6 -> {
                    System.out.print("Masukkan indeks yang akan dihapus: ");
                    int index = scan.nextInt();
                    scan.nextLine();
                    list.remove(index);
                }
                case 7 -> {
                    System.out.print("Masukkan NIM setelah yang akan dihapus: ");
                    String keyNim = scan.nextLine();
                    list.removeAfter(keyNim);
                }
                case 8 -> list.print();
                case 9 -> {
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = scan.nextLine();
                    Mahasiswa22 found = list.search(nim);
                    if (found != null) {
                        System.out.println("Data ditemukan:");
                        found.tampil();
                    } else {
                        System.out.println("Data tidak ditemukan");
                    }
                }
                case 10 -> {
                    System.out.print("Masukkan NIM yang akan disisipkan setelahnya: ");
                    String keyNim = scan.nextLine();
                    Mahasiswa22 mhsBaru = inputMahasiswa(scan);
                    list.insertAfter(keyNim, mhsBaru);
                }
                case 11 -> {
                    Mahasiswa22 first = list.getFirst();
                    if (first != null) {
                        first.tampil();
                    }
                }
                case 12 -> {
                    Mahasiswa22 last = list.getLast();
                    if (last != null) {
                        last.tampil();
                    }
                }
                case 13 -> {
                    System.out.print("Masukkan indeks: ");
                    int idx = scan.nextInt();
                    scan.nextLine();
                    Mahasiswa22 atIndex = list.getIndex(idx);
                    if (atIndex != null) {
                        atIndex.tampil();
                    }
                }
                case 14 -> {
                    System.out.println("Jumlah data: " + list.size());
                }
                case 0 -> System.out.println("Keluar dari program.");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }
}