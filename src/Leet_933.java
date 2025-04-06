import java.util.*;

public class Leet_933 {

    public static Queue<Integer> q;

    public static void RecentCounter() {
        q = new ArrayDeque<>();
    }

    public static int ping(int t) {
        q.add(t);
        while (q.peek() < (t - 3000)) { // 3002 2  1 < -2999
            q.poll();
        }
        return q.size();

    }

    public static void main(String args[]) {
        RecentCounter();
        ping(642);
        ping(1849);
        ping(4921);
        ping(5936);
        System.out.println(ping(5957));
    }
}
