
public class Leet_122 {

    public static int maxProfit(int[] prices) {
        int res = 0;
        int i=1;
        int count = 0;
        while (i < prices.length) {
            if (prices[i] > prices[i-1]) {
                count = prices[i] - prices[i-1];
                res += count; 
            }
                i++;   
            
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.err.println(maxProfit(arr));
    }
}
