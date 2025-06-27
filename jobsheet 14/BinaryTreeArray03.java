public class BinaryTreeArray03 {

    Mahasiswa03[] dataMahasiswa03;
    int idxLast;

    public BinaryTreeArray03() {
        this.dataMahasiswa03 = new Mahasiswa03[10];
    }

    void populateData (Mahasiswa03 dataMhs[], int idxLast){
        this.dataMahasiswa03 = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa03[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa03[idxStart].tampilkanInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    void add(Mahasiswa03 data) {
        if (idxLast == dataMahasiswa03.length -1) {
            System.out.println("Array penuh");
            return;
        }
        dataMahasiswa03[++idxLast] = data;
    }

    void tranversePreOrder(int idxStart) {
        if (idxStart <= idxStart) {
            if (dataMahasiswa03[idxStart] != null) {
                dataMahasiswa03[idxStart].tampilkanInformasi();
                tranversePreOrder(2 * idxStart + 1);
                tranversePreOrder(2 * idxStart + 2);
            }
        }
    }
}