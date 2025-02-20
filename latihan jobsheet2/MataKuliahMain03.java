public class MataKuliahMain03 {
    public static void main(String[] args) {

        MataKuliah03 mk1 = new MataKuliah03();
        System.out.println("Informasi Mata Kuliah 1:");
        mk1.tampilInformasi();

        mk1.ubahSKS(3);
        mk1.tambahJam(5);
        mk1.kurangiJam(2);
        mk1.tampilInformasi();

        MataKuliah03 mk2 = new MataKuliah03("CS101", "Algoritma dan Pemrograman", 4, 6);
        System.out.println("\nInformasi Mata Kuliah 2:");
        mk2.tampilInformasi();

        mk2.ubahSKS(5);
        mk2.tambahJam(2);
        mk2.kurangiJam(3);
        mk2.tampilInformasi();
    }
}