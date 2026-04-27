import java.util.HashMap;
import java.util.List;

public class Leet_1391 {

    public static HashMap<Integer, List<Character>> range;
    public static boolean[][] visited;

    public static boolean hasValidPath(int[][] grid) {

        range = new HashMap<>();

        // [enterFrom , exit1 , exit2]
        range.put(1, List.of('l', 'r', 'l')); // left-right
        range.put(2, List.of('t', 'd', 't')); // top-down
        range.put(3, List.of('l', 'd', 't')); // left-top
        range.put(4, List.of('r', 'd', 't')); // right-top
        range.put(5, List.of('t', 'l', 'r')); // top-left
        range.put(6, List.of('t', 'r', 'l')); // top-right

        visited = new boolean[grid.length][grid[0].length];

        return router(grid, 0, 0, 's');
    }

    public static boolean isValid(char prev, int type) {

        List<Character> temp = range.get(type);

        return temp.contains(prev);
    }

    public static boolean router(int[][] grid, int i, int j, char prev) {

        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) {
            return false;
        }

        if (visited[i][j]) {
            return false;
        }

        // check whether current block accepts previous direction
        if (prev != 's' && !isValid(prev, grid[i][j])) {
            return false;
        }

        if (i == grid.length - 1 && j == grid[0].length - 1) {
            return true;
        }

        visited[i][j] = true;

        int type = grid[i][j];

        boolean T = false, D = false, L = false, R = false;

        // type 1 -> left right
        if (type == 1) {
            L = router(grid, i, j - 1, 'r');
            R = router(grid, i, j + 1, 'l');
        }

        // type 2 -> top down
        else if (type == 2) {
            T = router(grid, i - 1, j, 'd');
            D = router(grid, i + 1, j, 't');
        }

        // type 3 -> left down
        else if (type == 3) {
            L = router(grid, i, j - 1, 'r');
            D = router(grid, i + 1, j, 't');
        }

        // type 4 -> right down
        else if (type == 4) {
            R = router(grid, i, j + 1, 'l');
            D = router(grid, i + 1, j, 't');
        }

        // type 5 -> left top
        else if (type == 5) {
            L = router(grid, i, j - 1, 'r');
            T = router(grid, i - 1, j, 'd');
        }

        // type 6 -> right top
        else if (type == 6) {
            R = router(grid, i, j + 1, 'l');
            T = router(grid, i - 1, j, 'd');
        }

        return (T || D || L || R);
    }

    public static void main(String[] args) {

        int grid[][] = {
                {2, 4, 3},
                {6, 5, 2}
        };

        System.out.println(hasValidPath(grid) ? "T" : "F");
    }
}