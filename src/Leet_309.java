
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

    public int maxProfit2(int[] prices) {
        int n = prices.length;
        int aheadBuy = 0, aheadSell = 0; // dp[i+1][1], dp[i+1][0]
        int ahead2Buy = 0; // dp[i+2][1]

        for (int i = n - 1; i >= 0; i--) {
            int currBuy = Math.max(-prices[i] + aheadSell, aheadBuy);
            int currSell = Math.max(prices[i] + ahead2Buy, aheadSell);

            ahead2Buy = aheadBuy;
            aheadBuy = currBuy;
            aheadSell = currSell;
        }

        return aheadBuy; // start at day 0, allowed to buy
    }

    public static void main(String args[]) {
        int[] arr = { 1, 3, 4, 0, 4 };
        // 1 2 3 -1 3
        System.out.println(maxProfit(arr));
    }
}
