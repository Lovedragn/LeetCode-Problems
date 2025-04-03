
import java.util.HashMap;

public class Leet_1678 {

    public static String interpret(String command) {
        StringBuilder res = new StringBuilder();
        HashMap<String, String> map = new HashMap<>();
        map.put("()", "o");
        map.put("(al)", "al");
        map.put("G", "G");

        int l = 0;
        int r = 0;

        while (r < command.length()) {
            if (String.valueOf(command.charAt(r)).equals("G")) {
                res.append(map.get("G"));
                r++;
                l++;
            } else if (command.substring(l, r+1).equals("(")) {
                r++;
            } else if (command.substring(l, r+1).equals("()")) {
                res.append(map.get(command.substring(l, r+1)));
                r++;
                l = r;
            } else if (command.substring(l, r+1).equals("(a")) {
                r += 3;
                res.append(map.get(command.substring(l, r)));
                l=r;
            }else{
                r++;
            }
        }

        return res.toString();
    }

    public static void main(String[] args) {
        String str = "(al)G(al)()()G";
        System.out.println(interpret(str));
    }
}
