package StringHandling;

import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int[] freq = new int[256];
        for (char c : str.toCharArray()) {
            freq[c]++;
        }

        char maxChar = ' ';
        int max = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > max) {
                max = freq[i];
                maxChar = (char) i;
            }
        }
        System.out.println("Most Frequent Character: '" + maxChar + "'");
    }
}
