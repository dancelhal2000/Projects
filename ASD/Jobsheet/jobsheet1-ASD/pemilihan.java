import java.util.Scanner;

public class pemilihan {
    static Scanner sc = new Scanner(System.in);

    public static int inputnilaitugas() {
        System.out.print("Masukkan nilai tugas: ");
        int tugas = sc.nextInt();
        if (tugas < 0 || tugas > 100) {
            System.out.println("Nilai tugas tidak valid");
            return inputnilaitugas();
        }
        return tugas;
    }

    public static int inputnilaiuts() {
        System.out.print("Masukkan nilai uts: ");
        int uts = sc.nextInt();
        if (uts < 0 || uts > 100) {
            System.out.println("Nilai uts tidak valid");
            return inputnilaiuts();
        }
        return uts;
    }

    public static int inputnilaiuas() {
        System.out.print("Masukkan nilai uas: ");
        int uas = sc.nextInt();
        if (uas < 0 || uas > 100) {
            System.out.println("Nilai uas tidak valid");
            return inputnilaiuas();
        }
        return uas;
    }

    public static int inputnilaikuis() {
        System.out.print("Masukkan nilai kuis: ");
        int kuis = sc.nextInt();
        if (kuis < 0 || kuis > 100) {
            System.out.println("Nilai kuis tidak valid");
            return inputnilaikuis();
        }
        return kuis;
    }

    public static String konversinilai(double total) {
        if (total > 80) {
            return "A";
        } else if (total > 73) {
            return "B+";
        } else if (total > 65) {
            return "B";
        } else if (total > 60) {
            return "C+";
        } else if (total > 50) {
            return "C";
        } else if (total > 39) {
            return "D";
        } else {
            return "E";
        }
    }

    public static void kelulusan(String nilai) {
        if (nilai.equals("E") || nilai.equals("D")) {
            System.out.println("Tidak Lulus");
        } else {
            System.out.println("Lulus");
        }
    }

    public static void hitungtotal() {
        System.out.println("program menghitung Nilai Akhir");
        System.out.println("=======================");
        int tugas = inputnilaitugas();
        int kuis = inputnilaikuis();
        int uts = inputnilaiuts();
        int uas = inputnilaiuas();
        double total = (tugas * 20 + kuis * 20 + uts * 30 + uas * 30) / 100;
        if (total < 0 || total > 100) {
            System.out.println("Nilai total tidak valid");
            return;
        }
        String nilai = konversinilai(total);
        System.out.println("=======================");
        System.out.println("=======================");
        System.out.println("Nilai total: " + total);
        System.out.println("Nilai huruf: " + nilai);
        System.out.println("=======================");
        System.out.println("=======================");
        System.out.print("Status Kelulusan: ");
        kelulusan(nilai);
    }

    public static void main(String[] args) {
        hitungtotal();
    }
}