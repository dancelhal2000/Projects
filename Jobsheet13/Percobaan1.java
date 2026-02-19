package Jobsheet13;

public class Percobaan1 {
    static int faktorialRekursif(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * faktorialRekursif(n - 1);
        }
    }

    static int faktorialIteratif(int n) {
        int faktorial = 1;
        for (int i = n; i >= 1; i--) {
            faktorial *= i;
        }
        return faktorial;
    }

    public static void main(String[] args) {
        System.out.println(faktorialRekursif(5));
        System.out.println(faktorialIteratif(5));
    }
}