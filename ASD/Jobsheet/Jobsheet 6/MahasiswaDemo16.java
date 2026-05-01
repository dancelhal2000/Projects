import java.util.Scanner;

public class MahasiswaDemo16 {
    public static void main(String[] args) {
        MahasiswaBerprestasi16 list = new MahasiswaBerprestasi16();
        Scanner sc = new Scanner(System.in);
        int jumMhs = 5;

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM : ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            list.tambah(new Mahasiswa16(nim, nama, kelas, ipk));
        }

        System.out.println("-------------------- \n");
        list.tampil();

        System.out.println("--------------------");
        System.out.println("Pencarian data");
        System.out.println("--------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cariBiner = sc.nextDouble();

        System.out.println("--------------------");
        System.out.println("menggunakan binary search");
        System.out.println("--------------------");

        int pssBiner = list.findBinarySearch(cariBiner, 0, jumMhs - 1);

        list.tampilPosisi(cariBiner, pssBiner);
        list.tampilDataSearch(cariBiner, pssBiner);
    }
}