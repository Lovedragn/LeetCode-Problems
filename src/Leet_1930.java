import java.util.HashSet;

public class Leet_1930 {
    public static HashSet<String> set;

    public static int countPalindromicSubsequence(String s) {
        set = new HashSet<>();
        int res = 0;

        for (int l = 0; l < s.length(); l++) {

            StringBuilder ss = new StringBuilder(s.charAt(l));

            if (set.contains(ss.toString())) {
                continue;
            } else {
                set.add(ss.toString());
            }

            int r = l + 1;
            for (int i = r; i < s.length() - 1; i++) {
                ss.append(s.charAt(r));
                int rr = i + 1;
                while (r < rr && rr < s.length()) {
                    if (ss.length() == 3) {
                        if (!set.contains(ss.toString()) || ss.charAt(0) == ss.charAt(2)) {
                            set.add(ss.toString());

                        } else {
                            ss.deleteCharAt(2);
                        }
                    } else if (ss.length() < 3) {
                        ss.append(s.charAt(rr)); 
                    } else {
                        ss.delete(1, 3);
                    }
                    rr++;
                }
            }

        }

        return set.size();
    }

    public static void main(String args[]) {
        String s = "aabca";
        int res = countPalindromicSubsequence(s);
        System.out.println(res);
    }
}
