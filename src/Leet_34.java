
public class Leet_34 {

    public static int[] searchRange(int[] nums, int target) {

        int start = -1, end = -1;
        int l = 0, r = nums.length - 1;

        while (l <= r) {
            int mid =  ((l+r )/ 2);
            if (target == nums[mid]) {
                // Left Side Graind 
                for (int i = mid; i >= 0; i--) {
                    if (target == nums[i]) {
                        start = i;
                    } else {
                        break;
                    }
                }
                //Right side 
                for (int i = mid; i <= r; i++) {
                    if (target == nums[i]) {
                        end = i;
                    } else {
                        break;
                    }
                }
                break;

            } else if (target > nums[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return new int[]{start, end};
    }

    public static void main(String[] args) {
        int[] nums = {-999985131,-999953607,-999953607,-999915742,-999883817,-999849817,-999822901,-999815377,-999810801,-68594,-49967,20394,114012,999969829,999973689,999975494};
        int[] result = searchRange(nums, -999953607);
        for (int elem : result) {
            System.out.println(elem);
        }
    }
}
