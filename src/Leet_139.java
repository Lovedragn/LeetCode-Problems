
import java.util.*;

public class Leet_139 {

    public static boolean wordBreak(String s, List<String> wordDict) {

        Set<String> wordSet = new HashSet<>(wordDict);

        boolean arr[] = new boolean[s.length() + 1];
        arr[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] && wordSet.contains(s.substring(j, i))) {
                    arr[i] = true;
                    break;
                }
            }
        }
        return arr[s.length()];
    }

    public static void main(String[] args) {
        String s = "aaaaaaa";
        List<String> wordDict = Arrays.asList("aaaa", "aaa");
        System.out.println(wordBreak(s, wordDict));
    }
}
