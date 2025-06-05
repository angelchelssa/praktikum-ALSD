import java.lang.classfile.components.ClassPrinter.Node;
import java.util.Scanner;
public class DoubleLinkedListMain03 {

    public static void main(String[] args) {
        DoubleLinkedLists03 list = new DoubleLinkedLists03();
        Scanner scan = new Scanner(System.in);
        int pilihan;
        
        do {
            System.out.println("=== Menu ===");
            System.out.println("1. Tambah Data Mahasiswa di Awal");
            System.out.println("2. Tambah Data Mahasiswa di Akhir");
            System.out.println("3. Hapus dari awal");
            System.out.println("4. Hapus dari akhir");
            System.out.println("5. Tampilkan Data Mahasiswa");
            System.out.println("6. cari Data Mahasiswa");
            System.out.println("7. Tambah Data Mahasiswa Setelah NIM Tertentu");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine(); // Clear the newline character

            switch (pilihan) {
                case 1 -> {
                    Mahasiswa03 mhs = inputMahasiswa(scan);
                    list.addFirst(mhs);
                }
                case 2 -> {
                    Mahasiswa03 mhs = inputMahasiswa(scan);
                    list.addLast(mhs);
                }
                case 3 -> list.removeFirst();
                case 4 -> list.removeLast();
                case 5 -> list.print();
                case 6 -> {
                    System.out.print("Masukkan NIM Mahasiswa yang dicari: ");
                    String nim = scan.nextLine();
                    Node03 found = list.search(nim);
                    if (found != null) {
                        System.out.println("Data Mahasiswa ditemukan:");
                        found.data.Tampil();
                    } else {
                        System.out.println("data tidak ditemukan");
                    }
                }
                case 7 -> {
                    System.out.print("Masukkan NIM yang dicari untuk disisipkan setelahnya: ");
                    String key = scan.nextLine();
                    Mahasiswa03 mhs = inputMahasiswa(scan);
                    list.insertAfter(key, mhs);
            }

                case 0 -> System.out.println("Keluar dari program.");
                default -> System.out.println("pilihan tidak valid");
            }
        }
        while (pilihan != 0);
        scan.close();
    }

    public static Mahasiswa03 inputMahasiswa(Scanner scan) {
        System.out.print("Masukkan NIM: ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = scan.nextDouble();
        scan.nextLine(); 
        return new Mahasiswa03(nim, nama, kelas, ipk);
    }

}