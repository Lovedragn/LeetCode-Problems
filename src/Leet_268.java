
public class Leet_268 {

    public static int missingNumber(int[] nums) {
        
        int add = nums.length;//3
        int i=0;
        for (int elem : nums) {
            add += i -  elem;
            i++;
        }

        return add;
    }

    public static void main(String[] args) {
        int arr[] = {3,0, 1};
        System.out.print(missingNumber(arr));
    }
}
