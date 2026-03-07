public class Leet_766 {
    public static boolean isToeplitzMatrix(int[][] matrix) {
        if (matrix.length == 1) {
            return true;
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                if (matrix[i - 1][j - 1] != matrix[i][j]) {
                    return false;
                }
            }
        }

        

        return true;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 }, 
                        { 4, 1, 2, 3 },
                        { 3, 4, 1, 2 }, 
                        { 6, 5, 4, 1 } };
        System.out.println(isToeplitzMatrix(arr) ? "T" : "F");
    }
}
