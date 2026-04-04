public class DataDosen {

    Dosen16[] listDosen = new Dosen16[3];
    int idx;

    void tambah(Dosen16 d) {
        if (idx < listDosen.length) {
            listDosen[idx] = d;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (Dosen16 d : listDosen) {
            if (d != null) {
                d.tampil();
                System.out.println("--------------------");
            }
        }
    }

    void SortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (listDosen[j - 1].usia > listDosen[j].usia) {
                    Dosen16 temp = listDosen[j];
                    listDosen[j] = listDosen[j - 1];
                    listDosen[j - 1] = temp;
                }
            }
        }
    }

    void SortingDESC() {
        for (int i = 0; i < listDosen.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listDosen.length; j++) {
                if (listDosen[j].usia > listDosen[idxMin].usia) {
                    idxMin = j;
                }
            }
            Dosen16 tmp = listDosen[idxMin];
            listDosen[idxMin] = listDosen[i];
            listDosen[i] = tmp;
        }
    }

    void insertionSort() {
        for (int i = 1; i <= listDosen.length - 1; i++) {
            Dosen16 temp = listDosen[i];
            int j = i - 1;
            while (j >= 0 && listDosen[j].usia > temp.usia) {
                listDosen[j + 1] = listDosen[j];
                j--;
            }
            listDosen[j + 1] = temp;
        }
    }
}