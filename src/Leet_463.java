public class Leet_463 {
    public static int islandPerimeter(int[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    res += routers(grid, i, j);
                }
            }
        }
        return res;
    }

    public static int routers(int[][] grid, int i, int j) {
        int res = 0;

        // Up
        if (i == 0 || grid[i - 1][j] == 0) res++;
        // Down
        if (i == grid.length - 1 || grid[i + 1][j] == 0) res++;
        // Left
        if (j == 0 || grid[i][j - 1] == 0) res++;
        // Right
        if (j == grid[0].length - 1 || grid[i][j + 1] == 0) res++;

        return res;
    }

    public static void main(String args[]) {
        int arr[][] = {
            {0, 1, 0, 0},
            {1, 1, 1, 0},
            {0, 1, 0, 0},
            {1, 1, 0, 0}
        };
        System.out.println(islandPerimeter(arr)); // Expected output: 16
    }
}