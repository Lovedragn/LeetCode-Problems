
import java.util.*;

public class Leet_151 {

    public static String reverseWords(String s) {
        StringBuilder newstr = new StringBuilder();

        List arr = new ArrayList<>(Arrays.asList(s.split("\\s+")));
        Collections.reverse(arr);
        
        for (int i = 0; i < arr.size(); i++) {
            newstr.append(arr.get(i)).append(" ");
            
        }
        return newstr.toString().trim();
    }

    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }
}
