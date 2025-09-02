import java.util.*;
public class FitnessCenterMembershipSystem {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    boolean continueRegistration = true;

    // Do-while → Ensure at least one registration happens
    do {
        System.out.println("Enter number of members to register: ");
        int numMembers = sc.nextInt();

        // For loop → Register multiple members
        for (int i = 1; i <= numMembers; i++) {
            System.out.println("\nRegistering Member " + i);

            System.out.println("Select Membership Type:");
            System.out.println("1. Monthly (₹1000)");
            System.out.println("2. Quarterly (₹2500)"); 
            System.out.println("3. Yearly (₹9000)");
            int choice = sc.nextInt();

            int fee = 0;

            // Switch-case → Membership selection
            switch (choice) {
                case 1:
                fee = 1000;
                break;
                case 2:
                    fee = 2500;
                    break;
                case 3:
                    fee = 9000;
                    break;
                default:
                    System.out.println("Invalid choice! Defaulting to Monthly.");
                    fee = 1000;
            }

            // If-else → Apply discount
            System.out.println("Is the member a Student (S) or Senior Citizen (C)? Enter Y/N:");
            char discountChoice = sc.next().charAt(0);
            if (discountChoice == 'Y' || discountChoice == 'y') {
                System.out.println("Applying 20% discount...");
                fee = fee - (fee * 20 / 100);
            }

            System.out.println("Final Fee for Member " + i + ": ₹" + fee);
        }

        // While loop → Continue registering until admin exits
        System.out.println("\nDo you want to register more members? (Y/N): ");
        char adminChoice = sc.next().charAt(0);

        if (adminChoice == 'N' || adminChoice == 'n') {
            continueRegistration = false;
            System.out.println("Registration Closed.");
        }

    } while (continueRegistration);

    sc.close();
}


}
