import java.util.Scanner;

public class NumberCheckerSet4 {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) if (n % i == 0) return false;
        return true;
    }

    public static boolean isNeon(int n) {
        int sq = n * n;
        int sum = 0;
        while (sq > 0) { sum += sq % 10; sq /= 10; }
        return sum == n;
    }

    public static boolean isSpy(int n) {
        int sum = 0, prod = 1, temp = Math.abs(n);
        if (n == 0) prod = 0;
        while (temp > 0) { int d = temp % 10; sum += d; prod *= d; temp /= 10; }
        return sum == prod;
    }

    public static boolean isAutomorphic(int n) {
        long sq = 1L * n * n;
        String s = String.valueOf(n);
        String sqs = String.valueOf(sq);
        return sqs.endsWith(s);
    }

    public static boolean isBuzz(int n) {
        return (n % 7 == 0) || (Math.abs(n) % 10 == 7);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Prime? " + isPrime(n));
        System.out.println("Neon? " + isNeon(n));
        System.out.println("Spy? " + isSpy(n));
        System.out.println("Automorphic? " + isAutomorphic(n));
        System.out.println("Buzz? " + isBuzz(n));
    }
}
