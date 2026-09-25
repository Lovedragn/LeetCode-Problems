public class Leet_997 {
    public static int findJudge(int n, int[][] trust) {

        int[] arr = new int[n + 1];
        for (int i = 0; i < trust.length; i++) {
            arr[trust[i][0]]--;
            arr[trust[i][1]]++;

        }
        for (int i = 1; i <= n; i++) {
            if (arr[i] == n - 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[][] = { { 1, 3 }, { 2, 3 } };// 3
        System.out.println(findJudge(3, arr));
    }
}
