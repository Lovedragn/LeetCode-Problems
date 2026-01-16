public class Leet_2373 {
    public static int[][] largestLocal(int[][] grid) {
        int res[][] = new int[grid.length - 2][grid[0].length - 2];

        for (int k1 = 0; k1 < res.length; k1++) {
            for (int k2 = 0; k2 < res[0].length; k2++) {
                int max = 0;
                for (int i = k1; i < k1 + 3; i++) {
                    for (int j = k2; j < k2 + 3; j++) {
                        max = Math.max(max, grid[i][j]);
                    }
                }
                res[k1][k2] = max;
            }
        }

        return res;
    }

    public static void main(String args[]) {
        int[][] grid = { { 9, 9, 8, 1 }, { 5, 6, 2, 6 }, { 8, 2, 6, 4 }, { 6, 2, 2, 2 } };

        int res[][] = largestLocal(grid);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
