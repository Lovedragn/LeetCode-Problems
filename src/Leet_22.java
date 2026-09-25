import java.util.List;
import java.util.*;

public class Leet_22 {

    public static List<String> generateParenthesis(int n) {

        if (n == 0) {
            return new ArrayList<>();
        } else if (n == 1) {
            return new ArrayList<>(Arrays.asList("()"));
        }
        List<String> list = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('(', 1);
        map.put(')', 0);
        paranthesis_Hash(n, map, new StringBuilder("("), list);
        return list;
    }

    public static void paranthesis_Hash(int n, HashMap<Character, Integer> map, StringBuilder newstr,
            List<String> list) {
        Integer open = map.get('(');
        Integer close = map.get(')');
        if (open < close) {
            return;
        }
        if (newstr.length() == n * 2) {
            list.add(newstr.toString());
            return;
        }
        if (open < n) {
            newstr.append('(');
            map.put('(', map.get('(') + 1);
            paranthesis_Hash(n, map, newstr , list);
            newstr.deleteCharAt(newstr.length() - 1);
            map.put('(', map.get('(') - 1);
        }
        if (close < n) {
            newstr.append(')');
            map.put(')', map.get(')') + 1);
            paranthesis_Hash(n, map, newstr , list);
            newstr.deleteCharAt(newstr.length() - 1);
            map.put(')', map.get(')') - 1);
        }
    }

    public static void main(String args[]) {
        System.out.println(generateParenthesis(1));
    }
}