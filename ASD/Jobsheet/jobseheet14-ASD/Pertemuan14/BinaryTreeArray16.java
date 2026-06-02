public class BinaryTreeArray16 {
    Mahasiswa16[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray16() {
        this.dataMahasiswa = new Mahasiswa16[10];
    }

    void add(Mahasiswa16 data) {
        if (idxLast < dataMahasiswa.length - 1) {
            dataMahasiswa[idxLast] = data;
            idxLast++;
        } else {
            System.out.println("Array tree sudah penuh!");
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }

    void populateData(Mahasiswa16 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }
}