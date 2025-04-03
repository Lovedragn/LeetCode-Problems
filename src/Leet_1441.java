
import java.util.*;

public class Leet_1441 {

    public static List<String> buildArray(int[] target, int n) {
        List<String> res = new ArrayList<>();
        int idx = 1;
        Stack<Integer> stack = new Stack<>();

        while (idx <= n) {
            stack.push(idx);
            res.add("Push");
            boolean yes = true;
            for (int elem : target) {
                if (stack.peek().equals(elem)) {
                    yes = false;
                    break;
                }
            }
            if (yes) {
                stack.pop();
                res.add("Pop");
            }
            idx++;
            if (stack.equals(Arrays.asList(Arrays.stream(target).boxed().toArray(Integer[]::new)))) {
                break;
            }

        }
        return res;
    }

    public static void main(String[] args) {
        //     Input: target = [1,3], n = 3
        //     Output: ["Push","Push"]
        int[] target = {1 , 3};
        System.out.print(buildArray(target, 3));
    }

}
