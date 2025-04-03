
import java.util.*;

public class Leet_71 {

    public static String simplifyPath(String path) {
        int l = 1;
        String[] arr = path.split("/");
        Stack stack = new Stack<>();

        while (l < arr.length) {
            if (arr[l].isBlank() || arr[l].equals(".")) {
                l++;
                continue;
            }
            if (arr[l].equals("..")) {
                if (stack.isEmpty()) {
            l++;
                    continue;
                } else {
                    stack.pop();
                    stack.pop();
                }
                l++;
            } else {
                stack.add("/");
                stack.add(arr[l]);
                l++;
            }
        }

        int r = stack.size();
        StringBuilder strbur = new StringBuilder();
        while (r > 0) {
            if (!stack.isEmpty()) {
                strbur.insert(0, stack.pop());
            }
            r--;
        }
        return strbur.toString().length() > 0 ? strbur.toString(): "/";
    }

    public static void main(String[] args) {
        String path = "/a/../../b/../c//.//";//    "/.../b/d"
        System.out.println(simplifyPath(path));
    }
}
