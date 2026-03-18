public class Leet_3070 {
    public static int countSubmatrices(int[][] grid, int k) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i > 0) {
                    grid[i][j] += grid[i - 1][j];
                }
                if (j > 0) {
                    grid[i][j] += grid[i][j - 1];
                }
                if (i > 0 && j > 0) {
                    grid[i][j] -= grid[i - 1][j - 1];
                }

                if (grid[i][j] <= k) {
                    res++;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[][] = { { 7, 2, 9 },
                { 1, 5, 0 },
                { 2, 6, 6 } };
        int k = 20;
        System.out.println(countSubmatrices(arr, k));
    }
}