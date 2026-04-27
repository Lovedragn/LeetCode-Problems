import java.util.HashMap;
import java.util.List;

public class Leet_1391 {
    public static HashMap<Integer, List<Character>> range;
    public static boolean[][] visited;

    public static boolean hasValidPath(int[][] grid) {
        range = new HashMap<>();
        range.put(1, List.of('l', 'r', 'l'));
        range.put(2, List.of('t', 'd', 't'));
        range.put(3, List.of('l', 'd', 't'));
        range.put(4, List.of('r', 'd', 't'));
        range.put(5, List.of('t', 'l', 'r'));
        range.put(6, List.of('t', 'r', 'l'));

        visited = new boolean[grid.length][grid[0].length];

        boolean res = router(grid, 0, 0, range.get(grid[0][0]).getLast());
        return res;
    }

    public static boolean router(int[][] grid, int i, int j, char prev) {
        if (i == grid.length - 1 && j == grid[0].length - 1) {
            return true;
        }
        if (visited[i][j]) {
            return false;
        }
        visited[i][j] = true;

        boolean T = false, D=false, L=false, R=false;
        // top
        if (i - 1 >= 0 && i - 1 < grid.length && range.get(grid[i - 1][j]).getFirst().equals(prev)) {
            T = router(grid, i - 1, j, range.get(grid[i - 1][j]).getLast());
        }
        // Down
        if (i + 1 >= 0 && i + 1 < grid.length && range.get(grid[i + 1][j]).getFirst().equals(prev)) {
            D = router(grid, i + 1, j, range.get(grid[i + 1][j]).getLast());
        }
        // Left
        if (j -1 >= 0 && j < grid[0].length && range.get(grid[i][j - 1]).getFirst().equals(prev)) {
            L = router(grid, i, j - 1, range.get(grid[i][j - 1]).getLast());
        }
        // Right
        if (j + 1 >= 0 && j + 1 < grid[0].length && range.get(grid[i][j+1]).getFirst().equals(prev)) {
            R = router(grid, i, j + 1, range.get(grid[i][j + 1]).getLast());
        }
        return (T || D || L || R);
    }

    public static void main(String[] args) {
        int grid[][] = { { 2, 4, 3 }, { 6, 5, 2 } };
        System.out.println(hasValidPath(grid) ? "T" : "F");
    }
}
