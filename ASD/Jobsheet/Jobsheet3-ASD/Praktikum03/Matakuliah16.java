package Praktikum03;

import java.util.Scanner;

public class Matakuliah16 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public Matakuliah16(String kodeString, String namaString, int sksInt, int jumlahJamInt) {
        this.kode = kodeString;
        this.nama = namaString;
        this.sks = sksInt;
        this.jumlahJam = jumlahJamInt;
    }

    public Matakuliah16() {
    }

    public void tambahdata(Scanner sc) {
        System.out.print("Kode       : ");
        this.kode = sc.nextLine();
        System.out.print("Nama       : ");
        this.nama = sc.nextLine();
        System.out.print("SKS        : ");
        this.sks = Integer.parseInt(sc.nextLine());
        System.out.print("Jumlah Jam : ");
        this.jumlahJam = Integer.parseInt(sc.nextLine());
    }

    public void cetakInfo() {
        System.out.println("Kode       : " + kode);
        System.out.println("Nama       : " + nama);
        System.out.println("SKS        : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
        System.out.println("-------------------------------------");
    }

}
