import java.util.Arrays;
import java.util.Scanner;

public class NumberCheckerSet1 {
    public static int countDigits(long n) {
        n = Math.abs(n);
        if (n == 0) return 1;
        int c = 0;
        while (n > 0) { c++; n /= 10; }
        return c;
    }

    public static int[] digitsArray(long n) {
        n = Math.abs(n);
        int size = countDigits(n);
        int[] digits = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            digits[i] = (int) (n % 10);
            n /= 10;
        }
        return digits;
    }

    public static boolean isDuck(int[] digits) {
        
        for (int d : digits) if (d != 0) return true;
        return false;
    }

    public static boolean isArmstrong(int[] digits) {
        int p = digits.length;
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, p);
        int value = 0;
        for (int d : digits) value = value * 10 + d;
        return sum == value;
    }

    public static int[] largestAndSecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int v : arr) {
            if (v > max) { second = max; max = v; }
            else if (v > second && v != max) second = v;
        }
        return new int[]{max, second == Integer.MIN_VALUE ? max : second};
    }

    public static int[] smallestAndSecondSmallest(int[] arr) {
        int min = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int v : arr) {
            if (v < min) { second = min; min = v; }
            else if (v < second && v != min) second = v;
        }
        return new int[]{min, second == Integer.MAX_VALUE ? min : second};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        long n = sc.nextLong();
        int[] digits = digitsArray(n);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Count of digits: " + digits.length);
        System.out.println("Is Duck (non-zero digit present)? " + isDuck(digits));
        System.out.println("Is Armstrong? " + isArmstrong(digits));
        int[] top2 = largestAndSecondLargest(digits);
        System.out.println("Largest: " + top2[0] + ", 2nd Largest: " + top2[1]);
        int[] small2 = smallestAndSecondSmallest(digits);
        System.out.println("Smallest: " + small2[0] + ", 2nd Smallest: " + small2[1]);
    }
}
