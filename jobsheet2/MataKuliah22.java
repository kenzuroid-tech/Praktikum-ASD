public class MataKuliah22 {

    String kodeMK, nama;
    int sks, jmlhJam;
    
    public MataKuliah22(){
        
    }

    void tampilkanInformasi(){
        System.out.println("Nama: " + nama);
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jmlhJam);
    }

    void ubahSKS(int sksBaru){
        sks = sksBaru;
    }

    void tambahJam(int jam){
        jmlhJam = jam;
    }

    void kurangiJam(int jam){
        jmlhJam = jam;
    }
}