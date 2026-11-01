public class Leet_453 {
    public static int minMoves(int[] nums) {
        int count = 0;
        int min = Integer.MAX_VALUE;

        for (int i : nums) {
            min = Math.min(min, i);
        }

        for (int i : nums) {
            count += i - min;
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 1,100};
        System.out.println(minMoves(arr));
    }
}
