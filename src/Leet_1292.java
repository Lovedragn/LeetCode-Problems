public class Leet_1292 {
    public static int res;

    public static int maxSideLength(int[][] mat, int threshold) {
        res = 0;
        int min = Math.min(mat[0].length, mat.length) - 1;
        int m = mat.length, n = mat[0].length;
        // Build prefix sum matrix
        int[][] prefix = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                prefix[i][j] = mat[i - 1][j - 1]
                        + prefix[i - 1][j]// down
                        + prefix[i][j - 1]// left
                        - prefix[i - 1][j - 1];// top

            }

        }

        int res = 0;
        // Try all possible side lengths
        for (int len = 1; len <= Math.min(m, n); len++) {
            boolean found = false;
            for (int i = len; i <= m; i++) {
                for (int j = len; j <= n; j++) {
                    int sum = prefix[i][j]
                            - prefix[i - len][j]
                            - prefix[i][j - len]
                            + prefix[i - len][j - len];
                    if (sum <= threshold) {
                        System.out.println(sum);
                        res = len;
                        found = true;
                        break; // no need to check more for this len
                    }
                }
                if (found)
                    break;
            }
        }
        return res;
    }

    public static void main(String args[]) {
        int[][] srr = { { 1, 1, 3, 2, 4, 3, 2 },
                { 1, 1, 3, 2, 4, 3, 2 },
                { 1, 1, 3, 2, 4, 3, 2 } };
        System.out.println(maxSideLength(srr, 4));
    }
}
