import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet_1161 {

    public static List<Integer> sum = new ArrayList<>(Arrays.asList(Integer.MIN_VALUE));

    private void dfs(TreeNode node, int level) {
        if (node == null)
            return;

        if (sum.size() == level) {
            sum.add(node.val);
        } else {
            sum.set(level, sum.get(level) + node.val);
        }

        dfs(node.left, level + 1);
        dfs(node.right, level + 1);
    }

    public int maxLevelSum(TreeNode root) {
        dfs(root, 1);
        int maxIndex = 0;
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < sum.size(); i++) {
            if (sum.get(i) > maxValue) {
                maxValue = sum.get(i);
                maxIndex = i;
            }
        }

        return maxIndex; // returns the level with maximum sum

    }
}
