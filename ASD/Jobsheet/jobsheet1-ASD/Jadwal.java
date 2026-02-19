import java.util.Scanner;

public class Jadwal {
    public static Scanner sc = new Scanner(System.in);

    public static void cariMatkul(String[][] jadwal) {
        System.out.print("masukkan mata kuliah yang ingin dicari: ");
        String matkul = sc.nextLine();
        boolean found = false;
        System.out.println("======================================================================");
        System.out.printf("%-25s %-15s %-15s %-15s\n", "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("======================================================================");
        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][0].equalsIgnoreCase(matkul)) {
                found = true;
                System.out.printf("%-25s %-15s %-15s %-15s\n",
                        jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
            }
        }
        if (!found) {
            System.out.println("Mata kuliah tidak ditemukan");
            return;
        }
    }

    public static void cariHari(String[][] jadwal) {
        System.out.print("masukkan hari yang ingin dicari: ");
        String hari = sc.next();
        boolean found = false;
        System.out.println("======================================================================");
        System.out.printf("%-25s %-15s %-15s %-15s\n", "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("======================================================================");
        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                found = true;
                System.out.printf("%-25s %-15s %-15s %-15s\n",
                        jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
            }
        }
        if (!found) {
            System.out.println("Hari tidak ditemukan");
        }
    }

    public static void outputTabel(String[][] jadwal) {
        System.out.println("======================================================================");
        System.out.printf("%-25s %-15s %-15s %-15s\n", "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("======================================================================");

        for (int i = 0; i < jadwal.length; i++) {
            System.out.printf("%-25s %-15s %-15s %-15s\n",
                    jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        }
    }

    public static String[][] inputjadwal() {
        System.out.print("Masukkan jumlah jadwal: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[][] jadwal = new String[n][4];
        for (int i = 0; i < n; i++) {
            System.out.println("\nMasukkan jadwal ke-" + (i + 1));
            System.out.print("Mata Kuliah : ");
            jadwal[i][0] = sc.nextLine();
            System.out.print("Ruang       : ");
            jadwal[i][1] = sc.nextLine();
            System.out.print("Hari        : ");
            jadwal[i][2] = sc.nextLine();
            System.out.print("Jam         : ");
            jadwal[i][3] = sc.nextLine();
        }
        return jadwal;
    }

    public static void main(String[] args) {
        String[][] jadwal = inputjadwal();
        outputTabel(jadwal);
        cariMatkul(jadwal);
        cariHari(jadwal);
    }
}
