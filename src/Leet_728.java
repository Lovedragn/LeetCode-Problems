import java.util.ArrayList;
import java.util.List;

public class Leet_728 {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            int temp = i;
            boolean trigger = false;

            while (temp != 0) {
                int mod = temp % 10;
                trigger = true;
                if (mod == 0 || i % mod != 0) {
                    trigger = false;
                    break;
                }
                temp /= 10;
            }
            if (trigger) {
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String args[]) {
        System.out.println(selfDividingNumbers(1, 22));
    }
}
