
public class Leet_200 {

    public static int numIslands(char[][] grid) {
        int res = 0;
        boolean visited[][] = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (visited[i][j] == false && grid[i][j] == '1') {
                    res++;
                    directions(visited, grid, i, j);
                }
            }
        }
        return res;
    }

    public static void directions(boolean[][] visited, char[][] grid, int i, int j) {
        int rows = grid.length;
        int cols = grid[0].length;

        // Boundary and visited check
        if (i < 0 || j < 0 || i >= rows || j >= cols || grid[i][j] == '0' || visited[i][j]) {
            return;
        }
        if (visited[i][j] == true || grid[i][j] == '0') {
            return;
        }
        // Mark as visited
        visited[i][j] = true;

        // Explore all directions
        directions(visited, grid, i + 1, j); // down
        directions(visited, grid, i - 1, j); // up
        directions(visited, grid, i, j + 1); // right
        directions(visited, grid, i, j - 1); // left
    }

    public static void main(String[] args) {
        char[][] arr = {
                { '1', '1', '0', '0', '1' },
                { '1', '1', '0', '0', '1' },
                { '0', '0', '1', '0', '0' },
                { '0', '0', '0', '1', '1' } };
        // output 4
        System.out.println(numIslands(arr));
    }
}