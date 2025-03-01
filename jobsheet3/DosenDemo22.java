import java.util.Scanner;

public class DosenDemo22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Dosen22[] arrayOfDosen22 = new Dosen22[3];
        DataDosen22 dataDosen = new DataDosen22();
        String kode, nama, dummy;
        Boolean jenisKelamin;
        int usia;

        // Input data dosen
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data dosen ke-" + (i + 1));
            System.out.print("Kode             : ");
            kode = input.nextLine();
            System.out.print("Nama             : ");
            nama = input.nextLine();
            while (true) {
                System.out.print("Jenis kelamin (pria/wanita): ");
                dummy = input.nextLine().toLowerCase();
                if (dummy.equalsIgnoreCase("pria")) {
                    jenisKelamin = true;
                    break;
                } else if (dummy.equalsIgnoreCase("wanita")) {
                    jenisKelamin = false;
                    break;
                } else {
                    System.out.println("Input tidak valid! Harap masukkan 'pria' atau 'wanita'.");
                }
            }
            System.out.print("Usia             : ");
            dummy = input.nextLine();
            usia = Integer.parseInt(dummy);
            System.out.println("-------------------------------------------");

            arrayOfDosen22[i] = new Dosen22(kode, nama, jenisKelamin, usia);
        }

        // Memanggil method dari class DataDosen22
        dataDosen.dataSemuaDosen(arrayOfDosen22);
        dataDosen.jumlahDosenPerJenisKelamin(arrayOfDosen22);
        dataDosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen22);
        dataDosen.infoDosenPalingTua(arrayOfDosen22);
        dataDosen.infoDosenPalingMuda(arrayOfDosen22);
    }
}