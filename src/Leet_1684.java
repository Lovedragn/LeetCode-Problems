
public class Leet_1684 {

    public static int countConsistentStrings(String allowed, String[] words) {
        int res = 0;
        for (String elem : words) {
            for (int i=0;i<= elem.length();i++) {
                if (i == elem.length()) {

                    res++;
                    break;
                }
                char c  = elem.charAt(i);
                if (!allowed.contains(String.valueOf(c))) {
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String str[] = {"ad", "bd", "aaab", "baa", "badab", "ab"};
        String target = "ab";
        System.out.println(countConsistentStrings(target, str));
    }
}
