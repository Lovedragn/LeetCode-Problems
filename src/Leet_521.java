public class Leet_521 {
    public static int findLUSlength(String a, String b) {
        // If strings are equal, no uncommon subsequence exists
        if (a.equals(b)) {
            return -1;
        }
        // Otherwise, the longer string itself is the answer
        return Math.max(a.length(), b.length());
    }

    public static void main(String[] args) {
        System.out.println(findLUSlength("aba", "cdc")); // 3
        System.out.println(findLUSlength("aaa", "bbb")); // 3
        System.out.println(findLUSlength("aaa", "aaa")); // -1
        System.out.println(findLUSlength("ab", "aba"));  // 3
        System.out.println(findLUSlength("beb", "ebb")); // 3
    }
}