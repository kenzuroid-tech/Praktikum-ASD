public class dataMahasiswa {

    String nama, nim, kelas, prodi;

    public dataMahasiswa(String nim, String nama, String kelas, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.prodi = prodi;
    }

    public void tampilkanData(){
        System.out.println(nim + " - " + nama + " - " + kelas + " - " + prodi);
    }
}

