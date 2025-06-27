public class BInaryTreeMain03 {
    public static void main(String[] args) {
        BinaryTree03 bst = new BinaryTree03();

        bst.add(new Mahasiswa03("244160121", "Ali", "A", 3.75));
        bst.add(new Mahasiswa03("244160221", "Badar", "B", 3.85));
        bst.add(new Mahasiswa03("244160185", "Candra", "C", 3.21));
        bst.add(new Mahasiswa03("244160220", "Dewi", "B", 3.54));

        System.out.println("Daftar semua mahasiswa (in order traversal) : ");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPencarian data mahasiswa: ");
        System.out.print("Cari mahasiswa dengan ipk: 3.54 : ");
        String hasilCari = bst.find(5.4)?"Ditemukan " : "tidak ditemukan";
        System.out.println(hasilCari);

        System.out.print("Cari mahasiswa dengan IPK : 3.22 : ");
        hasilCari = bst.find(3.22)?"Ditemukan" : "tidak ditemukan";
        System.out.println(hasilCari);
        
        bst.add(new Mahasiswa03("244160131", "Devi", "A", 3.72));
        bst.add(new Mahasiswa03("244160205", "Ehsan", "D", 3.37));
        bst.add(new Mahasiswa03("244160170", "Fizi", "B", 3.46));
        System.out.println("\nDaftar semua mahasiswa penambahan 3 mahasiswa: ");
        System.out.println("InOrder Traversal: ");
        bst.traverseInOrder(bst.root);
        System.out.println("\nPreOrder Traversal: ");
        bst.traversePreOrder(bst.root);
        System.out.println("\nPostOrder traversal: ");
        bst.traversePostOrder(bst.root);

        System.out.println("\nPenghapus data mahasiswa");
        bst.delete(3.57);
        System.out.println("\nData semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal): ");
        bst.traverseInOrder(bst.root);

        BinaryTreeArray03 bta = new BinaryTreeArray03();
        Mahasiswa03 mhs1= new Mahasiswa03("244160121", "Ali", "A", 3.57);
        Mahasiswa03 mhs2= new Mahasiswa03("244160185", "Candra", "C", 3.41);
        Mahasiswa03 mhs3= new Mahasiswa03("244160221", "Badar", "B", 3.75);
        Mahasiswa03 mhs4= new Mahasiswa03("244160220", "Dewi", "B", 3.35);
        
        Mahasiswa03 mhs5= new Mahasiswa03("244160131", "Devi", "A", 3.48);
        Mahasiswa03 mhs6= new Mahasiswa03("244160205", "Ehsan", "D", 3.61);
        Mahasiswa03 mhs7= new Mahasiswa03("244160170", "Fizi", "B", 3.86);

        Mahasiswa03[] dataMahasiswa03 = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null};
        int idxLast = 6;
        bta.populateData(dataMahasiswa03, idxLast);
        System.out.println("\nInOrder Traversal Mahasiswa: ");
        bta.traverseInOrder(0);


    }
}