
import java.util.*;

public class RailwayReservationSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int seats = 5;   
        int booked = 0;            
        int waiting = 0;
		
		 System.out.println("Choose Train:");
        System.out.println("1. Express (Fare 500)");
        System.out.println("2. Superfast (Fare 800)");
        System.out.println("3. Local (Fare 300)");
		
		System.out.println("Enter your train no:- ");
		int yourTrain = sc.nextInt();
		int fare= 0;
		
		switch (yourTrain) {
            case 1: fare = 500; break;
            case 2: fare = 800; break;
            case 3: fare = 300; break;
            default: 
                System.out.println("Invalid! Default Local Train chosen.");
                fare = 300;
        }
		
		
		 do {
            System.out.print("Enter number of passengers: ");
            int n = sc.nextInt();

        
            for (int i = 1; i <= n; i++) {
                if (booked < seats) {    
                    booked++;
                    System.out.println("Passenger " + i + " → Seat Confirmed | Fare: " + fare);
                } else {                  
                    waiting++;
                    System.out.println("Passenger " + i + " → Waiting List");
                }
            }

           
            if (booked >= seats) {
                System.out.println("All seats are booked! No more booking.");
                break;
            }

            System.out.print("Do you want to book more? (yes/no): ");
            String ans = sc.next();
            if (ans.equalsIgnoreCase("no")) break;

        } while (true);

       
        System.out.println("\n--- Booking Summary ---");
        System.out.println("Seats booked: " + booked);
        System.out.println("Waiting list: " + waiting);
        System.out.println("Total collection: " + (booked * fare));

		
	}
}
