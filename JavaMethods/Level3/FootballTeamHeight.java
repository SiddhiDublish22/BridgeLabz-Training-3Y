import java.util.Random;

public class FootballTeamHeight {

    // Method to find sum
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }

    // Method to find mean
    public static double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    // Method to find shortest
    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            if (h < min) {
                min = h;
            }
        }
        return min;
    }

    // Method to find tallest
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            if (h > max) {
                max = h;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();

        // Assign random heights between 150 and 250
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150; // 150 to 250
        }

        // Display all players' heights
        System.out.print("Players' Heights: ");
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println();

        // Display results
        System.out.println("Shortest Height: " + findShortest(heights) + " cm");
        System.out.println("Tallest Height: " + findTallest(heights) + " cm");
        System.out.println("Mean Height: " + String.format("%.2f", findMean(heights)) + " cm");
    }
}
