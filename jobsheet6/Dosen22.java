public class Dosen22 {
    String kode, nama;
    Boolean jenisKelamin;
    int usia;
    
    Dosen22(String kd, String name, Boolean jk, int age){
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil(){
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        if (jenisKelamin == true) {
            System.out.println("Jenis Kelamin: perempuan");
        } else if(jenisKelamin == false ) {
            System.out.println("jenis kelamin: laki-laki");
        }else {
            System.out.println("Jenis kelamin: tidak valid");
        }
        System.out.println("Usia: " + usia);
    }
}
