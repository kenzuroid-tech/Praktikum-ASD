public class Mahasiswa22 {
    
    String nama, nim, kelas;
    double ipk;

    Mahasiswa22 (){

    }

    Mahasiswa22(String nm, String name, String kls, double ip){
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi(){
        System.out.println("NIM: " + nim + "         Nama: " + nama + "         Kelas: " + kelas + "          IPK: " + ipk);
    }
}