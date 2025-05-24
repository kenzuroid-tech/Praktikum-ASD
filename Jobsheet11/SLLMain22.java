import java.util.Scanner;

public class SLLMain22 {
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in); 
        SingleLinkedList22 sll = new SingleLinkedList22();

        int pilih;
        do {
            System.out.println("\nSILAHKAN PILIH MENU");
            System.out.println("-----------------------------------------");
            System.out.println("1. Tambahkan data Mahasiswa di awal");
            System.out.println("2. Sisipkan data Mahasiswa menggunakan key");
            System.out.println("3. Sisipkan data Mahasiswa menggunakan index");
            System.out.println("4. Tampilkan data Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine(); 

            switch (pilih) {
                case 1: 
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Masukkan IPK: ");
                    double ipk = sc.nextDouble();
                    sc.nextLine(); 
                    
                    Mahasiswa22 mhs1 = new Mahasiswa22(nim, nama, kelas, ipk);
                    sll.addFirst(mhs1);
                    System.out.println("Data berhasil ditambahkan");
                    break;
                    
                case 2: 
                    System.out.print("Masukkan key: ");
                    String key = sc.nextLine();

                    System.out.print("Masukkan NIM: ");
                    String newNim = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String newNama = sc.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String newKelas = sc.nextLine();
                    System.out.print("Masukkan IPK: ");
                    double newIpk = sc.nextDouble();
                    sc.nextLine(); 

                    Mahasiswa22 mhs2 = new Mahasiswa22(newNim, newNama, newKelas, newIpk);
                    sll.insertAfter(key, mhs2);
                    break;
                
                case 3: 
                    System.out.print("Masukkan index keberapa anda ingin menyisipkan data: ");
                    int index = sc.nextInt();

                    System.out.print("Masukkan NIM: ");
                    String nimBaru = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String namaBaru = sc.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelasBaru = sc.nextLine();
                    System.out.print("Masukkan IPK: ");
                    double ipkBaru = sc.nextDouble();
                    sc.nextLine();

                    Mahasiswa22 mhs3 = new Mahasiswa22(nimBaru, namaBaru, kelasBaru, ipkBaru);
                    sll.insertAt(index, mhs3);
                    break;
                case 4:
                    sll.print();
                    break;
                    
                case 0:
                    System.out.println("Keluar dari program...");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 0);
    }
}