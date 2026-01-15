import java.util.Arrays;
import java.util.List;

public class Leet_120 {

    public static int minimumTotal(List<List<Integer>> triangle) {
        // Start from the second last row and move upwards
        for (int i = triangle.size() - 2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                int below = triangle.get(i + 1).get(j);
                int belowRight = triangle.get(i + 1).get(j + 1);
                int updatedValue = triangle.get(i).get(j) + Math.min(below, belowRight);
                triangle.get(i).set(j, updatedValue);
            }
        }
        return triangle.get(0).get(0);
    }

    public static void main(String[] args) {
        List<List<Integer>> triangle = Arrays.asList(
                Arrays.asList(2),
                Arrays.asList(3, 4),
                Arrays.asList(6, 5, 7),
                Arrays.asList(4, 1, 8, 3)
        );
        System.out.println(minimumTotal(triangle)); // Output: 11
    }
}