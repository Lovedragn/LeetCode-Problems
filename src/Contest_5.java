import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Contest_5 {
    public static List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        Collections.sort(bulbs);
        List<Integer> res = new ArrayList<>();

        int prev = 0;
        System.out.println(bulbs.size());
        for (int i = 1; i < bulbs.size(); i++) {
            if (!bulbs.get(i).equals(bulbs.get(prev))) {
                if ((i - prev) % 2 != 0) {
                    res.add(bulbs.get(prev));
                }
                prev = i;
            }
        }
        // handle last group
        if ((bulbs.size() - prev) % 2 != 0) {
            res.add(bulbs.get(prev));
        }

        return res;

    }

    public static void main(String args[]) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(10, 20, 30, 10));
        System.out.println(toggleLightBulbs(arr));

    }
}
