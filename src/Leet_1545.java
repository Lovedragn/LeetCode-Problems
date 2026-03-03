public class Leet_1545 {
    public static char findKthBit(int n, int k) {
        StringBuilder res = new StringBuilder("0"); // S1
        for (int i = 2; i <= n; i++) { // build up to Sn
            StringBuilder temp = new StringBuilder();
            temp.append("1"); // middle '1'
            temp.append(reverInv(res)); // reverse + invert of previous
            res.append(temp); // concatenate
        }
        return res.charAt(k - 1); // k is 1-based
    }

    public static StringBuilder reverInv(StringBuilder res) {
        StringBuilder inverted = new StringBuilder();
        // invert
        for (char c : res.toString().toCharArray()) {
            inverted.append(c == '0' ? '1' : '0');
        }
        // reverse
        return inverted.reverse();
    }


    public static void main(String args[]) {
        System.out.println(findKthBit(3, 1));
    }
}
