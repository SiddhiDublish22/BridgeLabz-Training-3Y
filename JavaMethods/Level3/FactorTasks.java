import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FactorTasks {
    public static int[] factorsArray(int n) {
        if (n == 0) return new int[]{0};
        n = Math.abs(n);
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
                if (i != n / i) list.add(n / i);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int greatestFactor(int[] factors) {
        int g = Integer.MIN_VALUE;
        for (int f : factors) if (f > g) g = f;
        return g;
    }

    public static long sumFactors(int[] factors) {
        long s = 0;
        for (int f : factors) s += f;
        return s;
    }

    public static long productFactors(int[] factors) {
        long p = 1;
        for (int f : factors) p *= f;
        return p;
    }

    public static double productCubes(int[] factors) {
        double p = 1.0;
        for (int f : factors) p *= Math.pow(f, 3);
        return p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int[] facs = factorsArray(n);
        System.out.println("Factors: ");
        for (int f : facs) System.out.print(f + " ");
        System.out.println();
        System.out.println("Greatest factor: " + greatestFactor(facs));
        System.out.println("Sum of factors: " + sumFactors(facs));
        System.out.println("Product of factors: " + productFactors(facs));
        System.out.println("Product of cubes of factors: " + productCubes(facs));
    }
}

