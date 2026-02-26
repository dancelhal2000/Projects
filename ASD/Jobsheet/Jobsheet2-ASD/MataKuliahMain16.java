import java.util.Scanner;

public class MataKuliahMain16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MataKuliah16 mk1 = new MataKuliah16();
        mk1.kodeMK = "AD102";
        mk1.nama = "Algoritma dan Pemrograman";
        mk1.sks = 3;
        mk1.jumlahJam = 4;

        mk1.tampilkanInformasi();
        System.out.print("Masukkan SKS Baru: ");
        mk1.ubahSKS(sc.nextInt());
        System.out.print("Masukkan Jumlah Jam Ditambah: ");
        mk1.tambahJam(sc.nextInt());
        System.out.print("Masukkan Jumlah Jam Dikurangi: ");
        mk1.kurangiJam(sc.nextInt());
        mk1.tampilkanInformasi();
        System.out.print("\n");

        MataKuliah16 mk2 = new MataKuliah16("GB202", "Basis Data", 3, 4);

        mk2.tampilkanInformasi();
        System.out.print("Masukkan SKS Baru: ");
        mk2.ubahSKS(sc.nextInt());
        System.out.print("Masukkan Jumlah Jam Ditambah: ");
        mk2.tambahJam(sc.nextInt());
        System.out.print("Masukkan Jumlah Jam Dikurangi: ");
        mk2.kurangiJam(sc.nextInt());
        mk2.tampilkanInformasi();
    }
}
