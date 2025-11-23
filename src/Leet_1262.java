import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leet_1262 {
    public static int maxSumDivThree(int[] nums) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int sum = 0;

        for (int num : nums) {
            sum += num;
            if (num % 3 == 1) {
                list1.add(num);
            } else if (num % 3 == 2) {
                list2.add(num);
            }
        }

        Collections.sort(list1);
        Collections.sort(list2);

        if (sum % 3 == 0) {
            return sum;
        } else if (sum % 3 == 1) {

            int option1 = list1.size() >= 1 ? sum - list1.get(0) : 0;
            int option2 = list2.size() >= 2 ? sum - list2.get(0) - list2.get(1) : 0;
            return Math.max(option1, option2);

        } else {

            int option1 = list2.size() >= 1 ? sum - list2.get(0) : 0;
            int option2 = list1.size() >= 2 ? sum - list1.get(0) - list1.get(1) : 0;
            return Math.max(option1, option2);

        }
    }

    public static void main(String args[]) {
        int arr[] = { 3, 6, 5, 1, 8 };
        System.out.println(maxSumDivThree(arr));
    }
}
