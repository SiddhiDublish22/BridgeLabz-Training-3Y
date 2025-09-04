import java.util.*;

public class StudentScoreCard {
    static int[][] generatePCM(int n){
        Random r = new Random();
        int[][] a = new int[n][3];
        for(int i=0;i<n;i++) for(int j=0;j<3;j++) a[i][j] = 10 + r.nextInt(90); // 2-digit scores
        return a;
    }
    static double round2(double v){ return Math.round(v * 100.0) / 100.0; }
    static double[][] totalsAvgPct(int[][] pcm){
        int n = pcm.length;
        double[][] out = new double[n][3]; // total, average, percentage
        for(int i=0;i<n;i++){
            int total = pcm[i][0] + pcm[i][1] + pcm[i][2];
            double avg = total / 3.0;
            double pct = (total / 300.0) * 100.0;
            out[i][0]=round2(total); out[i][1]=round2(avg); out[i][2]=round2(pct);
        }
        return out;
    }
    static void display(int[][] pcm, double[][] stats){
        System.out.println("ID\tPhy\tChem\tMath\tTotal\tAvg\t%\t");
        for(int i=0;i<pcm.length;i++){
            System.out.printf("%02d\t%d\t%d\t%d\t%.2f\t%.2f\t%.2f%n",
                i+1, pcm[i][0], pcm[i][1], pcm[i][2],
                stats[i][0], stats[i][1], stats[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of students: "); int n = sc.nextInt();
        int[][] pcm = generatePCM(n);
        double[][] stats = totalsAvgPct(pcm);
        display(pcm, stats);
    }
}
