import java.util.Scanner;
public class pemilihan {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double nilaiTugas, nilaiKuis, nilaiUts, nilaiUas;

        System.out.println("Program menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Masukkan Nilai Tugas: ");
        nilaiTugas = input.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        nilaiKuis = input.nextDouble();
        System.out.print("Masukkan Nilai Uts: ");
        nilaiUts = input.nextDouble();
        System.out.print("Masukkan Nilai Uas: ");
        nilaiUas = input.nextDouble();
        System.out.println("==============================");
        System.out.println("==============================");

        if (nilaiTugas > 100 || nilaiKuis > 100 || nilaiUts > 100 || nilaiUas > 100) {
            System.out.print("Nilai Tidak valid");
        } else {

            double nilaiAkhir = (nilaiTugas * 0.2 ) + (nilaiKuis * 0.2 ) + (nilaiUts * 0.3) + (nilaiUas * 0.3 );
            System.out.println("Nilai akhir: " + nilaiAkhir);

            if (nilaiAkhir >80 && nilaiAkhir <=100) {
                System.out.println("Nilai huruf: A");
            } else if (nilaiAkhir >73 && nilaiAkhir <= 80) {
                System.out.println("Nilai huruf: B+");
            } else if (nilaiAkhir >65 && nilaiAkhir <= 73) {
                System.out.println("Nilai huruf: B");
            } else if (nilaiAkhir >60 && nilaiAkhir <= 65) {
                System.out.println("Nilai huruf: C+");
            } else if (nilaiAkhir >50 && nilaiAkhir <= 60) {
                System.out.println("Nilai huruf: C");
            } else if (nilaiAkhir >39 && nilaiAkhir <= 50) {
                System.out.println("Nilai huruf: D");
            } else if (nilaiAkhir <= 39) {
                System.out.println("Nilai huruf: E");
            }

            System.out.println("==============================");
            System.out.println("==============================");
            
        }
    }
}