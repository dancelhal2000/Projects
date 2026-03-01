package latihanASD;

import java.util.HashMap;
import java.util.Scanner;

public class romannumerals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("INPUT: ");
        String input = sc.nextLine();

        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int Total = 0;
        int lastValue = 0;

        for (int i = input.length() - 1; i >= 0; i--) {
            // Get the character at index i
            char currentChar = input.charAt(i);

            // Look up its integer value
            int value = romanMap.get(currentChar);

            if (value < lastValue) {
                Total -= value;
            } else {
                Total += value;
            }

            lastValue = value;

        }
        System.out.println(Total);
    }
}
