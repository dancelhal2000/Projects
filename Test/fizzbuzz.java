package Test;

public class fizzbuzz {
    public static void main(String[] args) {
        int x;
        for (int i = 0; i <= 50; i++) {
            x = i;
            if (x % 3 == 0 && x % 5 == 0) {
                System.out.println("fizzbuzz");
                continue;
            } else if (x % 3 == 0) {
                System.out.println("fizz");
            } else if (x % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(x);
            }
        }
    }
}