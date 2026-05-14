package tugas;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        SingleLinkedList16 sll = new SingleLinkedList16();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("==========================");
            System.out.println("Menu Operasi Linked List");
            System.out.println("==========================");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek Front");
            System.out.println("4. Peek Rear");
            System.out.println("5. Print");
            System.out.println("6. Size");
            System.out.println("7. clear");
            System.out.println("8. Keluar");
            System.out.print("Pilih Menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine(); // Membersihkan buffer newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa16 mhs = new Mahasiswa16(nim, nama, kelas);
                    sll.enqueue(mhs);
                    System.out.println("Data berhasil ditambahkan.");
                    break;

                case 2:
                    Mahasiswa16 removed = sll.dequeue();
                    if (removed != null) {
                        System.out.println("Data terhapus: " + removed.nama);
                    }
                    break;

                case 3:
                    sll.peekFront();
                    break;

                case 4:
                    sll.peekRear();
                    break;

                case 5:
                    sll.print();
                    break;

                case 6:
                    sll.size();
                    break;

                case 7:
                    sll.clear();
                    System.out.println("Linked list berhasil dihapus.");
                    break;

                case 8:
                    System.out.println("Keluar dari program.");
                    return;

                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
            System.out.println(); // Baris baru untuk kerapihan
        }
    }
}
