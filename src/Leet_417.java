import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet_417 {
    public static boolean[][] pacific, atlantic;
    public static List<List<Integer>> res;
    public static int m, n;

    public static List<List<Integer>> pacificAtlantic(int[][] heights) {
        res = new ArrayList<>();
        m = heights.length;
        n = heights[0].length;

        pacific = new boolean[m][n];
        atlantic = new boolean[m][n];

        // pacific left col , atlantic right
        for (int i = 0; i < m; i++) {
            dfs(i, 0, pacific, heights);
            dfs(i, n - 1, atlantic, heights);
        }

        // pacific top , atlantic bottom
        for (int i = 0; i < n; i++) {
            dfs(0, i, pacific, heights);
            dfs(m - 1, i, atlantic, heights);
        }

        for (int i = 0; i < heights.length; i++) {
            for (int j = 0; j < heights[0].length; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    res.add(Arrays.asList(i, j));
                }
            }
        }

        return res;
    }

    public static void dfs(int r, int c, boolean[][] visited, int[][] arr) {
        if (r < 0 || r >= m || c < 0 || c >= n)
            return;

        // 2. Already visited
        if (visited[r][c])
            return;

        // 3. Mark as visited
        visited[r][c] = true;
        if (r + 1 < m && arr[r + 1][c] >= arr[r][c]) {
            dfs(r + 1, c, visited, arr);
        }
        if (r - 1 >= 0 && arr[r - 1][c] >= arr[r][c]) {
            dfs(r - 1, c, visited, arr);
        }
        if (c + 1 < n && arr[r][c + 1] >= arr[r][c]) {
            dfs(r, c + 1, visited, arr);
        }
        if (c - 1 >= 0 && arr[r][c - 1] >= arr[r][c]) {
            dfs(r, c - 1, visited, arr);
        }
    }

    public static void main(String args[]) {
        int arr[][] = { { 1, 2, 2, 3, 5 },
                { 3, 2, 3, 4, 4 },
                { 2, 4, 5, 3, 1 },
                { 6, 7, 1, 4, 5 },
                { 5, 1, 1, 2, 4 } };
        System.out.println(pacificAtlantic(arr));
    }
}