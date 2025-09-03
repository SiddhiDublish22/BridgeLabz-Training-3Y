// package BridgeLabz-Training-3Y.27-08-25;
import java.util.*;
public class ATMtransaction {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int []arr = new int[n];
		int balance = 0;
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();		
			
		}
		
		for(int i=0; i<n; i++) {
				balance += arr[i];
		}
		if(balance < 0) {
			System.out.println("Overdraft!");
		}
		else {
			System.out.println(balance);
		}
	}
}
