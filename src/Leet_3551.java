import java.util.*;

public class Leet_3551 {
    public static int minSwaps(int[] nums) {
        Integer[] sorted = Arrays.stream(nums)
                .boxed()
                .toArray(Integer[]::new);
        int n = nums.length;

        Arrays.sort(sorted, (a, b) -> {
            int aa = digitCalculator(a);
            int bb = digitCalculator(b);
            if (aa != bb) {
                return aa - bb;
            }
            return a - b;
        });

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < sorted.length; i++) {
            map.put(sorted[i], i);
        }

        boolean visited[] = new boolean[n];
        int swaps = 0;
        
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                swaps++;
                int j = i;
                while (!visited[j]) {
                    visited[j] = true;
                    j = map.get(nums[j]);
                }
            }
        }

        return n - swaps;
    }

    public static int digitCalculator(int num) {
        int res = 0;

        while (num != 0) {
            res += num % 10;
            num /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 37, 100 };
        System.out.println(minSwaps(arr));
    }
}