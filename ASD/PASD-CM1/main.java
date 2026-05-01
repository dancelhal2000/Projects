import java.util.Scanner;

public class main {

    public static void menu() {
        System.out.println("Menu");
        System.out.println("1. Tampilkan Mahasiswa");
        System.out.println("2. Tampilkan Buku");
        System.out.println("3. Tampilkan Peminjaman");
        System.out.println("4. Mengembalikan Buku");
        System.out.println("5. Daftar Peminjaman");
        System.out.println("6. Exit");
        System.out.println("========================");
    }

    public static void SelectionSort(peminjaman[] pjm) {
        System.out.println("Selection Sort");
        for (int i = 0; i < pjm.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < pjm.length; j++) {
                if (pjm[j].denda > pjm[min].denda) {
                    min = j;
                }
            }
            peminjaman temp = pjm[i];
            pjm[i] = pjm[min];
            pjm[min] = temp;
        }
    }

    public static void BinarySearch(peminjaman[] pjm, String target) {
        int left = 0;
        int right = pjm.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (pjm[mid].mhs.nim.equals(target)) {
                System.out.println("Data ditemukan pada index " + mid);
                pjm[mid].tampilkanPinjaman();
                return;
            }
            if (pjm[mid].mhs.nim.compareTo(target) > 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Data tidak ditemukan");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        mahasiswa mhs1 = new mahasiswa("22001", "Andi", "Teknik Informatika");
        mahasiswa mhs2 = new mahasiswa("22002", "Budi", "Teknik Informatika");
        mahasiswa mhs3 = new mahasiswa("22003", "Citra", "Sistem Informasi Bisnis");

        buku bk1 = new buku("BK001", "Algoritma", 2020);
        buku bk2 = new buku("BK002", "Basis Data", 2019);
        buku bk3 = new buku("BK003", "Pemrograman", 2021);
        buku bk4 = new buku("BK004", "Fisika", 2024);

        peminjaman[] pjm = new peminjaman[5];

        pjm[0] = new peminjaman(mhs1, bk1, 7);
        pjm[1] = new peminjaman(mhs2, bk2, 3);
        pjm[2] = new peminjaman(mhs3, bk3, 10);
        pjm[3] = new peminjaman(mhs3, bk4, 6);
        pjm[4] = new peminjaman(mhs1, bk2, 4);

        System.out.println("Data Peminjaman Sebelum Diurutkan");
        pjm[0].hitungDenda();
        pjm[1].hitungDenda();
        pjm[2].hitungDenda();
        pjm[3].hitungDenda();
        pjm[4].hitungDenda();

        System.out.println("Data Peminjaman Sebelum Diurutkan");
        pjm[0].tampilkanPinjaman();
        pjm[1].tampilkanPinjaman();
        pjm[2].tampilkanPinjaman();
        pjm[3].tampilkanPinjaman();
        pjm[4].tampilkanPinjaman();

        SelectionSort(pjm);

        System.out.println("Data Peminjaman Setelah Diurutkan");
        pjm[0].tampilkanPinjaman();
        pjm[1].tampilkanPinjaman();
        pjm[2].tampilkanPinjaman();
        pjm[3].tampilkanPinjaman();
        pjm[4].tampilkanPinjaman();

        BinarySearch(pjm, "22001");
    }
}
