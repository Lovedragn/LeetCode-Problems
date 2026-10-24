import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet_2409 {
    public static int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int start = Math.max(getDays(arriveAlice), getDays(arriveBob));
        int end = Math.min(getDays(leaveAlice), getDays(leaveBob));

        return Math.max(0,end-start+1);
    }

    private static int getDays(String s) {
        int day = Integer.parseInt(s.substring(3, 5));
        int month = Integer.parseInt(s.substring(0, 2));

        int days[] = { 31, 28, 31, 30, 31, 30,
                       31, 31, 30, 31, 30, 31 };

        for (int i = 0; i < month-1; i++) {
            day += days[i];
        }

        return day;
    }

    public static void main(String[] args) {
        System.out.println(countDaysTogether("08-15", "08-18", "08-16", "08-19"));
    }
}
