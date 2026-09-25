public class Leet_3289 {

    public static int[] getSneakyNumbers(int[] nums) {
        int[] res = new int[2]; // Result array to store sneaky numbers.
        boolean[] visited = new boolean[nums.length]; // Track visited indices.
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0 || nums[i] >= nums.length) {
                continue; // Skip invalid indices.
            }

            // Check if already visited:
            if (visited[nums[i]]) {
                res[k] = nums[i];
                k++;
                if (k == res.length) break; // Stop once result is filled.
            } else {
                visited[nums[i]] = true; // Mark index as visited.
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {0, 3, 2, 1, 3, 2};
        int[] res = getSneakyNumbers(arr);

        for (int elem : res) {
            System.out.print(elem + " ");
        }
    }
}
