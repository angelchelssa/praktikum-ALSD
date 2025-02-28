public class Dosen03 {
    private String kode;
    private String nama;
    private char jenisKelamin; 
    private int usia;

    public Dosen03(String kode, String nama, char jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public char getJenisKelamin() {
        return jenisKelamin;
    }

    public int getUsia() {
        return usia;
    }

    public void tampilkanInfo() {
        System.out.println("Kode Dosen      : " + kode);
        System.out.println("Nama Dosen      : " + nama);
        System.out.println("Jenis Kelamin   : " + (jenisKelamin == 'L' ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia            : " + usia + " tahun");
        System.out.println("--------------------------------");
    }
}
