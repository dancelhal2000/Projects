package Praktikum03;

import java.util.Scanner;

public class MatakuliahDemo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan jumlah matakuliah: ");
        int jumlah = sc.nextInt();
        sc.nextLine();
        Matakuliah16[] arrayOfMatakuliah = new Matakuliah16[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan data matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i] = new Matakuliah16();
            arrayOfMatakuliah[i].tambahdata(sc);
            System.out.println("------------------------------------");

        }
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
        }
    }
}
