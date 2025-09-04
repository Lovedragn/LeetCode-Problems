import java.util.*;

public class Leet_2900 {
    public static List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String > res = new ArrayList<>();
        int last = -1;
        for (int i = 0; i < groups.length; i++) {
            if(last != groups[i]){
                res.add(words[i]);
                last = groups[i];
            }
        }
        return res;
    }

    public static void main(String args[]) {
        String words[] = {"a","b","c","d"};
        int groups[] = {1,0,1,1};
        System.out.println(getLongestSubsequence(words, groups));

    }
}
