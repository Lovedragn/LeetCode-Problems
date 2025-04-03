
public class Leet_1475 {

    public static int[] finalPrices(int[] prices) {
        int[] res = new int[prices.length];
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] >= prices[i + 1]) {
                res[i] = (prices[i] - prices[i + 1]);
            }else{
                for (int j = i+1; j < prices.length; j++) {
                    if (prices[i] >= prices[j]) {
                        res[i] = (prices[i] - prices[j]);
                        break;
                    }
                    res[i] = prices[i];       
                }
                
            }
        }
        res[prices.length - 1] = prices[prices.length - 1];
        return res;
    }

    public static void main(String args[]) {
        int[] prices = {10,2,5,2,8};
        int[] res = finalPrices(prices);
        for (int elem : res) {
            System.out.print(elem + " ");
        }
        // Output: [4,2,4,2,3]
    }
}
