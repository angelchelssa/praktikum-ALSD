public class MataKuliah03 {
    private String kodeMK;
    private String nama;
    private int sks;
    private int jumlahJam;

    public MataKuliah03() {
        this.kodeMK = "Belum diatur";
        this.nama = "Belum diatur";
        this.sks = 0;
        this.jumlahJam = 0;
    }
    public MataKuliah03(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tampilInformasi() {
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("Jumlah SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

   public void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS telah diubah menjadi: " + sks);
    }

    public void tambahJam(int jam) {
        this.jumlahJam += jam;
        System.out.println("Jumlah jam setelah ditambah: " + jumlahJam);
    }

    public void kurangiJam(int jam) {
        if (this.jumlahJam >= jam) {
            this.jumlahJam -= jam;
            System.out.println("Jumlah jam setelah dikurangi: " + jumlahJam);
        } else {
            System.out.println("Pengurangan gagal! Jumlah jam tidak mencukupi.");
        }
    }
}