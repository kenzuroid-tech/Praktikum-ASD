import java.util.Scanner;

public class matakuliah {

    static void tambahJadwal(String matkul[][], int sks[], int smt[], int jmlData) {
        Scanner input = new Scanner(System.in);
        boolean benar = true;

        if (jmlData >= matkul.length) {
            System.out.println("Data sudah penuh!");
        } else {
            System.out.print("Masukkan Nama Mata Kuliah: ");
            matkul[jmlData][0] = input.nextLine();
            System.out.print("Masukkan SKS: ");
            sks[jmlData] = input.nextInt();
            System.out.print("Masukkan Semester: ");
            smt[jmlData] = input.nextInt();
            input.nextLine();

            do {
                System.out.print("Masukkan Hari Kuliah (Senin-Jum'at): ");
                matkul[jmlData][1] = input.nextLine();
                if (matkul[jmlData][1].equalsIgnoreCase("Senin") ||
                    matkul[jmlData][1].equalsIgnoreCase("Selasa") || 
                    matkul[jmlData][1].equalsIgnoreCase("Rabu") ||
                    matkul[jmlData][1].equalsIgnoreCase("Kamis") ||
                    matkul[jmlData][1].equalsIgnoreCase("Jum'at")) {
                    benar = false;
                } else {
                    System.out.println("Hari tidak valid! Harus antara Senin-Jum'at");
                }
            } while (benar);

            System.out.println("Jadwal kuliah berhasil ditambahkan!");
        }
    }

    static void tampilSeluruhJadwal(int jmlData, int sks[], int smt[], String matkul[][]) {
        if (jmlData == 0) {
            System.out.println("Belum ada jadwal kuliah");
        } else {
            System.out.println("\nDaftar Seluruh Jadwal Kuliah:");
            for (int i = 0; i < jmlData; i++) {
                System.out.println("Nama: " + matkul[i][0] +
                        " | SKS: " + sks[i] +
                        " | Semester: " + smt[i] +
                        " | Hari: " + matkul[i][1]);
            }
        }
    }

    static void tampilJadwalBerdasarkanHari(String matkul[][], int sks[], int smt[], int jmlData) {
        Scanner input = new Scanner(System.in);

        if (jmlData == 0) {
            System.out.println("Belum ada data jadwal kuliah.");
        } else {
            System.out.print("Masukkan Hari Kuliah yang ingin ditampilkan: ");
            String cariHari = input.nextLine();
            boolean ditemukan = false;

            System.out.println("\nJadwal Kuliah pada hari " + cariHari + ":");
            for (int i = 0; i < jmlData; i++) {
                if (matkul[i][1].equalsIgnoreCase(cariHari)) {
                    System.out.println("Nama: " + matkul[i][0] +
                            " | SKS: " + sks[i] + 
                            " | Semester: " + smt[i]);
                    ditemukan = true;
                }
            }
            if (!ditemukan) {
                System.out.println("Tidak ada jadwal kuliah pada hari tersebut.");
            }
        }
    }

    static void tampilJadwalBerdasarkanSemester(String matkul[][], int sks[], int smt[], int jmlData) {
        Scanner input = new Scanner(System.in);

        if (jmlData == 0) {
            System.out.println("Belum ada jadwal kuliah.");
        } else {
            System.out.print("Masukkan Semester yang ingin ditampilkan: ");
            int cariSmt = input.nextInt();
            input.nextLine();
            boolean ditemukan = false;

            System.out.println("\nJadwal Kuliah untuk Semester " + cariSmt + ":");
            for (int i = 0; i < jmlData; i++) {
                if (smt[i] == cariSmt) {
                    System.out.println("Nama: " + matkul[i][0] +
                            " | SKS: " + sks[i] +
                            " | Hari: " + matkul[i][1]);
                    ditemukan = true;
                }
            }
            if (!ditemukan) {
                System.out.println("Tidak ada Jadwal Kuliah untuk Semester tersebut.");
            }
        }
    }

    static void cariMataKuliah(String matkul[][], int sks[], int smt[], int jmlData) {
        Scanner input = new Scanner(System.in);

        if (jmlData == 0) {
            System.out.println("Belum ada data Jadwal Kuliah.");
        } else {
            System.out.print("Masukkan Nama Mata Kuliah yang ingin dicari: ");
            String cariNama = input.nextLine().toLowerCase();
            boolean ditemukan = false;

            System.out.println("\nHasil Pencarian Mata Kuliah:");
            for (int i = 0; i < jmlData; i++) {
                if (matkul[i][0].toLowerCase().contains(cariNama)) {
                    System.out.println("Nama: " + matkul[i][0] +
                            " | SKS: " + sks[i] + 
                            " | Semester: " + smt[i] +
                            " | Hari: " + matkul[i][1]);
                    ditemukan = true;
                }
            }
            if (!ditemukan) {
                System.out.println("Mata Kuliah tidak ditemukan");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String matkul[][] = new String[25][2];
        int sks[] = new int[25];
        int smt[] = new int[25];
        int jmlData = 0;
        int pilihan;

        do {
            System.out.println("\n\nMENU UTAMA");
            System.out.println("1. Tambah Jadwal Kuliah");
            System.out.println("2. Tampilkan Seluruh Jadwal Kuliah");
            System.out.println("3. Tampilkan Jadwal Berdasarkan Hari");
            System.out.println("4. Tampilkan Jadwal sesuai Semester");
            System.out.println("5. Cari Mata Kuliah");
            System.out.println("0. Keluar");
            System.out.print("Silahkan pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    tambahJadwal(matkul, sks, smt, jmlData++);
                    break;
                case 2:
                    tampilSeluruhJadwal(jmlData, sks, smt, matkul);
                    break;
                case 3:
                    tampilJadwalBerdasarkanHari(matkul, sks, smt, jmlData);
                    break;
                case 4: 
                    tampilJadwalBerdasarkanSemester(matkul, sks, smt, jmlData);
                    break;
                case 5:
                    cariMataKuliah(matkul, sks, smt, jmlData);
                    break;
                case 0:
                    System.out.println("Keluar dari Program");
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
            }
        } while (pilihan != 0);
    }
}
