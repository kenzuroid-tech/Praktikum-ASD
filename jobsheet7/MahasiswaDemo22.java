import java.util.Scanner;
public class MahasiswaDemo22 {
    public static void main(String[] args) {
        MahasiswaBerprestasi22 list = new MahasiswaBerprestasi22();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = Double.parseDouble(sc.nextLine());
            System.out.println("=====================================");
            list.tambah(new Mahasiswa22(nim, nama, kelas, ipk));
        }

        //melakukan pencarian menggunakan Sequential Search
        list.tampil();
        System.out.println("========================================");
        System.out.println("Pencarian data");
        System.out.println("========================================");
        System.out.println("masukkan IPK Mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();
        System.out.println("menggunakan sequential search");
        double posisi = list.sequentialSearching(cari);
        int pss = (int)posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        //melakukan pencarian menggunakan Binary Search
        System.out.println("--------------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("--------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        cari = sc.nextDouble();
        System.out.println("--------------------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("--------------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs-1);
        int pss2 = (int) posisi;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);

    }
}