public class Leet_942 {
    public static int[] diStringMatch(String s) {
        int res[] = new int[s.length() + 1];
        int low = 0, high = s.length();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                res[i] = low;
                low++;
            } else {
                res[i] = high;
                high--;
            }

        }
        res[s.length()] = low;
        return res;
    }

    public static void main(String args[]) {
        String str = "IDID";// 0,4,1,3,2
        int res[] = diStringMatch(str);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
