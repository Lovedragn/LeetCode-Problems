import java.util.Arrays;
import java.util.stream.IntStream;

public class Leet_3925 {
    public static int[] concatWithReverse(int[] nums) {
        int res[] = IntStream.range(0  , nums.length).map(i -> nums[nums.length-1-i]).toArray();
        
        return IntStream.concat(Arrays.stream(nums), Arrays.stream(res)).toArray();
        
    }

    public static void main(String[] args) {
        int[] res = concatWithReverse(new int[] { 1, 2, 3 });
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
