import java.util.LinkedList;
import java.util.Queue;

class TreeNodes {
    int val;
    TreeNodes left;
    TreeNodes right;

    TreeNodes() {
    }

    TreeNodes(int val) {
        this.val = val;
    }

    TreeNodes(int val, TreeNodes left, TreeNodes right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Leet_1339 {

    long MOD = 1000000007L;
    long ans = 0;

    private static long dfs(TreeNode node) {
        if (node == null)
            return 0;

        node.val += dfs(node.left) + dfs(node.right);
        return node.val;
    }

    public static int maxProduct(TreeNode root) {
        long total = dfs(root);

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            if (node == null)
                continue;

            long cur = (total - node.val) * node.val;
            ans = Math.max(ans, cur);

            if (node.left != null)
                q.add(node.left);
            if (node.right != null)
                q.add(node.right);
        }

        return (int) (ans % MOD);
    }

    public static void main(String[] args) {
        TreeNodes root = new TreeNodes(1,
                new TreeNodes(2),
                new TreeNodes(3));

        System.out.println(maxProduct(root)); // Expected output: 9
    }
}