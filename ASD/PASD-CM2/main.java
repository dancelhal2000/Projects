import java.util.Scanner;

public class main {
    static dLLPembeli dllPembeli = new dLLPembeli();
    static dLLPesanan dllPesanan = new dLLPesanan();
    static Scanner sc = new Scanner(System.in);

    public static void menu() {
        System.out.println("===================");
        System.out.println("Sistem Antrian Royal Delish");
        System.out.println("===================");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Cetak Antrian");
        System.out.println("3. Hapus Antrian dan pesan");
        System.out.println("4. Laporan Pesanan");
        System.out.println("5. Keluar");
        System.out.print("Masukkan Pilihan: ");
    }

    public static void main(String[] args) {
        int indeksPesanan = 0;
        pesanan[] p = new pesanan[3];
        p[0] = new pesanan(1, "Nasi Goreng", 10000);
        p[1] = new pesanan(2, "Mie Goreng", 12000);
        p[2] = new pesanan(3, "Ayam Bakar", 15000);

        int indeksPembeli = 0;
        pembeli[] pb = new pembeli[4];
        pb[0] = new pembeli("Ainra", "084222345566");
        pb[1] = new pembeli("Danra", "084345464646");
        pb[2] = new pembeli("Sanri", "084443445456");
        pb[3] = new pembeli("Vania", "084334545454");

        int pilihan = 0;
        while (pilihan != 5) {
            menu();
            pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    if (indeksPembeli < 4) {
                        dllPembeli.addLast(pb[indeksPembeli]);
                        System.out.println("Data " + pb[indeksPembeli].namaPembeli + " berhasil ditambahkan.");
                        indeksPembeli++;
                    } else {
                        System.out.println("Antrian penuh.");
                    }
                    break;
                case 2:
                    dllPembeli.print();
                    break;
                case 3:
                    if (dllPembeli.isEmpty()) {
                        System.out.println("Antrian kosong.");
                        break;
                    }
                    if (indeksPesanan < 3) {
                        dllPesanan.addLast(p[indeksPesanan]);
                        System.out.println(dllPembeli.head.data.namaPembeli + " berhasil memesan.");
                        dllPembeli.removeFirst();
                        indeksPesanan++;
                    } else {
                        System.out.println("Pesanan penuh.");
                        dllPembeli.removeFirst();
                    }
                    break;
                case 4:
                    dllPesanan.Sorting();
                    dllPesanan.print();
                    break;
                case 5:
                    System.out.println("Terimakasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        }
    }
}