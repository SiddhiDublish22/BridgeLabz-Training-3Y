import java.util.Arrays;
import java.util.Scanner;

public class NumberCheckerSet3 {
    public static int countDigits(long n) {
        n = Math.abs(n);
        return (n == 0) ? 1 : (int) Math.floor(Math.log10(n)) + 1;
    }

    public static int[] digitsArray(long n) {
        n = Math.abs(n);
        int size = countDigits(n);
        int[] d = new int[size];
        for (int i = size - 1; i >= 0; i--) { d[i] = (int)(n % 10); n /= 10; }
        return d;
    }

    public static int[] reverseArray(int[] arr) {
        int[] r = Arrays.copyOf(arr, arr.length);
        for (int i = 0, j = r.length - 1; i < j; i++, j--) {
            int t = r[i]; r[i] = r[j]; r[j] = t;
        }
        return r;
    }

    public static boolean arraysEqual(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    public static boolean isPalindrome(int[] digits) {
        return arraysEqual(digits, reverseArray(digits));
    }

    public static boolean isDuck(int[] digits) {
        for (int d : digits) if (d != 0) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        long n = sc.nextLong();
        int[] digits = digitsArray(n);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Reversed digits: " + Arrays.toString(reverseArray(digits)));
        System.out.println("Is Palindrome? " + isPalindrome(digits));
        System.out.println("Is Duck (non-zero digit present)? " + isDuck(digits));
    }
}
