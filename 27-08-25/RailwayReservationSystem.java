package BridgeLabz;

import java.util.*;

public class RailwayReservationSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your train no:- ");
		int yourTrain = sc.nextInt();
		int fare= 0;
		
		switch(yourTrain) {
		case 1: System.out.println("trainName = Kalinga Express " + " fare = 200");
		break;
		case 2: System.out.println("trainName = RajyaRani Express " + " fare = 300");
			fare = 500;
		break;
		case 3: System.out.println("trainName = Shatabdi Express" + "fare = 800");
		break;
		case 4: System.out.println("trainName = Vande Bharat Express" + "fare = 1000");
		break;
		}
		
		int n=0;
		for(int i=0; i<n; i++) {
			
		}
	}
}
