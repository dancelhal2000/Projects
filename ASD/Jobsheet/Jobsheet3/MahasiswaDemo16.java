import java.util.Scanner;

public class MahasiswaDemo16 {
    public static void main(String[] args) {
        MahasiswaBerprestasi16 list = new MahasiswaBerprestasi16();

        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("NIM: ");
            String nim = s.nextLine();
            System.out.print("Nama: ");
            String nama = s.nextLine();
            System.out.print("Kelas: ");
            String kelas = s.nextLine();
            System.out.print("IPK: ");
            double ipk = s.nextDouble();
            s.nextLine();
            Mahasiswa16 m = new Mahasiswa16(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("Data mahasiswa sebelum sorting:");
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC):");
        list.insertionSort();
        list.tampil();
    }
}