import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leet_1980 {

    public static List<String> container;

    public static String findDifferentBinaryString(String[] nums) {
        container = new ArrayList<>();
        Collections.addAll(container, nums);

        return generator(nums[0].length(), new StringBuilder());
    }

    public static String generator(int length, StringBuilder str) {
        if (str.length() == length) {
            if (!container.contains(str.toString())) {
                return str.toString();
            }
            return null; // return null if not unique
        }

        // try with '0'

        String left = generator(length,str.append("0"));
        str.deleteCharAt(str.length() - 1);
        if (left != null)
            return left;

        // try with '1'

        String right = generator(length,str.append("1"));
        str.deleteCharAt(str.length() - 1);
        if (right != null)
            return right;

        return null; // no valid string found

    }

    public static void main(String[] args) {
        String nums[] = { "01", "10" };
        System.out.println(findDifferentBinaryString(nums));
    }
}
