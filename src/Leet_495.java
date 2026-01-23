import java.util.HashSet;

public class Leet_495 {
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
     if (duration ==0) return 0;
        int res =0;
        for (int i = 0; i < timeSeries.length-1; i++) {
            
            int t = timeSeries[i+1] - timeSeries[i];
            res += Math.min(duration , t);
            
        }

        return res + duration;
    }


    public static void main(String args[]) {
        System.out.println(findPoisonedDuration(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, 10_0000));
    }
}
