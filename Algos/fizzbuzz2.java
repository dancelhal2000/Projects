package Algos;

public class fizzbuzz2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i == 10 || i == 15 || i == 20) {
                continue;
            } else if (i % 3 == 0) {
                System.out.println("#");
            } else if (i % 2 == 0 && i % 3 != 0) {
                System.out.println(i);
            } else if (i % 2 != 0) {
                System.out.println("*");
            } else {
                System.out.println(i);
            }
        }
    }
}
