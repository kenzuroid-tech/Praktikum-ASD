import java.util.Scanner;

public class kubus {
    public static double hitungVolume(double s) {
        return s * s * s;
    }

    public static double hitungLuasPermukaan(double s) {
        return 6 * s * s;
    }

    public static double hitungKeliling(double s) {
        return 12 * s;
    }

    public static void tampilkanMenu() {
        System.out.println("\n1. Hitung Volume Kubus");
        System.out.println("2. Hitung Luas Permukaan Kubus");
        System.out.println("3. Hitung Keliling Kubus");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu yang anda inginkan: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sisi kubus: ");
        double sisi = sc.nextDouble();

        while (true) {  
            tampilkanMenu();
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("\nVolume kubus: " + hitungVolume(sisi));
                    break;
                case 2:
                    System.out.println("\nLuas permukaan kubus: " + hitungLuasPermukaan(sisi));
                    break;
                case 3:
                    System.out.println("\nKeliling kubus: " + hitungKeliling(sisi));
                    break;
                case 4:
                    System.out.println("\nKeluar dari program.");
                    return;
                default:
                    System.out.println("\nPilihan tidak valid, coba lagi.");
            }
        }
    }
}
