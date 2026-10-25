public class Leet_1254 {
    public static int closedIsland(int[][] grid) {
        int x = grid.length;
        int y = grid[0].length;
        int count = 0;

        boolean visited[][] = new boolean[x][y];

        for (int i = 1; i < x-1; i++) {
            for (int j = 1; j < y-1; j++) {
                if (grid[i][j] == 0 && !visited[i][j]) {
                    if (path_finder(grid, visited, i, j)) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public static boolean path_finder(int grid[][], boolean visited[][], int i, int j) {
        int x = grid.length;
        int y = grid[0].length;
        
        if(i >= x || j >= y || i < 0 || j < 0 ){
            return false;
        }

        if(visited[i][j] || grid[i][j] == 1){
            return true;
        }

        visited[i][j] = true;

        boolean top = path_finder(grid, visited, i-1, j); 
        boolean down = path_finder(grid, visited, i+1, j);
        boolean left = path_finder(grid, visited, i, j-1);
        boolean right = path_finder(grid, visited, i, j+1);

        return top && down && right && left;
    }

    public static void main(String[] args) {
        int[][] grid = { { 1, 1, 1, 1, 1, 1, 1, 0 },
                { 1, 0, 0, 0, 0, 1, 1, 0 },
                { 1, 0, 1, 0, 1, 1, 1, 0 },
                { 1, 0, 0, 0, 0, 1, 0, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 0 } };
        System.out.println(closedIsland(grid));
    }
}