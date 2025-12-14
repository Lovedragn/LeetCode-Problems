import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Leet_3606 {
    public static List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<String> e = new LinkedList<>();
        List<String> g = new LinkedList<>();
        List<String> p = new LinkedList<>();
        List<String> r = new LinkedList<>();

        for (int i = 0; i < isActive.length; i++) {
            if (checker(code[i]) && isActive[i]) {
                if (businessLine[i].equals("electronics")) {
                    e.add(code[i]);
                } else if (businessLine[i].equals("grocery")) {
                    g.add(code[i]);
                } else if (businessLine[i].equals("pharmacy")) {
                    p.add(code[i]);
                } else if (businessLine[i].equals("restaurant")) {
                    r.add(code[i]);
                }
            }
        }
        Collections.sort(e);
        Collections.sort(g);
        Collections.sort(p);
        Collections.sort(r);
        e.addAll(g);
        e.addAll(p);
        e.addAll(r);
        return e;
    }

    public static boolean checker(String str) {

        for (char c : str.toCharArray()) {
            if ((!Character.isDigit(c) && !Character.isAlphabetic(c) && c != '_')) {
                return false;
            }
        }

        return str.isBlank() ? false : true;
    }

    public static void main(String args[]) {
        String[] code = { "SAVE20", "", "PHARMA5", "SAVE@20" };
        String[] businessLine = { "restaurant", "grocery", "pharmacy", "etaurant" };
        boolean[] isActive = { true, true, true, true };
        System.out.println(validateCoupons(code, businessLine, isActive));
    }
}
