import java.util.Scanner;

public class DosenDemo22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen22 list = new DataDosen22();

        // Menambahkan data dosen
        Dosen22 dsn1 = new Dosen22("123", "Vivi", true, 30);
        Dosen22 dsn2 = new Dosen22("124", "Totok", false, 40);
        Dosen22 dsn3 = new Dosen22("125", "Cahya", false, 33);
        Dosen22 dsn4 = new Dosen22("126", "Vivi", true, 23);
        Dosen22 dsn5 = new Dosen22("127", "Gilang", false, 45);
        Dosen22 dsn6 = new Dosen22("128", "Rusli", false, 50);
        Dosen22 dsn7 = new Dosen22("129", "Rendi", false, 28);
        Dosen22 dsn8 = new Dosen22("130", "Luqman", false, 36);
        Dosen22 dsn9 = new Dosen22("131", "Astri", true, 25);
        Dosen22 dsn10 = new Dosen22("132", "Aulia", true, 30);

        list.tambah(dsn1);
        list.tambah(dsn2);
        list.tambah(dsn3);
        list.tambah(dsn4);
        list.tambah(dsn5);
        list.tambah(dsn6);
        list.tambah(dsn7);
        list.tambah(dsn8);
        list.tambah(dsn9);
        list.tambah(dsn10);

        // Menampilkan semua data
        System.out.println("Data Dosen setelah diurutkan berdasarkan ASC: ");
        list.SortingASC();
        list.tampil();

        // Pencarian Sequential (Nama)
        System.out.println("========================================");
        System.out.println("Pencarian Data Berdasarkan Nama");
        System.out.println("========================================");
        System.out.print("Masukkan Nama Dosen: ");
        String nama = sc.nextLine();
        int posNama = list.sequentialSearchNama(nama);
        list.tampilPosisi(nama, posNama);
        list.tampilDataSearch(nama, posNama);
        list.cekHasilGanda(nama); // Deteksi hasil ganda

        // Pencarian Binary (Usia) - Data harus diurutkan terlebih dahulu!
        System.out.println("\n========================================");
        System.out.println("Pencarian Data Berdasarkan Usia (Binary Search)");
        System.out.println("========================================");
        System.out.print("Masukkan Usia Dosen: ");
        int usia = sc.nextInt();
        int posUsia = list.binarySearchUsia(usia, 0, list.idx - 1);
        if (posUsia != -1) {
            System.out.println("Dosen dengan usia " + usia + " ditemukan pada index " + posUsia);
            list.tampilDataSearch(list.listDosen22[posUsia].nama, posUsia);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}