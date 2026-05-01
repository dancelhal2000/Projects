import java.util.Scanner;

public class mainSurat {
    public static void main(String[] args) {
        stackSurat stack = new stackSurat(5);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat");
            System.out.println("2. Proses Surat");
            System.out.println("3. Melihat Surat Teratas");
            System.out.println("4. Cari surat");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("Id Surat: ");
                    String idSurat = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenisIzin = scan.next().charAt(0);
                    System.out.print("Durasi: ");
                    int durasi = scan.nextInt();
                    Surat16 s = new Surat16(idSurat, nama, kelas, jenisIzin, durasi);
                    stack.push(s);
                    System.out.printf("Surat %s berhasil diterima\n", s.namaMahasiswa);
                    break;

                case 2:
                    Surat16 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Memproses surat dari " + diproses.namaMahasiswa);
                    } else {
                        System.out.println("Stack kosong");
                    }
                    break;

                case 3:
                    Surat16 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat terakhir diterima oleh " + lihat.namaMahasiswa);
                    } else {
                        System.out.println("Stack kosong");
                    }
                    break;

                case 4:
                    System.out.print("Nama: ");
                    String namaCari = scan.nextLine();
                    stack.cariSurat(namaCari);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}