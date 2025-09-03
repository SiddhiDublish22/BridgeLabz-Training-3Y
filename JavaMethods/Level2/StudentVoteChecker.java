import java.util.Scanner;

public class StudentVoteChecker {
    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // invalid age
        } else if (age >= 18) {
            return true; // eligible
        } else {
            return false; // underage
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentVoteChecker svc = new StudentVoteChecker();

        int[] ages = new int[10];
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
            boolean eligible = svc.canStudentVote(ages[i]);
            if (eligible) {
                System.out.println("Student " + (i + 1) + " CAN vote.");
            } else {
                System.out.println("Student " + (i + 1) + " CANNOT vote.");
            }
        }
    }
}

