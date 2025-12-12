public class Leet_329 {

    public static int[][] LTS;

    public static int longestIncreasingPath(int[][] matrix) {
        LTS = new int[matrix.length][matrix[0].length];
        int res = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                res = Math.max(res, dfs(matrix, i, j));
            }
        }

        return res;
    }

    public static int dfs(int[][] matrix, int i, int j) {
        if (LTS[i][j] != 0) {
            return LTS[i][j];
        }
        int maxlen = 1;
        // top
        if (i > 0 && matrix[i - 1][j] > matrix[i][j]) {
            maxlen = Math.max(maxlen, dfs(matrix, i - 1, j) + 1);
        }
        // bottom
        if (i < matrix.length - 1 && matrix[i + 1][j] > matrix[i][j]) {
            maxlen = Math.max(maxlen, dfs(matrix, i + 1, j) + 1);
        }
        // left
        if (j > 0 && matrix[i][j - 1] > matrix[i][j]) {
            maxlen = Math.max(maxlen, 1 + dfs(matrix, i, j - 1));
        }
        // right
        if (j < matrix[0].length - 1 && matrix[i][j + 1] > matrix[i][j]) {
            maxlen = Math.max(maxlen, 1 + dfs(matrix, i, j + 1));
        }
        LTS[i][j] = maxlen;
        return maxlen;
    }

    public static void main(String args[]) {
        int[][] matrix = {
                { 5, 5, 3 },
                { 2, 3, 6 },
                { 1, 1, 1 }
        };// 4
        System.out.println(longestIncreasingPath(matrix));

    }

}