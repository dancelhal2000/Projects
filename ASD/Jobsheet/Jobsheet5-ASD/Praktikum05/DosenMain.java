import java.util.Scanner;

public class DosenMain {

    public static void menu() {
        System.out.println("menu");
        System.out.println("1. Tambah Data");
        System.out.println("2. Tampilkan Data");
        System.out.println("3. Bubble Sort");
        System.out.println("4. Selection Sort");
        System.out.println("5. Insertion Sort");
        System.out.println("6. Keluar");
        System.out.print("Pilih menu: ");
    }

    public static void main(String[] args) {
        DataDosen list = new DataDosen();
        Scanner s = new Scanner(System.in);

        int pilih = 0;

        while (pilih != 6) {
            menu();
            pilih = s.nextInt();
            s.nextLine();
            switch (pilih) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        System.out.print("Kode: ");
                        String kode = s.nextLine();
                        System.out.print("Nama: ");
                        String nama = s.nextLine();
                        System.out.print("Jenis Kelamin: ");
                        Boolean jenisKelamin = s.nextBoolean();
                        System.out.print("Usia: ");
                        int usia = s.nextInt();
                        s.nextLine();
                        Dosen16 d = new Dosen16(kode, nama, jenisKelamin, usia);
                        list.tambah(d);
                    }
                    break;
                case 2:
                    list.tampil();
                    break;
                case 3:
                    list.SortingASC();
                    list.tampil();
                    break;
                case 4:
                    list.SortingDESC();
                    list.tampil();
                    break;
                case 5:
                    list.insertionSort();
                    list.tampil();
                    break;
                case 6:
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
        }
    }
}
