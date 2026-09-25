
public class Leet_414 {

    public static int thirdMax(int[] nums) {
        
        long max1 = Long.MIN_VALUE,max2 = Long.MIN_VALUE,max3=Long.MIN_VALUE;

        for (long elem : nums) {
            if (elem > max1) {
                max3 = max2;
                max2 = max1;
                max1 = elem;

            }else if (elem > max2 && max1 != elem) {
                max3 = max2;
                max2 = elem;
            }
            else if(elem > max3 && max2 != elem && max1 != elem){
                max3 = elem;
                break;
            }
        }

        return max3 == Long.MIN_VALUE ? (int)max1 :(int) max3;
    }

    public static void main(String[] args) {
        int arr[] = {0,4,1};
        System.out.println(thirdMax(arr));
    }
}
