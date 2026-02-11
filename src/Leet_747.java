import java.util.Arrays;

public class Leet_747 {
    public static int dominantIndex(int[] nums) {
        
        int first  = -1, second = -1,idx = -1;
        for (int i = 0; i < nums.length; i++) {
            if(first < nums[i]){
                second = first;
                first = nums[i];
                idx = i;
            }
            if(second < nums[i]){
                second = nums[i];
            }
        }

        return second *2 <= first ? idx : -1 ;
    }

    public static void main(String[] args) {
        int arr[] = { 1,0 };
        System.out.println(dominantIndex(arr));
    }
}
