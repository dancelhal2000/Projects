import java.util.Scanner;

public class KRSMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueKRS antrian = new QueueKRS(10); // Kapasitas maks 10
        int pilih;

        do {
            System.out.println("\n=== Sistem Antrian KRS DPA ===");
            System.out.println("1. Tambah Antrian Mahasiswa");
            System.out.println("2. Panggil Antrian (Proses 2 Mhs)");
            System.out.println("3. Lihat Semua Antrian");
            System.out.println("4. Lihat 2 Antrian Terdepan");
            System.out.println("5. Lihat Antrian Terakhir");
            System.out.println("6. Cek Statistik (Jumlah Selesai/Belum)");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    antrian.enqueue(new Mahasiswa(nim, nama, prodi, kelas));
                    break;
                case 2:
                    antrian.layaniKRS();
                    break;
                case 3:
                    antrian.printAll();
                    break;
                case 4:
                    antrian.printTop2();
                    break;
                case 5:
                    antrian.printLast();
                    break;
                case 6:
                    System.out.println("Jumlah dalam antrian saat ini: " + antrian.size);
                    System.out.println("Total mahasiswa sudah KRS: " + antrian.totalSelesai);
                    System.out.println("Sisa kuota mahasiswa belum KRS: " + antrian.getBelumKRS());
                    break;
                case 7:
                    antrian.clear();
                    break;
            }
        } while (pilih != 0);
    }
}