public class Mahasiswa03 {

    String nim;
    String nama;
    String kelas;
    Double ipk;

    public  Mahasiswa03() {

    }

    public Mahasiswa03(String nim, String nama, String kelas, Double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilkanInformasi(){
        System.out.println("NIM : " + this.nim + " " +
        "Nama : " + this.nama + " " +
        "Kelas : " + this.kelas + " " +
        "IPK : " + this.ipk);
    }
}
    