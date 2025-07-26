import java.util.HashSet;
import java.util.Set;

public class Leet_3483 {
    public static int totalNumbers(int[] digits) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int j2 = 0; j2 < digits.length; j2++) {
                    if (i != j && j != j2 && j2 != i && digits[i]!= 0) {
                        int cal = digits[i] * 100 + digits[j] * 10 + digits[j2];
                        if (digits[j2] % 2 == 0 && !set.contains(cal)) {
                            set.add(cal);
                        }
                    }
                }
            }
        }
        return set.size();
    }

    public static void main(String[] args) {
        int[] arr = { 0, 2, 2 };

        int res = totalNumbers(arr);
        System.out.println(res);
    }
}
