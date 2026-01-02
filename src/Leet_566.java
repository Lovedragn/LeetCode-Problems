class Solution {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length, n = mat[0].length;
        
        // Check if reshape is possible
        if (m * n != r * c) return mat;
        
        int[][] res = new int[r][c];
        int rr = 0, cc = 0;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[rr][cc] = mat[i][j];
                cc++;
                if (cc == c) { // reset when reaching new column limit
                    cc = 0;
                    rr++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] arr = { {1, 2}, {3, 4} };
        int[][] res = matrixReshape(arr, 1, 4); // reshape to 1x4
        for (int[] row : res) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}