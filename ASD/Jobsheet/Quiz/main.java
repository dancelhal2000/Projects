package ASD.Jobsheet.Quiz;

import java.util.Scanner;

public class main {

    public static void menu() {
        System.out.println("Menu");
        System.out.println("1. Menambah Buku");
        System.out.println("2. Menambah Mahasiswa");
        System.out.println("3. Pinjam Buku");
        System.out.println("4. Mengembalikan Buku");
        System.out.println("5. Daftar Peminjaman");
        System.out.println("6. Exit");
        System.out.println("========================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Perpustakaan perpus = new Perpustakaan();
        menu();

        while (true) {
            System.out.print("Pilih Menu : ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan Kode Buku : ");
                    String kode = sc.nextLine();
                    System.out.print("Masukkan Judul Buku : ");
                    String judul = sc.nextLine();
                    System.out.print("Masukkan Penulis Buku : ");
                    String penulis = sc.nextLine();
                    perpus.tambahBuku(new buku(kode, judul, penulis));
                    break;
                case 2:
                    System.out.print("Masukkan NIM Mahasiswa : ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama Mahasiswa : ");
                    String nama = sc.nextLine();
                    perpus.tambahMahasiswa(new mahasiswa(nim, nama));
                    break;
                case 3:
                    System.out.print("Masukkan NIM mahasiswa: ");
                    String nimP = sc.nextLine();
                    System.out.print("Masukkan kode buku: ");
                    String kodeP = sc.nextLine();
                    perpus.pinjamBuku(nimP, kodeP);
                    break;
                case 4:
                    System.out.print("Masukkan NIM mahasiswa: ");
                    String nimK = sc.nextLine();
                    System.out.print("Masukkan kode buku: ");
                    String kodeK = sc.nextLine();
                    perpus.kembalikanBuku(nimK, kodeK);
                    break;
                case 5:
                    perpus.daftarPeminjaman();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu Tidak Tersedia");
                    break;
            }
            System.out.println();
        }
    }
}
