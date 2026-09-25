
import java.util.*;

public class Leet_3211 {

    public static List<String> res = new ArrayList<>();

    public static void recursion(String prev, String curr, String result, int n, int idx) {
        if (idx == n) {
            res.add(result);
            return;
        }

        if (curr.equals("0")) {
            recursion(curr, "1", result + "1", n, idx + 1);
        } else if (curr.equals("1")) {
            recursion(curr, "0", result + "0", n, idx + 1);
            recursion(curr, "1", result + "1", n, idx + 1);
        }
    }

    public static List<String> validStrings(int n) {

        res.clear(); // Clear previous results to avoid leftover entries
        if (n == 1) {
            res.add("0");
            res.add("1");
            return res; // Special case for n=1
        }
        recursion("", "0", "0", n, 1);
        recursion("", "1", "1", n, 1);
        return res;

    }

    public static void main(String[] args) {
        int n = 1;
        System.out.println(validStrings(n));
    }
}
