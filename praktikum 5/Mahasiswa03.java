public class Mahasiswa03 {

    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa03() {

    }

    Mahasiswa03(String nm, String nma, String kls, double ip) {
        nim = nm;
        nama = nma;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK : " + ipk);
    }
}