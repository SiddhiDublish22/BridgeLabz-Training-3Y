package StringHandling;

import java.util.Scanner;

public class RemoveDuplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (result.indexOf(c) == -1) result += c;
        }
        System.out.println("Modified String: " + result);
    }
}
