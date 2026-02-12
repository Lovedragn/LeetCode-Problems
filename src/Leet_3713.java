import java.util.ArrayList;
import java.util.List;

public class Leet_3713 {
    public static int longestBalanced(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            List<int[]> list = new ArrayList<>();
            for (int j = i; j < s.length(); j++) {
                int val = s.charAt(j) - 'a';
                int idx = -1;
                for (int k = 0; k < list.size(); k++) {
                    if (list.get(k)[0] == val) {
                        idx = k;
                        break;
                    }
                }
                if (idx != -1) {
                    list.get(idx)[1]++;
                } else {
                    list.add(new int[]{val, 1});
                }

                // check balanced
                int kk = list.get(0)[1];
                boolean ok = true;
                for (int[] arr : list) {
                    if (arr[1] != kk) {
                        ok = false;
                        break;
                    }
                }
                if (ok) {
                    res = Math.max(res, j - i + 1);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "zzabccy";
        System.out.println(longestBalanced(str)); // prints longest balanced length
    }
}