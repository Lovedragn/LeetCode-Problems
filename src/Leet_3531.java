import java.util.*;

public class Leet_3531 {
    public static int countCoveredBuildings(int n, int[][] buildings) {
        int res = 0;

        int[] max_row = new int[n + 1];
        int[] min_row = new int[n + 1];
        int[] max_col = new int[n + 1];
        int[] min_col = new int[n + 1];

        Arrays.fill(min_row, n + 1);
        Arrays.fill(min_col, n + 1);

        for (int[] b : buildings) {
            int x = b[0];// 1
            int y = b[1];// 2

            max_row[y] = Math.max(max_row[y], x);
            min_row[y] = Math.min(min_row[y], x);
            max_col[x] = Math.max(max_col[x], y);
            min_col[x] = Math.min(min_col[x], y);

        }

        for (int[] b : buildings) {
            int x = b[0];// 1
            int y = b[1];// 2

            if (x > min_row[y] && x < max_row[y] && 
                y < max_col[x] && y > min_col[x]) {
                res++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] buildings = { { 1, 2 }, { 2, 2 }, { 3, 2 }, { 2, 1 }, { 2, 3 } };
        System.out.println(countCoveredBuildings(n, buildings)); // Output: 1
    }
}