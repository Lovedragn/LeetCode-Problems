public class Contest_524_Q2 {
    public static int[] lastVisitedCell(char[][] grid) {

        int x = 0;
        int y = 0;
        
        int lastx =0;
        int lasty =0;
        while (true) {
            if (x >= grid.length  || y >= grid[0].length || x < 0 || y < 0 || grid[x][y] == '.') {
                break;
            }
            
            lastx = x;
            lasty = y;
            char c = grid[x][y];
            

            grid[x][y] = '.';
            // left
            switch (c) {
                case 'L':
                    y--;
                    break;
                case 'R':
                    y++;
                    break;
                case 'U':
                    x--;
                    break;
                case 'D':
                    x++;
                    break;
                default: {
                    return new int[]{lastx,lasty};
                }
            }

        }
        return new int[]{lastx,lasty};
    }

    public static void main(String[] args) {
        char[][] arr = { { 'R', 'D' }};
        System.out.println(lastVisitedCell(arr)[1]);
    }
}
