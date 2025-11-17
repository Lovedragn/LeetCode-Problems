public class Leet_1437 {
    public static boolean kLengthApart(int[] nums, int k) {
       
        int prev = Integer.MIN_VALUE;
        int i = 0;
       
        for (int j = i; j < nums.length; j++) {
            if (nums[j] == 1) {
                prev = j;
                i = j + 1;
                break;
            }
        }

        for (int j = i; j < nums.length; j++) {
            if (nums[j] == 1) {
               

                if ((j - prev -1 ) < k) {
                    return false;
                }
                 prev = j;
           
            }
        }

        return true;
    }

    public static void main(String args[]) {
        int[] arr = { 1, 0, 0, 1, 0,0, 1 };//prev =3 , j=4
        int k = 2;
        System.out.println(kLengthApart(arr, k));
    }
}