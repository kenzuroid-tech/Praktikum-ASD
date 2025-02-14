public class fungsi {
    public static void main(String[] args) {
        String[] cabang = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};
        String[] bunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        int[][] stok = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };
        int[] harga = {75000, 50000, 60000, 10000};
        int[][] pengurangan = {
            {-1, -2, 0, -5},
            {-1, -2, 0, -5},
            {-1, -2, 0, -5},
            {-1, -2, 0, -5}
        };

        System.out.printf("%-15s", "Cabang");
        for (String b : bunga) {
            System.out.printf("%-10s", b);
        }
        System.out.println();
        
        for (int i = 0; i < stok.length; i++) {
            System.out.printf("%-15s", cabang[i]);
            for (int j = 0; j < stok[i].length; j++) {
                System.out.printf("%-10d", stok[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nPendapatan setiap cabang jika semua bunga terjual:");
        for (int i = 0; i < stok.length; i++) {
            int totalPendapatan = 0;
            for (int j = 0; j < stok[i].length; j++) {
                totalPendapatan += stok[i][j] * harga[j];
            }
            System.out.println(cabang[i] + ": Rp " + totalPendapatan);
        }

        System.out.println("\nStok setelah pengurangan:");
        for (int i = 0; i < stok.length; i++) {
            System.out.printf("%-15s", cabang[i]);
            for (int j = 0; j < stok[i].length; j++) {
                stok[i][j] += pengurangan[i][j];
                System.out.printf("%-10d", stok[i][j]);
            }
            System.out.println();
        }
    }
}
