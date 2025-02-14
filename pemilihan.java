import java.util.Scanner;
public class pemilihan
 {

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

        if (nilaiTugas > 100 || nilaiKuis > 100 || nilaiUts > 100 || nilaiUas > 100) {
            System.out.print("Nilai Tidak valid");
        } else {

            double nilaiAkhir = (nilaiTugas * 0.2 ) + (nilaiKuis * 0.2 ) + (nilaiUts * 0.3) + (nilaiUas * 0.3 );
            System.out.print("Nilai akhir: " + nilaiAkhir);

            if (nilaiAkhir ) {
                
            }
            
        }
    }
}