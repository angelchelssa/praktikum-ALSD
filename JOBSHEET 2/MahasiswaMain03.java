public class MahasiswaMain03 {

    public static void main(String[] args) {
        Mahasiswa03 mhs1 = new Mahasiswa03(); 
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2441720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55; 

        mhs1.tampilkanInformasi(); 
        mhs1.ubahKelas("SI 2K"); 
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi(); 

        Mahasiswa03 mhs2 = new Mahasiswa03("Annisa Nabila", "2141720160",3.25 ,"TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa03 mhsAngel = new Mahasiswa03("Angel chelssa leoniy eka permatasari","244107020202", 3.69, "TI 1E" );
        mhsAngel.tampilkanInformasi();
    }
}
