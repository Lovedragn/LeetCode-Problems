
public class Leet_2520 {

    public static int countDigits(int num) {
        int res = 0;
        String str = String.valueOf(num);

        for (int i = 0; i < str.length(); i++) {
            int digit = Character.getNumericValue(str.charAt(i));
            if (num % digit == 0 && digit != 0) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int nums = 121;
        System.out.println(countDigits(nums));
    }
}
