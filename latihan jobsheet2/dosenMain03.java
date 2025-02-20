public class dosenMain03 {
    public static void main(String[] args) {
        dosen03 dosen1 = new dosen03();
        System.out.println("Informasi dosen03 1:");
        dosen1.tampilInformasi();

        dosen1.setStatusAktif(false);
        dosen1.ubahKeahlian("Jaringan Komputer");
        int masaKerja1 = dosen1.hitungMasaKerja(2025);
        System.out.println("Masa Kerja dosen03 1: " + masaKerja1 + " tahun");

        dosen03 dosen2 = new dosen03("D12345", "Dr. Andi", true, 2010, "Kecerdasan Buatan");
        System.out.println("\nInformasi dosen03 2:");
        dosen2.tampilInformasi();

        dosen2.setStatusAktif(true);
        dosen2.ubahKeahlian("Pemrograman Mobile");
        int masaKerja2 = dosen2.hitungMasaKerja(2025);
        System.out.println("Masa Kerja dosen03 2: " + masaKerja2 + " tahun");
    }
}