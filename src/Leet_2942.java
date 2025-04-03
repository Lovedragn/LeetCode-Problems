
import java.util.*;

public class Leet_2942 {

    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(Character.toString(x))) {
                res.add(i);
            }
        }
        return res;
    }

    public static void main(String args[]) {
        String arr[] = {"Leet", "Code"};
        System.out.println(findWordsContaining(arr, 'e'));
    }
}
