import java.util.Random;
import java.util.Scanner;

public class MatrixOpsAdvance {
    public static double[][] randomMatrix(int n) {
        Random r = new Random();
        double[][] a = new double[n][n];
        for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) a[i][j] = r.nextInt(10);
        return a;
    }

    public static double[][] transpose(double[][] a) {
        int n = a.length, m = a[0].length;
        double[][] t = new double[m][n];
        for (int i = 0; i < n; i++) for (int j = 0; j < m; j++) t[j][i] = a[i][j];
        return t;
    }

    public static double det2(double[][] a) {
        return a[0][0]*a[1][1] - a[0][1]*a[1][0];
    }

    public static double det3(double[][] a) {
        double d = a[0][0]*(a[1][1]*a[2][2]-a[1][2]*a[2][1])
                 - a[0][1]*(a[1][0]*a[2][2]-a[1][2]*a[2][0])
                 + a[0][2]*(a[1][0]*a[2][1]-a[1][1]*a[2][0]);
        return d;
    }

    public static double[][] inverse2(double[][] a) {
        double det = det2(a);
        if (Math.abs(det) < 1e-9) return null;
        double[][] inv = new double[2][2];
        inv[0][0] = a[1][1]/det;
        inv[1][1] = a[0][0]/det;
        inv[0][1] = -a[0][1]/det;
        inv[1][0] = -a[1][0]/det;
        return inv;
    }

    public static double[][] cofactorMatrix3(double[][] a) {
        double[][] c = new double[3][3];
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                // minor
                double[][] minor = new double[2][2];
                int r1=0;
                for (int r=0;r<3;r++){
                    if (r==i) continue;
                    int c1=0;
                    for (int cc=0;cc<3;cc++){
                        if (cc==j) continue;
                        minor[r1][c1++] = a[r][cc];
                    }
                    r1++;
                }
                double mdet = det2(minor);
                c[i][j] = ((i+j)%2==0 ? 1 : -1) * mdet;
            }
        }
        return c;
    }

    public static double[][] inverse3(double[][] a) {
        double det = det3(a);
        if (Math.abs(det) < 1e-9) return null;
        double[][] cof = cofactorMatrix3(a);
        double[][] adj = transpose(cof);
        double[][] inv = new double[3][3];
        for (int i=0;i<3;i++) for (int j=0;j<3;j++) inv[i][j] = adj[i][j] / det;
        return inv;
    }

    public static void printMatrix(double[][] m) {
        for (double[] row : m) {
            for (double v : row) System.out.printf("%8.3f ", v);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Matrix size (2 or 3): ");
        int n = sc.nextInt();
        double[][] a = randomMatrix(n);
        System.out.println("Matrix A:");
        printMatrix(a);
        System.out.println("Transpose:");
        printMatrix(transpose(a));
        if (n == 2) {
            System.out.printf("Determinant (2x2): %.3f%n", det2(a));
            double[][] inv2 = inverse2(a);
            System.out.println("Inverse:");
            if (inv2 == null) System.out.println("Not invertible.");
            else printMatrix(inv2);
        } else if (n == 3) {
            System.out.printf("Determinant (3x3): %.3f%n", det3(a));
            double[][] inv3 = inverse3(a);
            System.out.println("Inverse:");
            if (inv3 == null) System.out.println("Not invertible.");
            else printMatrix(inv3);
        } else {
            System.out.println("Only 2x2 and 3x3 supported in this program.");
        }
    }
}
