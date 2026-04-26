public class Leet_1559 {
    public static boolean[][] visited;
    public static int m, n;

    public static boolean containsCycle(char[][] grid) {
        m = grid.length;
        n = grid[0].length;
        visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j] && dfs(grid, i, j, -1, -1, grid[i][j])) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean dfs(char[][] grid, int i, int j, int pi, int pj, char target) {
        visited[i][j] = true;

        // Up
        int ni = i - 1;
        int nj = j;
        if (ni >= 0 && grid[ni][nj] == target && !(ni == pi && nj == pj)) {
            if (visited[ni][nj] || dfs(grid, ni, nj, i, j, target)) {
                return true;
            }
        }

        // Down
        ni = i + 1;
        nj = j;
        if (ni < m && grid[ni][nj] == target && !(ni == pi && nj == pj)) {
            if (visited[ni][nj] || dfs(grid, ni, nj, i, j, target)) {
                return true;
            }
        }

        // Left
        ni = i;
        nj = j - 1;
        if (nj >= 0 && grid[ni][nj] == target && !(ni == pi && nj == pj)) {
            if (visited[ni][nj] || dfs(grid, ni, nj, i, j, target)) {
                return true;
            }
        }

        // Right
        ni = i;
        nj = j + 1;
        if (nj < n && grid[ni][nj] == target && !(ni == pi && nj == pj)) {
            if (visited[ni][nj] || dfs(grid, ni, nj, i, j, target)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        char[][] grid = { { 'a', 'a', 'a', 'a' },
                { 'a', 'b', 'b', 'a' },
                { 'a', 'b', 'b', 'a' },
                { 'a', 'a', 'a', 'a' } };
        System.out.println(containsCycle(grid) ? "T" : "F");
    }
}
