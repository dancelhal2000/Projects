package latihanASD;

import java.util.Scanner;

public class filmScore {
    public static void main(String[] args) {
        int[][] rating = {
                { 4, 3, 4, 4 },
                { 1, 1, 2, 3 },
                { 1, 2, 3, 4 }
        };
        double max = 0;
        int best = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("rata-rata penonton " + i + " adalah " + hitungRataPenonton(rating, i));
            if (hitungRataPenonton(rating, i) > max) {
                max = hitungRataPenonton(rating, i);
                best = i;
            }
        }
        System.out.println("penonton dengan nilai tertinggi adalah " + best);

        for (int i = 0; i < 4; i++) {
            hitungRataFilm(rating, i);
        }
    }

    public static double hitungRataPenonton(int[][] rating, int index) {
        double sum = 0;
        for (int i = 0; i < 4; i++) {
            sum = sum + rating[index][i];
        }
        sum = sum / 4;
        return sum;
    }

    public static void hitungRataFilm(int[][] rating, int index) {
        double sum = 0;
        for (int i = 0; i < 3; i++) {
            sum = sum + rating[i][index];
        }
        System.out.println("rata-rata film " + index + " adalah " + sum / 3);
    }
}
