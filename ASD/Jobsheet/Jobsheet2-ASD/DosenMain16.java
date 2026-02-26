import java.util.Scanner;

public class DosenMain16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen16 dsn1 = new Dosen16();
        dsn1.idDosen = "D001";
        dsn1.nama = "Budi";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2022;
        dsn1.bidangKeahlian = "Pemrograman";

        dsn1.tampilkanInformasi();

        System.out.print("Masukkan Status Aktif Baru: ");
        dsn1.setStatusAktif(sc.nextBoolean());

        System.out.print("Masukkan Tahun sekarang: ");
        int tahunSekarang1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Masa Kerja: " + dsn1.hitungMasaKerja(tahunSekarang1) + " tahun");

        System.out.print("Masukkan Bidang Keahlian: ");
        dsn1.ubahKeahlian(sc.nextLine());
        System.out.print("\n");
        dsn1.tampilkanInformasi();

        Dosen16 dsn2 = new Dosen16("D002", "Santoso", false, 2019, "Ekonomi");

        dsn2.tampilkanInformasi();

        System.out.print("Masukkan Status Aktif Baru: ");
        dsn2.setStatusAktif(sc.nextBoolean());

        System.out.print("Masukkan Tahun sekarang: ");
        int tahunSekarang2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Masa Kerja: " + dsn2.hitungMasaKerja(tahunSekarang2) + " tahun");

        System.out.print("Masukkan Bidang Keahlian baru: ");
        dsn2.ubahKeahlian(sc.nextLine());
        System.out.print("\n");
        dsn2.tampilkanInformasi();
    }
}
