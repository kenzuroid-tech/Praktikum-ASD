public class DataDosen22 {
    Dosen22[] listDosen22 = new Dosen22[10];
    int idx;

    void tambah(Dosen22 dsn){
        if (idx<listDosen22.length) {
            listDosen22[idx]=dsn;
            idx++;
        } else {
            System.out.println("Data Sudah Penuh");
        }
    }

    void tampil(){
        for (Dosen22 dsn : listDosen22) {
            dsn.tampil();
            System.out.println("===========================");
        }
    }

    void SortingASC(){
        for (int i = 0; i < listDosen22.length-1; i++) {
            for (int j = 1; j < listDosen22.length-i; j++) {
                if (listDosen22[j].usia<listDosen22[j-1].usia) {
                    Dosen22 temp = listDosen22[j];
                    listDosen22[j]=listDosen22[j-1];
                    listDosen22[j-1]=temp;
                }
            }
        }
    }

    void SortingDSC(){
        for (int i = 0; i < listDosen22.length-1; i++) {
            int idxMin=i;
            for (int j = i+1; j < listDosen22.length; j++) {
                if (listDosen22[j].usia>listDosen22[idxMin].usia) {
                    idxMin=j;
                }
            }
            Dosen22 temp = listDosen22[idxMin];
            listDosen22[idxMin] = listDosen22[i];
            listDosen22[i]=temp;
        }
    }

    void InsertionSort(){
        for (int i = 1; i < listDosen22.length; i++) {
            Dosen22 temp = listDosen22[i];
            int j=i;
            while (j>0 && listDosen22[j-1].usia>temp.usia) {
                listDosen22[j] = listDosen22[j-1];
                j--;
            }
            listDosen22[j] = temp;
        }
    }
}
