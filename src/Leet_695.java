import java.util.HashSet;
public class Leet_695{
       public static int maxAreaOfIsland(int[][] grid) {
        if (grid.length == 0) {
            return 0;
        }
        int maxs = 0;
        HashSet<String> visited = new HashSet<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (!visited.contains(i + " " + j) && grid[i][j] == 1) {
                    maxs = Math.max(directions(grid, visited, i, j, maxs), maxs);
                }
            }
        }
        return maxs;
    }

    public static int directions(int[][] grid, HashSet<String> visited, int i, int j, int max) {
        if (i >= grid.length || j >= grid[0].length || i < 0 || j < 0 || visited.contains(i+" "+j) || grid[i][j] == 0 ) {
            return 0;
        }

        visited.add(i+" "+j);

        return (1 +
                directions(grid, visited, i + 1, j, max) +
                directions(grid, visited, i - 1, j, max) +
                directions(grid, visited, i, j + 1, max) +
                directions(grid, visited, i, j - 1, max));
    }

     public static void main(String[] args) {
        int[][] grid = {
            {0, 0, 1, 0, 0},
            {1, 1, 1, 0, 0},
            {0, 0, 0, 1, 1},
            {1, 1, 1, 1, 0},
            {0, 0, 0, 0, 0}
        };
        System.out.println(maxAreaOfIsland(grid)); // Output: 6
    }
}