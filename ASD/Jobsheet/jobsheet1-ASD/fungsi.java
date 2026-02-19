public class fungsi {
    static int stok[][] = { { 10, 5, 15, 7 },
            { 6, 11, 9, 12 },
            { 2, 10, 10, 5 },
            { 5, 7, 12, 9 }, };
    static int harga[] = { 75000, 50000, 60000, 10000 };

    public static int totalpendapatan(int cabang) {
        int totalpendapatan = 0;
        for (int i = 0; i < stok.length; i++) {
            totalpendapatan += stok[cabang][i] * harga[i];
        }
        return totalpendapatan;

    }

    public static String status(int totalpendapatan) {
        if (totalpendapatan > 1500000) {
            return "Sangat Baik";
        } else {
            return "perlu evaluasi";
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < stok.length; i++) {
            System.out.println("Total Pendapatan RoyalGarden " + (i + 1) + ": " + totalpendapatan(i));
            System.out.println("Status: " + status(totalpendapatan(i)) + "\n");
        }
    }
}
