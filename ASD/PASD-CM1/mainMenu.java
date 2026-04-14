import java.util.Scanner;
public class mainMenu {

    public static void menu() {
        System.out.println("Menu");
        System.out.println("1. Tampilkan Mahasiswa");
        System.out.println("2. Tampilkan Buku");
        System.out.println("3. Tampilkan Peminjaman");
        System.out.println("4. Urutkan Berdasarkan Denda");
        System.out.println("5. Cari Berdasarkan NIM");
        System.out.println("6. Exit");
        System.out.println("========================");
    }

    public static void InsertionSortbyDenda(peminjaman[] pjm) {
        for (int i = 1; i < pjm.length; i++) {
            peminjaman key = pjm[i];
            int j = i - 1;
            while (j >= 0 && pjm[j].denda < key.denda) {
                pjm[j + 1] = pjm[j];
                j = j - 1;
            }
            pjm[j + 1] = key;
        }
    }

        public static void InsertionSortbyNim(peminjaman[] pjm) {
        for (int i = 1; i < pjm.length; i++) {
            peminjaman key = pjm[i];
            int j = i - 1;
            while (j >= 0 && pjm[j].mhs.nim.compareTo(key.mhs.nim) < 0) {
                pjm[j + 1] = pjm[j];
                j = j - 1;
            }
            pjm[j + 1] = key;
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

            Scanner sc = new Scanner(System.in);
            int pilihan;
            do {
                menu();
                System.out.print("Masukkan pilihan: ");
                pilihan = sc.nextInt();
                switch (pilihan) {
                    case 1:
                        mhs1.tampilkanMahasiswa();
                        mhs2.tampilkanMahasiswa();
                        mhs3.tampilkanMahasiswa();
                        break;
                    case 2:
                        bk1.tampilkanBuku();
                        bk2.tampilkanBuku();
                        bk3.tampilkanBuku();
                        bk4.tampilkanBuku();
                        break;
                    case 3:
                        pjm[0].hitungDenda();
                        pjm[1].hitungDenda();
                        pjm[2].hitungDenda();
                        pjm[3].hitungDenda();
                        pjm[4].hitungDenda();
                        pjm[0].tampilkanPinjaman();
                        pjm[1].tampilkanPinjaman();
                        pjm[2].tampilkanPinjaman();
                        pjm[3].tampilkanPinjaman();
                        pjm[4].tampilkanPinjaman();
                        break;
                    case 4:
                        InsertionSortbyDenda(pjm);
                        pjm[0].tampilkanPinjaman();
                        pjm[1].tampilkanPinjaman();
                        pjm[2].tampilkanPinjaman();
                        pjm[3].tampilkanPinjaman();
                        pjm[4].tampilkanPinjaman();
                        break;
                    case 5:
                        System.out.println("Masukkan NIM yang ingin dicari: ");
                        String nim = sc.next();
                        InsertionSortbyNim(pjm);
                        BinarySearch(pjm, nim);
                        break;
                    case 6:
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid");
                        break;
                }
            } while (pilihan != 6);
        }
}
