import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking Principal as input
        System.out.print("Enter Principal amount: ");
        double principal = sc.nextDouble();

        // Taking Rate of Interest as input
        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        // Taking Time (in years) as input
        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        // Calculating Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Displaying result
        System.out.println("Simple Interest: " + simpleInterest);

        sc.close();
    }
}
