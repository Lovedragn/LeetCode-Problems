public class Leet_3212 {
    public static int numberOfSubmatrices(char[][] grid) {
        int res = 0;
        int temp[][][] = new int[grid.length][grid[0].length][2];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 'X') {
                    temp[i][j][0]++;
                }
                if (grid[i][j] == 'Y') {
                    temp[i][j][1]++;
                }
                if (i > 0) {
                    temp[i][j][0] += temp[i - 1][j][0];
                    temp[i][j][1] += temp[i - 1][j][1];
                }
                if (j > 0) {
                    temp[i][j][0] += temp[i][j - 1][0];
                    temp[i][j][1] += temp[i][j - 1][1];
                }

                if (i > 0 && j > 0) {
                    temp[i][j][0] -= temp[i - 1][j - 1][0];
                    temp[i][j][1] -= temp[i - 1][j - 1][1];
                }
                if (temp[i][j][0] == temp[i][j][1] && temp[i][j][0] > 0) {
                    res++;
                }
            }
        }
        return res;

    }

    public static void main(String[] args) {
        char arr[][] = { { 'X', 'Y', '.' },
                { 'Y', 'X', '.' },
                { '.', '.', '.' } };
        // [[1,0,0],[1,1,0],[1,1,1]],
        // [[1,1,0],[2,2,0],[2,2,2]]
        // [[1,1,1],[2,2,2],[2,2,5]]
        System.out.println(numberOfSubmatrices(arr));
    }
}
