import java.util.List;
import java.util.ArrayList;

public class Leet_2452 {
    public static List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> res = new ArrayList<>();

        for (int i = 0; i < queries.length; i++) {
            for (int j = 0; j < dictionary.length; j++) {
                int count = 0;
                String str = dictionary[j];
                for (int idx = 0; idx < str.length(); idx++) {
                    if (str.charAt(idx) != queries[i].charAt(idx)) {
                        count++;
                    }
                    if (count > 2) {
                        break;
                    }
                }
                if (count <= 2) {
                    res.add(queries[i]);
                    break;
                }
                count=0;
            }

        }
        return res;
    }

    public static void main(String[] args) {
        String[] queries = { "tsl", "sri", "yyy", "rbc", "dda", "qus", "hyb", "ilu", "ahd" };
        String[] dictionary = { "uyj", "bug", "dba", "xbe", "blu", "wuo", "tsf", "tga" };
        System.out.println(twoEditWords(queries, dictionary));
    }
}