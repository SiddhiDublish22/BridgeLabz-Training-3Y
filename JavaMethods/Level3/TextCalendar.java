import java.util.*;

public class TextCalendar {
    static final String[] MONTHS = {"January","February","March","April","May","June","July","August","September","October","November","December"};
    static boolean isLeap(int y){ return (y%400==0) || (y%4==0 && y%100!=0); }
    static int daysInMonth(int m, int y){
        int[] days = {31, (isLeap(y)?29:28),31,30,31,30,31,31,30,31,30,31};
        return days[m-1];
    }
    // Zeller's Congruence (0=Sunday..6=Saturday)
    static int firstDayOfMonth(int m, int y){
        int d=1;
        int mm = (m < 3) ? m + 12 : m;
        int yy = (m < 3) ? y - 1 : y;
        int K = yy % 100, J = yy / 100;
        int h = (d + (13*(mm+1))/5 + K + K/4 + J/4 + 5*J) % 7; // 0=Saturday..6=Friday
        int day = (h + 6) % 7; // convert to 0=Sunday..6=Saturday
        return day;
    }
    static void printCalendar(int m, int y){
        System.out.printf("%s %d%n", MONTHS[m-1], y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int first = firstDayOfMonth(m, y), dim = daysInMonth(m,y);
        for(int i=0;i<first;i++) System.out.print("    ");
        for(int d=1; d<=dim; d++){
            System.out.printf("%3d ", d);
            if ((first + d) % 7 == 0) System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): "); int m = sc.nextInt();
        System.out.print("Enter year: "); int y = sc.nextInt();
        printCalendar(m, y);
    }
}
