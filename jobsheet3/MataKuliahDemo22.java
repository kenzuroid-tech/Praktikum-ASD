import java.util.Scanner;
public class MataKuliahDemo22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MataKuliah22[] arrayOfMataKuliah22 = new MataKuliah22[3];
        String kode, nama, dummy;
        int sks, jmlJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i+1));
            System.out.print("Kode      : ");
            kode = sc.nextLine();
            System.out.print("Nama      : ");
            nama = sc.nextLine();
            System.out.print("Sks       : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam: ");
            dummy = sc.nextLine();
            jmlJam = Integer.parseInt(dummy);
            System.out.println("------------------------------------");

            arrayOfMataKuliah22[i] = new MataKuliah22(kode, nama, sks, jmlJam);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data mata kuliah ke-" + (i+1));
            System.out.println("Kode        : " + arrayOfMataKuliah22[i].kode);
            System.out.println("Nama        : " + arrayOfMataKuliah22[i].nama);
            System.out.println("Sks         : " + arrayOfMataKuliah22[i].sks);
            System.out.println("Jumlah jam  : " + arrayOfMataKuliah22[i].jmlJam);
            System.out.println("----------------------------------------");
        }
    }
}