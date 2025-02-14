import java.util.Scanner;

public class perulangan {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIM : ");
        int nim = input.nextInt();

        // Ambil 2 digit terakhir NIM
        int n = nim % 100;

        // Jika n < 10, tambahkan 10
        if (n < 10) {
            n += 10;
        }
        
        System.out.println("\nDeret bilangan:");
        for (int i = 1; i <= n; i++) {
            // Pengecualian untuk angka 6 dan 10
            if (i == 6 || i == 10) {
                continue;
            }
            
            // Cetak angka ganjil dengan *, genap dengan angka asli
            if (i % 2 == 1) {
                System.out.print("* ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
