import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        String[] s = words.clone(); // Store input midway
        Arrays.sort(s);
        List<List<String>> result = new ArrayList<>();
        int n = s.length;

        // Try all combinations of 4 distinct words
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                // Constraint 1: top[0] == left[0]
                if (a != b && s[a].charAt(0) == s[b].charAt(0)) {
                    for (int c = 0; c < n; c++) {
                        // Constraint 2: top[3] == right[0]
                        if (c != a && c != b &&
                                s[a].charAt(3) == s[c].charAt(0)) {
                            for (int d = 0; d < n; d++) {
                                // Constraint 3 & 4: bottom constraints
                                if (d != a && d != b && d != c &&
                                        s[d].charAt(0) == s[b].charAt(3) &&
                                        s[d].charAt(3) == s[c].charAt(3)) {
                                    result.add(Arrays.asList(s[a], s[b],
                                            s[c], s[d]));
                                }
                            }
                        }
                    }
                }
            }
        }
        return result;
    }

    public static void main(String args[]) {
        System.out.println(wordSquares(new String[] { "able", "area", "echo", "also" }));
    }
}
