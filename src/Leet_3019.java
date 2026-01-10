public class Leet_3019 {
    public static int countKeyChanges(String s) {
        int res = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1) && s.charAt(i) != Character.toLowerCase(s.charAt(i + 1))
                    && s.charAt(i) != Character.toUpperCase(s.charAt(i + 1))) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "aABbCc";
        System.out.println(countKeyChanges(s)); // Expected output: 2
    }
}
