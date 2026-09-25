import java.util.Arrays;

public class Leet_2500 {
    public static int deleteGreatestValue(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int res = 0;

        // Sort each row
        for (int i = 0; i < m; i++) {
            Arrays.sort(grid[i]);
        }

        // For each column from right to left
        for (int col = n - 1; col >= 0; col--) {
            int maxVal = 0;
            for (int row = 0; row < m; row++) {
                maxVal = Math.max(maxVal, grid[row][col]);
            }
            res += maxVal;
        }

        return res;
    }

    public static void main(String[] args) {
        int[][] arr = { {1, 2, 4}, {3, 3, 1} };
        System.out.println(deleteGreatestValue(arr)); // Output: 8
    }
}
