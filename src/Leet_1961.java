
public class Leet_1961 {

        public static boolean isPrefixString(String s, String[] words) {
            int idx = 0;

            for (String elem : words) {
                if (idx == s.length() ) {
                    return true;
                }
                for (char c : elem.toCharArray()) {
                    if (idx == s.length()) {
                        return false;
                    }
                    char cc = s.charAt(idx);
                    if (c != cc) {
                        return false;
                    }
                    idx++;
                }
            }
            return idx == s.length() ? true:false;
        }

    public static void main(String[] args) {
        String words = "c";
        String arr[] = {"c"};
        System.out.println(isPrefixString(words, arr));
    }
}
