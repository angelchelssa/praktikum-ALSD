public class Mahasiswa03 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa03() {
    }

    public Mahasiswa03(String name, String nm, String kls, double ip) {
        nim = name;
        nama = nm;
        kelas = kls;
        ipk = ip;
    }

    public void tampilInformasi() {
        System.out.println(nama + "\t " + nim + "\t " + kelas + "\t" + ipk );
    }
}
