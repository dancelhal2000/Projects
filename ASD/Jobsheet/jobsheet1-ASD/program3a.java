import java.util.Scanner;

public class program3a {
    static Scanner sc = new Scanner(System.in);
    static String[] namaMK;
    static int jumlahMK;
    static double[] nilaiMK;
    static double[] bobotMK;

    public static String konversinilaiHuruf(double nilaiMK) {
        if (nilaiMK > 80) {
            return "A";
        } else if (nilaiMK > 73) {
            return "B+";
        } else if (nilaiMK > 65) {
            return "B";
        } else if (nilaiMK > 60) {
            return "C+";
        } else if (nilaiMK > 50) {
            return "C";
        } else if (nilaiMK > 39) {
            return "D";
        } else {
            return "E";
        }
    }

    public static double bobotNilai(double nilaiMK) {
        if (nilaiMK > 80) {
            return 4;
        } else if (nilaiMK > 73) {
            return 3.5;
        } else if (nilaiMK > 65) {
            return 3;
        } else if (nilaiMK > 60) {
            return 2.5;
        } else if (nilaiMK > 50) {
            return 2;
        } else if (nilaiMK > 39) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("======================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("======================");
        System.out.println("Jumlah Mata Kuliah : ");
        jumlahMK = sc.nextInt();
        sc.nextLine();
        namaMK = new String[jumlahMK];
        nilaiMK = new double[jumlahMK];

        for (int i = 0; i < jumlahMK; i++) {
            System.out.print("masukkan nama MK ke-" + (i + 1) + ": ");
            namaMK[i] = sc.nextLine();
            System.out.print("masukkan nilai Angka untuk MK " + namaMK[i] + ": ");
            nilaiMK[i] = sc.nextDouble();
            sc.nextLine();
        }
        for (int i = 0; i < jumlahMK; i++) {
            System.out.println("Nilai Mata Kuliah " + namaMK[i] + ": " + nilaiMK[i]);
            System.out.println("Bobot Nilai: " + bobotNilai(nilaiMK[i]));
            System.out.println("Konversi Nilai: " + konversinilaiHuruf(nilaiMK[i]));
        }
        System.out.println("=======================");
        double totalIP = 0;
        for (int i = 0; i < jumlahMK; i++) {
            totalIP += bobotNilai(nilaiMK[i]);
        }
        System.out.println("IP Semester: " + totalIP / jumlahMK);
        System.out.println("=======================");
    }
}
