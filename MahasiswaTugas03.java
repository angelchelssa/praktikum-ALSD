public class MahasiswaTugas03 {

    String nama;
    String nim;
    String keperluan;

    public MahasiswaTugas03(String nim, String nama, String keperluan) {
        this.nim = nim;
        this.nama = nama;
        this.keperluan = keperluan;
    }

    void tampil() {
        System.out.println("NIM : " + nim + " | Nama : " + nama + " | Keperluan : " + keperluan);
    }
}
