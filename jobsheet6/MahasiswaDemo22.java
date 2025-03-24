public class MahasiswaDemo22 {
    public static void main(String[] args) {
        
        MahasiswaBerprestasi22 list = new MahasiswaBerprestasi22();
        Mahasiswa22 m1 = new Mahasiswa22("123", "Haydar", "2A", 3.8);
        Mahasiswa22 m2 = new Mahasiswa22("124", "Bintang", "2A", 3.5);
        Mahasiswa22 m3 = new Mahasiswa22("125", "Husnil", "2A", 3.4);
        Mahasiswa22 m4 = new Mahasiswa22("126", "Biyyah", "2A", 3.9);
        Mahasiswa22 m5 = new Mahasiswa22("127", "Alif", "2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data Mahasiswa Belum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelag sorting berdasarkan IPK(DESC): ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan Selection Sort(ASC): ");
        list.SelectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan Insertion Sort(ASC): ");
        list.InsertionSort();
        list.tampil();
    }
}
