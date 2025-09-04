import java.util.Arrays;
import java.util.Scanner;

public class NumberCheckerSet2 {
    public static int countDigits(long n) {
        n = Math.abs(n);
        return (n == 0) ? 1 : (int) Math.floor(Math.log10(n)) + 1;
    }

    public static int[] digitsArray(long n) {
        n = Math.abs(n);
        int size = countDigits(n);
        int[] d = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            d[i] = (int) (n % 10); n /= 10;
        }
        return d;
    }

    public static int sumOfDigits(int[] digits) {
        int s = 0;
        for (int x : digits) s += x;
        return s;
    }

    public static int sumOfSquares(int[] digits) {
        int s = 0;
        for (int x : digits) s += Math.pow(x, 2);
        return s;
    }

    public static boolean isHarshad(long n, int[] digits) {
        int sum = sumOfDigits(digits);
        if (sum == 0) return false;
        return (Math.abs(n) % sum) == 0;
    }

    public static int[][] frequency2D(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) { freq[i][0] = i; freq[i][1] = 0; }
        for (int d : digits) freq[d][1]++;
        return freq;
    }

    public static void print2D(int[][] arr) {
        System.out.println("Digit\tFreq");
        for (int[] row : arr) System.out.println(row[0] + "\t" + row[1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        long n = sc.nextLong();
        int[] digits = digitsArray(n);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares: " + sumOfSquares(digits));
        System.out.println("Is Harshad? " + isHarshad(n, digits));
        int[][] freq = frequency2D(digits);
        print2D(freq);
    }
}
