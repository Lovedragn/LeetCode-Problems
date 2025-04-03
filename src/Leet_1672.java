
public class Leet_1672 {

    public static int maximumWealth(int[][] accounts) {
        int res = 0;
        int length = accounts[0].length;

        for (int i = 0; i < accounts.length; i++) {
            int total = 0;
            for (int elem : accounts[i]) {
                total += elem;
            }

            res = Math.max(res , total);
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {4, 5, 5}, {10, 10, 10}};
        System.out.println(maximumWealth(arr));
    }
}
