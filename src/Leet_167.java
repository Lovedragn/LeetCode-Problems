
import java.util.*;

public class Leet_167 {

    public static int[] twoSum(int[] numbers, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int calc = target - numbers[i];
            if (map.containsKey(calc)) {

                return new int[]{map.get(calc)+1, i+1};
            }
            map.put(numbers[i], i);
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(numbers, target);
        for (int elem : result) {
            System.out.println(elem);
        }
    }
}
