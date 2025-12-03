

public class Leet_309 {
    public static int memo;

    public static int maxProfit(int[] prices) {
        memo = 0;
        recursion(prices, 0, -1, 0);
        return memo;
    }

    public static void recursion(int[] prices, int index, int buy, int profit) {

        if (index >= prices.length) {
            memo = Math.max(memo, profit);
            return;
        }

        // buy
        if (buy == -1) {
            recursion(prices, index + 1, prices[index], profit);
        }
        // sell
        else if (buy != -1) {
            recursion(prices, index + 2, -1, profit + (prices[index] - buy));
        }
        // skip
        recursion(prices, index + 1, buy, profit);
    }


    public static void main(String args[]) {
        int[] arr = { 1, 3, 4, 0, 4 };
        // 1 2 3 -1 3
        System.out.println(maxProfit(arr));
    }
}
