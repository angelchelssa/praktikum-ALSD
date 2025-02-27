import java.util.Scanner;

public class MataKuliahDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlah = Integer.parseInt(sc.nextLine());

        MataKuliah03[] arrayOfMataKuliah = new MataKuliah03[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan data mata kuliah ke-" + (i + 1));
            arrayOfMataKuliah[i] = MataKuliah03.tambahData();
        }

        System.out.println("\n===== Daftar Mata Kuliah =====");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i + 1));
            arrayOfMataKuliah[i].cetakInfo();
        }

        sc.close();
    }
}
