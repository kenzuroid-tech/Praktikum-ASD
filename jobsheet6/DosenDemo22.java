public class DosenDemo22 {
    public static void main(String[] args) {
        DataDosen22 list = new DataDosen22();
        Dosen22 dsn1 = new Dosen22("123", "Vivi", true, 30);
        Dosen22 dsn2 = new Dosen22("124", "Totok", false, 40);
        Dosen22 dsn3 = new Dosen22("125", "Cahya", false, 33);
        Dosen22 dsn4 = new Dosen22("126", "Puspa", true, 23);
        Dosen22 dsn5 = new Dosen22("127", "Gilang", false, 45);
        Dosen22 dsn6 = new Dosen22("128", "Rusli ", false, 50);
        Dosen22 dsn7 = new Dosen22("129", "Rendi ", false , 28);
        Dosen22 dsn8 = new Dosen22("130", "Luqman", false, 36);
        Dosen22 dsn9 = new Dosen22("131", "Astri", true, 25);
        Dosen22 dsn10 = new Dosen22("132", "Aulia", true, 30);

        list.tambah(dsn1);
        list.tambah(dsn2);
        list.tambah(dsn3);
        list.tambah(dsn4);
        list.tambah(dsn5);
        list.tambah(dsn6);
        list.tambah(dsn7);
        list.tambah(dsn8);
        list.tambah(dsn9);
        list.tambah(dsn10);

        System.out.println("Data Dosen belum disorting: ");
        list.tampil();

        System.out.println("Data Dosen setelah diurutkan berdasarkan ASC: ");
        list.SortingASC();
        list.tampil();

        System.out.println("Data Dosen setelah diurutkan berdasarkan DSC: ");
        list.SortingDSC();
        list.tampil();

        System.out.println("Data Dosen setelah diurutkan berdasarkan Insertion Sort(ASC): ");
        list.InsertionSort();
        list.tampil();
    }
}
