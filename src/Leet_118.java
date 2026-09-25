import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet_118 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(Arrays.asList(1));
        if (numRows == 1) {
            return res;
        }
        helper(numRows, res);
        return res;
    }

    public static void helper(int numRows, List<List<Integer>> list) {
        int index = 0;
        int prev = 0;
        if (numRows == list.size()) {
            return;
        }
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < list.getLast().size(); i++) {
            index++;
            int cal = prev + list.getLast().get(i);
            prev = list.getLast().get(i);
            temp.add(cal);
        }
        list.add(temp);
        if (index == list.getLast().size()) {
            list.getLast().add(1);
            helper(numRows, list);
        }

    }

    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}
