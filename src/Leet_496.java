
import java.util.*;

public class Leet_496 {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int res[] = new int[nums1.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int elem : nums2) {
            while (!stack.isEmpty() && stack.peek() < elem) {
                map.put(stack.pop(), elem);
            }
            stack.push(elem);
        }
        int i = 0;
        for (int elem : nums1) {
            res[i] = map.getOrDefault(elem, -1);
            i++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 2, 4};
        int[] nums2 = {6, 5, 4, 3, 2, 1, 7};
        int res[] = nextGreaterElement(nums1, nums2);

        for (int elem : res) {
            System.out.print(elem + " ");
        }
    }
}
