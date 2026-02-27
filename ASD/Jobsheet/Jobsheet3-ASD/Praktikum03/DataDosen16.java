package Praktikum03;

public class DataDosen16 {
    public void dataSemuaDosen(dosen16[] arrayOfDosen) {
        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));
            System.out.println("Kode: " + arrayOfDosen[i].kode);
            System.out.println("Nama: " + arrayOfDosen[i].nama);
            System.out.println("Jenis Kelamin: " + arrayOfDosen[i].jenisKelami);
            System.out.println("Usia: " + arrayOfDosen[i].usia);
            System.out.println("-------------------------------------");
        }
    }

    public void jumlahDosenPerjenisKelamin(dosen16[] arrayOfDosen) {
        int jumlahLaki = 0;
        int jumlahWanita = 0;

        for (int i = 0; i < 3; i++) {
            if (arrayOfDosen[i].jenisKelami == true) {
                jumlahLaki++;
            } else {
                jumlahWanita++;
            }
        }
        System.out.println("Jumlah Dosen Laki-laki: " + jumlahLaki);
        System.out.println("Jumlah Dosen Wanita: " + jumlahWanita);
        System.out.println("-------------------------------------");
    }

    public void rerataUsiaDosenPerJenisKelamin(dosen16[] arrayOfDosen) {
        int jumlahLaki = 0;
        int jumlahwanita = 0;
        int totalLaki = 0;
        int totalWanita = 0;

        for (int i = 0; i < 3; i++) {
            if (arrayOfDosen[i].jenisKelami == true) {
                jumlahLaki++;
                totalLaki += arrayOfDosen[i].usia;
            } else {
                jumlahwanita++;
                totalWanita += arrayOfDosen[i].usia;
            }
        }

        System.out.println("Rata-rata Usia Dosen laki: " + totalLaki / jumlahLaki);
        System.out.println("Rata-rata Usia Dosen Wanita: " + totalWanita / jumlahwanita);
        System.out.println("-------------------------------------");
    }

    public void infoDosenTertua(dosen16[] arrayOfDosen) {
        int tertua = 0;
        String nama = "";
        for (int i = 0; i < 3; i++) {
            if (arrayOfDosen[i].usia > tertua) {
                tertua = arrayOfDosen[i].usia;
                nama = arrayOfDosen[i].nama;

            }
        }
        System.out.println("Dosen Tertua adalah " + nama + "dengan usia " + tertua);
        System.out.println("-------------------------------------");
    }

    public void infoDosenTermuda(dosen16[] arrayOfDosen) {
        int termuda = 100;
        String nama = "";
        for (int i = 0; i < 3; i++) {
            if (arrayOfDosen[i].usia < termuda) {
                termuda = arrayOfDosen[i].usia;
                nama = arrayOfDosen[i].nama;

            }
        }
        System.out.println("Dosen Termuda adalah " + nama + "dengan usia " + termuda);
        System.out.println("-------------------------------------");
    }
}
