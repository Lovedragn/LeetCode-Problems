public class Leet_1886 {
    public static boolean findRotation(int[][] mat, int[][] target) {

        for (int i = 0; i < 3; i++) {
            if (checker(mat, target)) {
                return true;
            }
            mat = rotate(mat);
        }
        return false;
    }

    public static boolean checker(int[][] matrix, int[][] target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i+1; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }

        }
        for (int i = 0; i < matrix.length; i++) {
            int l=0;int r = matrix.length-1;
            while(l < r){
                int temp =matrix[i][l];
                matrix[i][l] = matrix[i][r];
                matrix[i][r] = temp;
                l++;r--;
            }

        }
        return matrix;
    }

    public static void main(String[] args) {
        int arr[][] = { { 0, 1 }, { 1, 0 } };
        int arr1[][] = { { 1, 0 }, { 0, 1 } };
        System.out.println(findRotation(arr, arr1));
    }
}
