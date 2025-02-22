public class MataKuliah22 {

    String kodeMK, nama;
    int sks, jmlhJam;
    
    public MataKuliah22(){
        
    }

    public MataKuliah22(String nm, String kd, int sks, int jmlhJam){
        nama = nm;
        kodeMK = kd;
        this.sks = sks;
        this.jmlhJam = jmlhJam;
    }

    void tampilkanInformasi(){
        System.out.println("\nNama: " + nama);
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jmlhJam);
    }

    void ubahSKS(int sksBaru){
        sks = sksBaru;
    }

    void tambahJam(int jam){
        jmlhJam += jam;
    }

    void kurangiJam(int jam){
        jmlhJam -= jam;
    }
}