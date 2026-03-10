import java.util.Arrays;
import java.util.HashSet;
public class Leet_3129 {
    //please refer 3130
    public static int count;

    public static int numberOfStableArrays(int zero, int one, int limit) {
        if (limit == 0) {
            return 0;
        }
        count = 0;
        int[] temp = new int[zero + one];
        Arrays.fill(temp, 0, one, 1);
        HashSet<String> seen = new HashSet<>();
        generator(temp, limit, 0, seen);

        return count;

    }

    public static void generator(int[] temp, int limit, int idx, HashSet<String> seen) {
        if (idx == temp.length) {
            String s = Arrays.toString(temp);
            if (!seen.contains(s)) {
                seen.add(s);
                if (checker(temp, limit)) {
                    System.out.println(s);

                    count++;
                }
            }

            return;
        }

        for (int i = idx; i < temp.length; i++) {
            swap(temp, i, idx);
            generator(temp, limit, idx + 1, seen);
            swap(temp, i, idx);
        }
    }

    public static void swap(int[] temp, int i, int j) {
        int t = temp[i];
        temp[i] = temp[j];
        temp[j] = t;
    }

    public static boolean checker(int[] temp, int limit) {
        int l = 0;
        int r = 0;
        while (r != temp.length) {
            if (temp[l] != temp[r]) {
                l = r;
            }
            if (r - l +1> limit) {
                return false;
            }
            r++;
        }
        return true;
    }

    public static void main(String args[]) {
        System.out.println(numberOfStableArrays(1, 2, 1));
    }
}
