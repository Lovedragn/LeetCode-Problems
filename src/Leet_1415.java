public class Leet_1415 {
    public static char container[] = {'a','b','c'};

    public static String getHappyString(int n, int k) {
        int idx = checker(n, k);
        if (idx == -1) {
            return "";
        }
        return String_finder(idx, k, "", n);
    }

    private static String String_finder(int idx, int k, String str, int n) {
        // Base case: if we built length n
        if (str.length() == n) {
            if (k == 1) {   // found kth string
                return str;
            }
            return null;    // not this branch
        }

        for (int i = 0; i < 3; i++) {
            // skip if same as previous char
            if (!str.isEmpty() && container[i] == str.charAt(str.length()-1)) {
                continue;
            }

            int blockSize = (int)Math.pow(2, n - str.length() - 1);
            if (k > blockSize) {
                k -= blockSize; // skip this branch
            } else {
                // go deeper into this branch
                String res = String_finder(i, k, str + container[i], n);
                if (res != null) return res;
            }
        }
        return null;
    }

    private static int checker(int n, int k) {
        int total = 3 * (int)Math.pow(2, n-1);
        if (k > total) return -1;
        return 0; // we don’t actually need idx here, handled in String_finder
    }

    public static void main(String[] args) {
        System.out.println(getHappyString(3, 9)); // Output: "cab"
        System.out.println(getHappyString(3, 1)); // Output: "aba"
        System.out.println(getHappyString(3, 12)); // Output: "cbc"
        System.out.println(getHappyString(4, 10)); // Works for n=4 too
    }
}