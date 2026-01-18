public class Leet_1895 {

    public static int largestMagicSquare(int[][] grid) {
        int m = grid.length, n = grid[0].length;

        // Try biggest possible square first
        for (int size = Math.min(m, n); size >= 2; size--) {//4
            // Top-left corner of square
            for (int r = 0; r + size <= m; r++) {
                for (int c = 0; c + size <= n; c++) {
                    if (isMagic(grid, r, c, size)) {
                        return size; // Found largest magic square
                    }
                }
            }
        }
        return 1; // At least 1x1 is always magic
    }

    // Check if subgrid starting at (r,c) with side length 'size' is magic
    private static boolean isMagic(int[][] grid, int r, int c, int size) {
        int target = 0;
        // First row sum = target
        for (int j = c; j < c + size; j++)
            target += grid[r][j];

        // Check all rows
        for (int i = r; i < r + size; i++) {
            int sum = 0;
            for (int j = c; j < c + size; j++)
                sum += grid[i][j];
            if (sum != target)
                return false;
        }

        // Check all columns
        for (int j = c; j < c + size; j++) {
            int sum = 0;
            for (int i = r; i < r + size; i++)
                sum += grid[i][j];
            if (sum != target)
                return false;
        }

        // Check diagonals
        int d1 = 0, d2 = 0;
        for (int i = 0; i < size; i++) {
            d1 += grid[r + i][c + i]; // left-to-right diagonal
            d2 += grid[r + i][c + size - 1 - i]; // right-to-left diagonal
        }
        return d1 == target && d2 == target;
    }

    public static void main(String args[]) {
        int[][] grid = { { 7, 1, 4, 5, 6 },
                { 2, 5, 1, 6, 4 },
                { 1, 5, 4, 3, 2 },
                { 1, 2, 7, 3, 4 } };
        System.out.println(largestMagicSquare(grid));
    }
}
