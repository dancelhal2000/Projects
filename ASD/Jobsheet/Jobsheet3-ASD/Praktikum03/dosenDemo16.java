package Praktikum03;

import java.util.Scanner;

public class dosenDemo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        dosen16[] arrayOfDosen = new dosen16[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data dosen ke-" + (i + 1));
            System.out.print("Kode: ");
            String kode = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin: ");
            Boolean jenisKelamin = sc.nextBoolean();
            System.out.print("Usia: ");
            int usia = sc.nextInt();
            sc.nextLine();
            arrayOfDosen[i] = new dosen16(kode, nama, jenisKelamin, usia);
            System.out.println("------------------------------------");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));
            System.out.println("Kode: " + arrayOfDosen[i].kode);
            System.out.println("Nama: " + arrayOfDosen[i].nama);
            System.out.println("Jenis Kelamin: " + arrayOfDosen[i].jenisKelami);
            System.out.println("Usia: " + arrayOfDosen[i].usia);
            System.out.println("-------------------------------------");
        }
        DataDosen16 dd = new DataDosen16();
        dd.dataSemuaDosen(arrayOfDosen);
        dd.jumlahDosenPerjenisKelamin(arrayOfDosen);
        dd.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        dd.infoDosenTertua(arrayOfDosen);
        dd.infoDosenTermuda(arrayOfDosen);
    }
}
