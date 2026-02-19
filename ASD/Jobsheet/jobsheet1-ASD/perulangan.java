import java.util.Scanner;

public class perulangan {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input nim : ");
        long nim = sc.nextLong();
        int n = (int) (nim % 100);
        System.out.println("n = " + n);
        if (n < 10) {
            n = n + 10;
        }
        for (int i = 1; i <= n; i++) {
            if (i == 10 || i == 15) {
                continue;
            } else if (i % 3 == 0) {
                System.out.print("#");
            } else if (i % 2 != 0) {
                System.out.print("*");
            } else {
                System.out.print(i);
            }
            System.out.print(" ");
        }
    }
}