import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking radius as input
        System.out.print("Enter the radius of the cylinder: ");
        double radius = sc.nextDouble();

        // Taking height as input
        System.out.print("Enter the height of the cylinder: ");
        double height = sc.nextDouble();

        // Calculating volume
        double volume = Math.PI * radius * radius * height;

        // Displaying result
        System.out.println("Volume of the cylinder: " + volume);

        sc.close();
    }
}
