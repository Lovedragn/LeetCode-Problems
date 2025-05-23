
public class Leet_121 {

    public static int maxProfit(int[] prices) {

        int buyprice = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length ; i++) {
            if (buyprice > prices[i]) {
                buyprice = prices[i];
            }

            profit = Math.max(profit,prices[i] - buyprice);
        }

        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3 ,6, 4};
        System.out.println(maxProfit(prices));
    }
}
