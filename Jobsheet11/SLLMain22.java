public class SLLMain22 {
    public static void main(String[] args) {
        SingleLinkedList22 sll = new SingleLinkedList22();

        Mahasiswa22 mhs1 = new Mahasiswa22("22212024", "Cintia", "3C", 3.5);
        Mahasiswa22 mhs2 = new Mahasiswa22("23212201", "Bimon", "2B", 3.8);
        Mahasiswa22 mhs3 = new Mahasiswa22("22213062", "Putri", "4C", 3.5);
        Mahasiswa22 mhs4 = new Mahasiswa22("23212209", "Satrio", "1D", 3.7);

        sll.addFirst(mhs4);
        sll.addLast(mhs3);
        sll.insertAfter("Satrio", mhs1);
        sll.insertAt(2, mhs2);

        System.out.println("Data index 1:");
        sll.getData(1);

        System.out.println("Data Mahasiswa AN Bimon ada pada index: " + sll.indexOf("Bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}
