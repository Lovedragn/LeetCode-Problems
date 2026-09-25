
import java.util.*;

public class Leet_14 {

    public static String longestCommonPrefix(String[] strs) {
        String result = "";

        Arrays.sort(strs);
        int min = Math.min(strs[0].length(), strs[strs.length - 1].length());

        String first = strs[0];
        String second = strs[strs.length - 1];
        for (int i = 0; i < min; i++) {
            if (first.charAt(i) == second.charAt(i)) {
                result += first.charAt(i);
            } else {
                break;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        String strs[] = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
