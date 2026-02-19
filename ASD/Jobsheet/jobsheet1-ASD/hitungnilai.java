import java.util.Scanner;

public class hitungnilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("program menghitung Nilai Akhir");
        System.out.println("=======================");

        System.out.print("Masukkan nilai tugas: ");
        int tugas = sc.nextInt();
        System.out.print("Masukkan nilai kuis : ");
        int kuis = sc.nextInt();
        System.out.print("Masukkan nilai uts  : ");
        int uts = sc.nextInt();
        System.out.print("Masukkan nilai uas  : ");
        int uas = sc.nextInt();

        double total = (tugas * 0.2) + (kuis * 0.2) + (uts * 0.3) + (uas * 0.3);

        System.out.println("=======================");

        if (total < 0 || total > 100) {
            System.out.println("Nilai total tidak valid");
        } else {
            String nilaiHuruf;
            if (total > 80) {
                nilaiHuruf = "A";
            } else if (total > 73) {
                nilaiHuruf = "B+";
            } else if (total > 65) {
                nilaiHuruf = "B";
            } else if (total > 60) {
                nilaiHuruf = "C+";
            } else if (total > 50) {
                nilaiHuruf = "C";
            } else if (total > 39) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }

            System.out.printf("Nilai total: %.2f\n", total);
            System.out.println("Nilai huruf: " + nilaiHuruf);
            System.out.println("=======================");

            System.out.print("Status Kelulusan: ");
            if (nilaiHuruf.equals("E") || nilaiHuruf.equals("D")) {
                System.out.println("Tidak Lulus");
            } else {
                System.out.println("Lulus");
            }
        }
    }
}