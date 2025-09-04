import java.util.Random;
import java.util.Locale;

public class EmployeeBonous {
    public static int[][] generateEmployees(int n) {
        Random r = new Random();
        int[][] arr = new int[n][2]; 
        for (int i = 0; i < n; i++) {
            arr[i][0] = 10000 + r.nextInt(90000); 
            arr[i][1] = r.nextInt(21); 
        }
        return arr;
    }

    public static double[][] calculateNewSalaryAndBonus(int[][] old) {
        int n = old.length;
        double[][] result = new double[n][2]; // 
        for (int i = 0; i < n; i++) {
            int sal = old[i][0], yrs = old[i][1];
            double rate = (yrs > 5) ? 0.05 : 0.02;
            double bonus = sal * rate;
            result[i][1] = bonus;
            result[i][0] = sal + bonus;
        }
        return result;
    }

    public static void displaySummary(int[][] old, double[][] updated) {
        double sumOld = 0, sumNew = 0, totalBonus = 0;
        System.out.println("Emp\tOldSal\tYears\tBonus\tNewSal");
        for (int i = 0; i < old.length; i++) {
            System.out.printf(Locale.US,"%d\t%d\t%d\t%.2f\t%.2f%n",
                i+1, old[i][0], old[i][1], updated[i][1], updated[i][0]);
            sumOld += old[i][0];
            sumNew += updated[i][0];
            totalBonus += updated[i][1];
        }
        System.out.println();
        System.out.printf(Locale.US,"Total\t%.2f\t\t%.2f\t%.2f%n", sumOld, totalBonus, sumNew);
    }

    public static void main(String[] args) {
        int[][] employees = generateEmployees(10);
        double[][] updated = calculateNewSalaryAndBonus(employees);
        displaySummary(employees, updated);
    }
}

