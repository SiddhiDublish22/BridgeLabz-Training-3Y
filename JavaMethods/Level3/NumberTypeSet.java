import java.util.Scanner;

public class NumberTypeSet {
    public static int sumProperDivisors(int n) {
        if (n <= 1) return 0;
        int sum = 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) sum += n / i;
            }
        }
        return sum;
    }

    public static boolean isPerfect(int n) {
        return n > 0 && sumProperDivisors(n) == n;
    }

    public static boolean isAbundant(int n) {
        return n > 0 && sumProperDivisors(n) > n;
    }

    public static boolean isDeficient(int n) {
        return n > 0 && sumProperDivisors(n) < n;
    }

    public static int factorial(int x) {
        int f = 1;
        for (int i = 2; i <= x; i++) f *= i;
        return f;
    }

    public static boolean isStrong(int n) {
        int temp = Math.abs(n);
        int sum = 0;
        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Perfect? " + isPerfect(n));
        System.out.println("Abundant? " + isAbundant(n));
        System.out.println("Deficient? " + isDeficient(n));
        System.out.println("Strong? " + isStrong(n));
    }
}
