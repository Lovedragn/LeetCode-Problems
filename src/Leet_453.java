public class Leet_453 {
    public static int minMoves(int[] nums) {
        int count =0;
        int max =0;
        for (int i : nums) {
            max = Math.max(max, i);
        }

        for (int i : nums) {
            count += max - i;
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println(minMoves(arr));
    }
}
