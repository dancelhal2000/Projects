import java.util.Scanner;

public class main {
    static DoubleLinkedList dllPembeli = new DoubleLinkedList();
    static DoubleLinkedList dllPesanan = new DoubleLinkedList();
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
        int pilihan = 0;
        while (pilihan != 5) {
            menu();
            pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    pembeli pb1 = new pembeli("Vania", "084222345566");
                    pembeli pb2 = new pembeli("Danra", "084345464646");
                    pembeli pb3 = new pembeli("Sanri", "084443445456");
                    pembeli pb4 = new pembeli("Ainra", "084334545454");
                    dllPembeli.addFirst(pb1);
                    dllPembeli.addFirst(pb2);
                    dllPembeli.addFirst(pb3);
                    dllPembeli.addFirst(pb4);
                    dllPembeli.print();
                    break;
                case 2:
                    dllPembeli.printReverse();
                    break;
                case 3:
                    dllPembeli.removeFirst();
                    pesanan p1 = new pesanan(1, "Nasi Goreng", 10000);
                    pesanan p2 = new pesanan(2, "Mie Goreng", 12000);
                    pesanan p3 = new pesanan(3, "Ayam Bakar", 15000);
                    dllPesanan.addFirst(p1);
                    dllPesanan.addFirst(p2);
                    dllPesanan.addFirst(p3);
                    dllPesanan.print();
                    break;
                case 4:
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