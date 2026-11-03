public class Leet_3736{
    public static int minMoves(int[] nums) {
        int max =0;
        int count =0;
        for (int i : nums) {
            max = Math.max(max,i);
        }
        for (int i : nums) {
            count+= max - i;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr ={2,1,3};
        System.out.println(minMoves(arr));
    }
}