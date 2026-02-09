package Test;

public class fibonacci {

    public static void main(String[] args) {
        int y = 1;
        int x = 0;
        int z = 0;
        for (int i = 0; i < 10; i++) {
            z = x + y;
            System.out.println(z);
            x = y;
            y = z;
        }
    }
}