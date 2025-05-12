import java.util.Scanner;

public class SuratDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat03 stack = new StackSurat03(10); 
        int pilih;

        do {
            System.out.println("\n===== MENU SURAT IZIN =====");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Terakhir");
            System.out.println("4. Cari Surat berdasarkan Nama");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt(); sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat         : ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa   : ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas            : ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I) : ");
                    char jenis = sc.next().charAt(0);
                    System.out.print("Durasi (hari)    : ");
                    int durasi = sc.nextInt(); sc.nextLine();
                    Surat03 surat = new Surat03(id, nama, kelas, jenis, durasi);
                    stack.push(surat);
                    break;

                case 2:
                    Surat03 s = stack.pop();
                    if (s != null) {
                        System.out.println("Surat yang diproses:");
                        System.out.println(s);
                    }
                    break;

                case 3:
                    Surat03 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat Terakhir:");
                        System.out.println(terakhir);
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cariNama = sc.nextLine();
                    stack.searchByName(cariNama);
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);
    }
}
