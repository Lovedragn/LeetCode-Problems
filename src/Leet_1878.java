import java.util.Collections;
import java.util.TreeSet;

public class Leet_1878 {
    public static TreeSet<Integer> set;

    public static int[] getBiggestThree(int[][] grid) {
        set = new TreeSet<>(Collections.reverseOrder());
        if (grid.length < 3 || grid[0].length < 3) {
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    append(grid[i][j]);
                }
            }
            int[] res = new int[set.size()];
            for (int i = 0; i < res.length; i++) {
                res[i] = set.pollFirst();
            }
            return res;
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int max_loop = checker(grid, i, j);
                rombus_formation(grid, i, j, max_loop);
                append(grid[i][j]);
            }
        }

        int[] res = new int[set.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = set.pollFirst();
        }
        return res;
    }

    private static void rombus_formation(int[][] grid, int i, int j, int max_loop) {
        for (int k = 1; k <= max_loop; k++) {
            int sum = 0;
            for (int t = 0; t < k
                ; t++) {
                // left - up
                sum += grid[i - t][j -k + t];
                // up - right
                sum += grid[i - k + t][j + t];
                // right - down
                sum += grid[i + t][j + k - t];
                // down - left
                sum += grid[i + k - t][j - t];
            }
            append(sum);
        }
    }

    public static void append(int val) {
        set.add(val);
        if (set.size() > 3) {
            set.pollLast();
        }
    }

    public static int checker(int[][] grid, int i, int j) {
        int max = 1;
        while (true) {
            if (i - max < 0 || j - max < 0 || i + max >= grid.length || j + max >= grid[0].length) {
                max--;
                break;
            }
            max++;
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[][] = { {20,17,9,13,5,2,9,1,5},{14,9,9,9,16,18,3,4,12},{18,15,10,20,19,20,15,12,11},{19,16,19,18,8,13,15,14,11},{4,19,5,2,19,17,7,2,2} };
        int result[] = getBiggestThree(arr);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
