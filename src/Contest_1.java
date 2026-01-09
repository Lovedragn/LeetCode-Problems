import java.util.ArrayList;
import java.util.List;

public class Contest_1 {

    public static String largestEven(String s) {

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '2') {
                return s.substring(0, i + 1);
            }

        }
        return "";
    }

    public static List<List<String>> wordSquares(String[] words) {
        List<List<String>> res = new ArrayList<>();

        return res;
    }

    public static void main(String args[]) {
        System.out.println(wordSquares(new String[] { "able", "area", "echo", "also" }));
    }
}
