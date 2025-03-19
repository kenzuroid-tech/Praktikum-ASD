public class DataDosen22 {

    // Method untuk menampilkan data semua dosen
    public void dataSemuaDosen(Dosen22[] arrayOfDosen) {
        System.out.println("Data Semua Dosen:");
        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Dosen ke-" + (i + 1));
            System.out.println("Kode            : " + arrayOfDosen[i].kode);
            System.out.println("Nama            : " + arrayOfDosen[i].nama);
            System.out.println("Jenis Kelamin   : " + (arrayOfDosen[i].jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia            : " + arrayOfDosen[i].usia);
            System.out.println("---------------------------------------------");
            System.out.println();
            System.out.println("null");
        }
    }

    // Method untuk menampilkan jumlah dosen per jenis kelamin
    public void jumlahDosenPerJenisKelamin(Dosen22[] arrayOfDosen) {
        int jumlahPria = 0;
        int jumlahWanita = 0;

        for (Dosen22 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                jumlahPria++;
            } else {
                jumlahWanita++;
            }
        }

        System.out.println("Jumlah Dosen Pria   : " + jumlahPria);
        System.out.println("Jumlah Dosen Wanita : " + jumlahWanita);
        System.out.println("---------------------------------------------");
    }

    // Method untuk menampilkan rata-rata usia dosen per jenis kelamin
    public void rerataUsiaDosenPerJenisKelamin(Dosen22[] arrayOfDosen) {
        int totalUsiaPria = 0;
        int totalUsiaWanita = 0;
        int jumlahPria = 0;
        int jumlahWanita = 0;

        for (Dosen22 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                jumlahPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                jumlahWanita++;
            }
        }

        double rerataUsiaPria = jumlahPria > 0 ? (double) totalUsiaPria / jumlahPria : 0;
        double rerataUsiaWanita = jumlahWanita > 0 ? (double) totalUsiaWanita / jumlahWanita : 0;

        System.out.println("Rata-rata Usia Dosen Pria   : " + rerataUsiaPria);
        System.out.println("Rata-rata Usia Dosen Wanita : " + rerataUsiaWanita);
        System.out.println("---------------------------------------------");
    }

    // Method untuk menampilkan data dosen paling tua
    public void infoDosenPalingTua(Dosen22[] arrayOfDosen) {
        Dosen22 dosenTua = arrayOfDosen[0];
        for (Dosen22 dosen : arrayOfDosen) {
            if (dosen.usia > dosenTua.usia) {
                dosenTua = dosen;
            }
        }

        System.out.println("Data Dosen Paling Tua:");
        System.out.println("Kode            : " + dosenTua.kode);
        System.out.println("Nama            : " + dosenTua.nama);
        System.out.println("Jenis Kelamin   : " + (dosenTua.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia            : " + dosenTua.usia);
        System.out.println("---------------------------------------------");
    }

    // Method untuk menampilkan data dosen paling muda
    public void infoDosenPalingMuda(Dosen22[] arrayOfDosen) {
        Dosen22 dosenMuda = arrayOfDosen[0];
        for (Dosen22 dosen : arrayOfDosen) {
            if (dosen.usia < dosenMuda.usia) {
                dosenMuda = dosen;
            }
        }

        System.out.println("Data Dosen Paling Muda:");
        System.out.println("Kode            : " + dosenMuda.kode);
        System.out.println("Nama            : " + dosenMuda.nama);
        System.out.println("Jenis Kelamin   : " + (dosenMuda.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia            : " + dosenMuda.usia);
        System.out.println("---------------------------------------------");
    }
}