import java.util.Scanner;
public class SLLMain22 {
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);

        SingleLinkedList22 sll = new SingleLinkedList22();
        
        Mahasiswa22 mhs1 = new Mahasiswa22("123", "Amel", "TI1B", 3.6);
        Mahasiswa22 mhs2 = new Mahasiswa22("124", "Adam", "TI1B", 3.4);
        Mahasiswa22 mhs3 = new Mahasiswa22("125", "Imel", "TI1B", 3.5);
        Mahasiswa22 mhs4 = new Mahasiswa22("126", "Zaky", "TI1B", 3.9);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Zaky", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
    }
}
