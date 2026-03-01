package latihanASD;

public class fizzbuzz2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
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
