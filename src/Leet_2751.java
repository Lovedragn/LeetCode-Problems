import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class Leet_2751 {
    public static List<Integer> survivedRobotsHealths(int[] pos, int[] h, String d) {

        int n = pos.length;
        Integer[] order = new Integer[n];
        for (int i = 0; i < n; i++)
            order[i] = i;

        Arrays.sort(order, (a, b) -> pos[a] - pos[b]);
        boolean[] alive = new boolean[n];
        Arrays.fill(alive, true);

        Deque<Integer> st = new ArrayDeque<>();

        for (int idx : order) {

            if (d.charAt(idx) == 'R')
                st.push(idx);

            else {
                while (!st.isEmpty()) {

                    int top = st.peek();

                    if (h[top] < h[idx]) {
                        alive[top] = false;
                        st.pop();
                        h[idx]--;
                    } else if (h[top] > h[idx]) {
                        alive[idx] = false;
                        h[top]--;
                        break;
                    } else {
                        alive[top] = false;
                        alive[idx] = false;
                        st.pop();
                        break;
                    }
                }
            }
        }

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++)
            if (alive[i])
                res.add(h[i]);

        return res;
    }//2,0

    public static void main(String[] args) {
        int[] positions = { 3, 5, 2, 6 };
        int[] healths = { 10, 10, 15, 12 };
        String directions = "RLRL";

        System.out.println(survivedRobotsHealths(positions, healths, directions));
    }
}