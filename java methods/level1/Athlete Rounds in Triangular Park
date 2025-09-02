import java.util.Scanner;

public class TriangularParkRun {
    public static int calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double distance = 5000; // 5 km in meters
        return (int) Math.ceil(distance / perimeter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1: ");
        double s1 = sc.nextDouble();
        System.out.print("Enter side 2: ");
        double s2 = sc.nextDouble();
        System.out.print("Enter side 3: ");
        double s3 = sc.nextDouble();

        int rounds = calculateRounds(s1, s2, s3);
        System.out.println("The athlete must complete " + rounds + " rounds.");
    }
}
