
import java.util.HashMap;
import java.util.Map;

public class Leet_1365 {

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];

        HashMap<Integer, Integer> map = new HashMap<>();
        //put all values
        for (int elem : nums) {
            map.put(elem, map.getOrDefault(elem, 0) + 1);
        }

        int idx = 0;
        while(idx < nums.length) {
            int temp = 0;
            for (Map.Entry<Integer, Integer> elems : map.entrySet()) {
                if (nums[idx] > elems.getKey()) {
                    temp += elems.getValue();
                }
            }
            res[idx] = temp;
            idx++;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        int[] res = smallerNumbersThanCurrent(nums);
        for (int elem : res) {
            System.out.print(elem+" ");
        }
    }
}
