import java.util.Arrays;
import java.util.List;

public class Leet_1431 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        Boolean res[] = new Boolean[candies.length];
        Arrays.fill(res, true);
        List<Boolean> result = Arrays.asList(res);
        int top = -1;

        for (int i = 0; i < res.length; i++) {
            top = Math.max(top , candies[i]);            
        }

        for (int i =0;i<candies.length;i++) {
            if(candies[i] + extraCandies < top){
                result.set(i, false);
            }
        }

        return result;

    }

    public static void main(String args[]) {
        int[] candies = { 2, 3, 5, 1, 3 };
        System.out.println(kidsWithCandies(candies, 3));
    }
}
