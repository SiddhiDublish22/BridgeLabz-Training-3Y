
import java.util.*;

public class CricketScoreAnalyzer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of runs scored by batsman:- ");
		int n = sc.nextInt();
		
		System.out.println("Enter the scores:- ");
		int []arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int highestScore = arr[0];
		int lowestScore = arr[0];
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			
			if(arr[i] >=100) {
				System.out.println("Century Score");
			}
			
			sum += arr[i];
			if(arr[i]> highestScore) {
				highestScore = arr[i];
			}
			else if(arr[i]<lowestScore) {
				lowestScore = arr[i];
			}
		}
		
		
		int averageScore = sum / n;
		System.out.println("Highest Score = " + highestScore);
		System.out.println("Lowest Score = " +lowestScore);
		System.out.println("Average Score = " +averageScore);
	}
}