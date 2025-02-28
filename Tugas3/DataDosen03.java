public class DataDosen03 {
    
    public void dataSemuaDosen(Dosen03[] arrayOfDosen) {
        System.out.println("\nData Semua Dosen:");
        for (Dosen03 dosen : arrayOfDosen) {
            dosen.tampilkanInfo();
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen03[] arrayOfDosen) {
        int jumlahLaki = 0, jumlahPerempuan = 0;

        for (Dosen03 dosen : arrayOfDosen) {
            if (dosen.getJenisKelamin() == 'L') {
                jumlahLaki++;
            } else {
                jumlahPerempuan++;
            }
        }

        System.out.println("\nJumlah Dosen per Jenis Kelamin:");
        System.out.println("Laki-laki  : " + jumlahLaki);
        System.out.println("Perempuan  : " + jumlahPerempuan);
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen03[] arrayOfDosen) {
        int totalUsiaLaki = 0, totalUsiaPerempuan = 0;
        int countLaki = 0, countPerempuan = 0;

        for (Dosen03 dosen : arrayOfDosen) {
            if (dosen.getJenisKelamin() == 'L') {
                totalUsiaLaki += dosen.getUsia();
                countLaki++;
            } else {
                totalUsiaPerempuan += dosen.getUsia();
                countPerempuan++;
            }
        }

        System.out.println("\nRata-rata Usia Dosen per Jenis Kelamin:");
        System.out.println("Laki-laki  : " + (countLaki > 0 ? (double) totalUsiaLaki / countLaki : 0) + " tahun");
        System.out.println("Perempuan  : " + (countPerempuan > 0 ? (double) totalUsiaPerempuan / countPerempuan : 0) + " tahun");
    }

    public void infoDosenPalingTua(Dosen03[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;

        Dosen03 dosenTertua = arrayOfDosen[0];
        for (Dosen03 dosen : arrayOfDosen) {
            if (dosen.getUsia() > dosenTertua.getUsia()) {
                dosenTertua = dosen;
            }
        }

        System.out.println("\nDosen Paling Tua:");
        dosenTertua.tampilkanInfo();
    }

    public void infoDosenPalingMuda(Dosen03[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;

        Dosen03 dosenTermuda = arrayOfDosen[0];
        for (Dosen03 dosen : arrayOfDosen) {
            if (dosen.getUsia() < dosenTermuda.getUsia()) {
                dosenTermuda = dosen;
            }
        }

        System.out.println("\nDosen Paling Muda:");
        dosenTermuda.tampilkanInfo();
    }
}
