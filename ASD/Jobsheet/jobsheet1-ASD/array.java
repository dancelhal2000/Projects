import java.util.Scanner;

public class array {
    static Scanner sc = new Scanner(System.in);

    static String[] namaMK = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "CTPS",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "K3"
    };

    static int jumlahMK = namaMK.length;
    static double[] nilaiMK = new double[jumlahMK];

    public static String konversinilaiHuruf(double nilai) {
        if (nilai > 80)
            return "A";
        else if (nilai > 73)
            return "B+";
        else if (nilai > 65)
            return "B";
        else if (nilai > 60)
            return "C+";
        else if (nilai > 50)
            return "C";
        else if (nilai > 39)
            return "D";
        else
            return "E";
    }

    public static double bobotNilai(double nilai) {
        if (nilai > 80)
            return 4.0;
        else if (nilai > 73)
            return 3.5;
        else if (nilai > 65)
            return 3.0;
        else if (nilai > 60)
            return 2.5;
        else if (nilai > 50)
            return 2.0;
        else if (nilai > 39)
            return 1.0;
        else
            return 0.0;
    }

    public static void main(String[] args) {
        System.out.println("=======================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("=======================================");

        for (int i = 0; i < jumlahMK; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + namaMK[i] + ": ");
            nilaiMK[i] = sc.nextDouble();
        }

        System.out.println("=======================================");
        System.out.printf("%-30s %-10s %-10s %-10s\n", "Mata Kuliah", "Nilai", "Huruf", "Bobot");
        System.out.println("=======================================");

        double totalBobot = 0;
        for (int i = 0; i < jumlahMK; i++) {
            double bobot = bobotNilai(nilaiMK[i]);
            String huruf = konversinilaiHuruf(nilaiMK[i]);
            System.out.printf("%-30s %-10.2f %-10s %-10.2f\n",
                    namaMK[i], nilaiMK[i], huruf, bobot);

            totalBobot += bobot;
        }

        System.out.println("=======================================");
        double ipSemester = totalBobot / jumlahMK;
        System.out.printf("IP Semester: %.2f\n", ipSemester);
        System.out.println("=======================================");
    }
}