import java.util.Scanner;

public class DosenDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int JUMLAH_DOSEN = 3;
        Dosen03[] arrayOfDosen = new Dosen03[JUMLAH_DOSEN];
        String kode, nama;
        char jenisKelamin;
        int usia;

        for (int i = 0; i < JUMLAH_DOSEN; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode           : ");
            kode = sc.nextLine();
            System.out.print("Nama           : ");
            nama = sc.nextLine();

            do {
                System.out.print("Jenis Kelamin (L/P): ");
                jenisKelamin = sc.next().charAt(0);
                sc.nextLine();
                jenisKelamin = Character.toUpperCase(jenisKelamin);
            } while (jenisKelamin != 'L' && jenisKelamin != 'P');

            System.out.print("Usia           : ");
            usia = sc.nextInt();
            sc.nextLine();

            System.out.println("------------------------------");
            arrayOfDosen[i] = new Dosen03(kode, nama, jenisKelamin, usia);
        }

        DataDosen03 dataDosen = new DataDosen03();

        dataDosen.dataSemuaDosen(arrayOfDosen);
        dataDosen.jumlahDosenPerJenisKelamin(arrayOfDosen);
        dataDosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        dataDosen.infoDosenPalingTua(arrayOfDosen);
        dataDosen.infoDosenPalingMuda(arrayOfDosen);
    }
}
