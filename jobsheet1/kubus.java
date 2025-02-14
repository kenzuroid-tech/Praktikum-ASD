import java.util.Scanner;
public class kubus {
        
        public static double hitungVolume(double s) {
            return s*s*s;
        }

        public static double hitungLuasPermukaan(double s) {
            return 6*s*s;
        }

        public static double hitungKeliling(double s) {
            return 12*s;
        }

        public static void tampilkanMenu(){
            System.out.println("Pilih menu yang anda inginkan");
            System.out.println("1. Hitung Volume Kubus");
            System.out.println("2. Hitung Luas Permukaan Kubus");
            System.out.println("3. Hitung Keliling Kubus");
        }


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Masukkan sisi kubus: ");
            double sisi = sc.nextDouble();

            tampilkanMenu();
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Volume kubus: " + hitungVolume(sisi));
                    break;
                case 2:
                    System.out.println("Luas permukaan kubus: " + hitungLuasPermukaan(sisi));
                    break;
                case 3:
                    System.out.println("Keliling kubus: " + hitungKeliling(sisi));
                    break;
                default:
                System.out.println("Pilihan tidak valid");
                    break;
            }
        }
    
}

