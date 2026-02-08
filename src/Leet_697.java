import java.util.*;

public class Leet_697 {
    public static int findShortestSubArray(int[] nums) {
        int res = Integer.MAX_VALUE;

        int[] l1 = new int[nums.length];
        int[] l2 = new int[nums.length];
        
        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.fill(l1, -1);
        Arrays.fill(l2, -1);

        // Build frequency map and track first/last positions
        for (int index = 0; index < nums.length; index++) {
            if (l1[nums[index]] == -1) {
                l1[nums[index]] = index;
            }
            l2[nums[index]] = index;
            map.put(nums[index], map.getOrDefault(nums[index], 0) + 1);
        }

        // Convert entries to a list and sort by frequency descending
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));
        System.out.println(entries);

        // Get the maximum frequency
        Integer maxVal = entries.get(0).getValue();

        // Check all elements with that maximum frequency
        for (Map.Entry<Integer, Integer> m : entries) {
            int values = m.getValue();
            int keys = m.getKey();
            if (maxVal != values) break;

            int distance = l2[keys] - l1[keys] + 1; // +1 to include both ends
            res = Math.min(distance, res);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 1 };
        System.out.println(findShortestSubArray(arr)); // Expected output: 2
    }
}