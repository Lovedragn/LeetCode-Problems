import java.util.*;

public class Leet_3480 {

    public static long maxSubarrays(int n, int[][] conflictingPairs) {
        long res = 0;

        // Step 1: Create the full array [1, 2, ..., n]
        int[] arr = new int[n];
        for (int i = 1; i <= n; i++) {
            arr[i - 1] = i;
        }

        // Step 2: Generate all subarrays
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = i; j < arr.length; j++) {
                temp.add(arr[j]);
                list.add(new ArrayList<>(temp));
            }
        }   

        // Step 3: Try removing each conflict once
        for (int i = 0; i < conflictingPairs.length; i++) {
            int counter = 0;

            // Prepare the reduced conflict list
            List<int[]> reducedConflicts = new ArrayList<>();
            for (int j = 0; j < conflictingPairs.length; j++) {
                if (j != i)
                    reducedConflicts.add(conflictingPairs[j]);
            }

            // Step 4: Check all subarrays
            for (List<Integer> sub : list) {
                boolean isValid = true;
                for (int[] pair : reducedConflicts) {
                    int a = pair[0], b = pair[1];
                    if (sub.contains(a) && sub.contains(b)) {
                        isValid = false;
                        break;
                    }
                }
                if (isValid)
                    counter++;
            }

            // Step 5: Track max result
            res = Math.max(res, counter);
        }

        return res;
    }

    public static void main(String args[]) {
        int[][] arr = { { 1, 2 }, { 2, 5 }, { 3, 5 } };
        long res = maxSubarrays(5, arr);
        System.out.println(res); // ✅ Output should be 12
    }
}
