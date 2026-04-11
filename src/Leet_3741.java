import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class Leet_3741 {
    public static int minimumDistance(int[] nums) {
        int res = Integer.MAX_VALUE;
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }
        System.out.println(map);

        for (Map.Entry<Integer, List<Integer>> i : map.entrySet()) {
            List<Integer> temp = i.getValue();
            if (temp.size() > 2) {
                for (int j = 0; j + 2 < temp.size(); j++) {
                    res = Math.min(res, (Math.abs(temp.get(j) - temp.get(j + 1))
                            + Math.abs(temp.get(j + 1) - temp.get(j + 2)) + Math.abs(temp.get(j + 2) - temp.get(j))));
                }
            }
        }
        return res != Integer.MAX_VALUE ? res : -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 1, 3 };
        System.out.println(minimumDistance(arr));
    }
}