
public class Leet_66 {

    public static int[] plusOne(int[] digits) {

        int j = digits.length;
        for (int i = j-1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[j+1];
        digits[0]  = 1;  
        return digits;

    }

    public static void main(String[] args) {
        int[] nums = {1,1,8,9};

        plusOne(nums);
        for (int elem : nums) {
            System.out.print(elem);
        }
    }
}
