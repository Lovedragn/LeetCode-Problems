import java.util.*;
public class Leet_3567{
 public static int[][] minAbsDiff(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int[][] ans = new int[m - k + 1][n - k + 1];
        int[] temp = new int[k * k];

        for (int i = 0; i <= m - k; i++) {
            for (int j = 0; j <= n - k; j++) {
                // Step 1: Fill temp array
                int idx = 0;
                for (int r = i; r < i + k; r++) {
                    for (int c = j; c < j + k; c++) {
                        temp[idx++] = grid[r][c];
                    }
                }

                // Special case: k == 1 → only one element
                if (k == 1) {
                    ans[i][j] = 0;
                    continue;
                }

                // Step 2: Sort
                Arrays.sort(temp, 0, k * k);

                // Step 3: Find min consecutive difference (skip duplicates)
                int minDiff = Integer.MAX_VALUE;
                for (int x = 1; x < k * k; x++) {
                    if (temp[x] != temp[x - 1]) { // ensure distinct
                        minDiff = Math.min(minDiff, temp[x] - temp[x - 1]);
                    }
                }

                // Step 4: Store result
                ans[i][j] = (minDiff == Integer.MAX_VALUE ? 0 : minDiff);
            }
        }
        return ans;
    }


    // Quick test
    public static void main(String[] args) {
        int[][] grid = {
            {1, 8},
            {3, -2}
        };
        int k = 2;

        int[][] result = minAbsDiff(grid, k);
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
        // Expected output: [2]
    }
}
