import java.util.Random;
import java.util.Scanner;

public class MatrixOpsBasic {
    public static int[][] randomMatrix(int r, int c) {
        Random rgen = new Random();
        int[][] a = new int[r][c];
        for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) a[i][j] = rgen.nextInt(10);
        return a;
    }

    public static int[][] add(int[][] a, int[][] b) {
        int r = a.length, c = a[0].length;
        int[][] s = new int[r][c];
        for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) s[i][j] = a[i][j] + b[i][j];
        return s;
    }

    public static int[][] subtract(int[][] a, int[][] b) {
        int r = a.length, c = a[0].length;
        int[][] s = new int[r][c];
        for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) s[i][j] = a[i][j] - b[i][j];
        return s;
    }

    public static int[][] multiply(int[][] a, int[][] b) {
        int r = a.length, c = b[0].length, m = b.length;
        int[][] prod = new int[r][c];
        for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) {
            int sum = 0;
            for (int k = 0; k < m; k++) sum += a[i][k] * b[k][j];
            prod[i][j] = sum;
        }
        return prod;
    }

    public static void printMatrix(int[][] m) {
        for (int[] row : m) {
            for (int v : row) System.out.print(v + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows for A: "); int r = sc.nextInt();
        System.out.print("Cols for A (and Rows for B): "); int m = sc.nextInt();
        System.out.print("Cols for B: "); int c = sc.nextInt();
        int[][] A = randomMatrix(r, m);
        int[][] B = randomMatrix(m, c);
        System.out.println("A:"); printMatrix(A);
        System.out.println("B:"); printMatrix(B);
        System.out.println("A+B (only if same dims):");
        if (r == m && m == c) System.out.println("Same dims edge case; use square dims if needed.");
        // Addition and subtraction valid only if same dims:
        if (A.length == B.length && A[0].length == B[0].length) {
            System.out.println("A + B:");
            printMatrix(add(A, B));
            System.out.println("A - B:");
            printMatrix(subtract(A, B));
        } else System.out.println("Skipping add/sub: dimensions mismatch.");
        System.out.println("A * B:");
        printMatrix(multiply(A, B));
    }
}

