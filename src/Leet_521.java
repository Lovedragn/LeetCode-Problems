public class Leet_521 {
    public static int findLUSlength(String a, String b) {
        int max = Math.max(a.length(), b.length());
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i) != b.charAt(i)){
                return max;
            }
        }

        return -1;
    }

    public static void main(String args[]) {
        System.out.println(findLUSlength("aba", "aba"));
    }
}
