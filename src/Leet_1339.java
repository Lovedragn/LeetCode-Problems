class TreeNodes {
    int val;
    TreeNodes left;
    TreeNodes right;

    TreeNodes() {}
    TreeNodes(int val) { this.val = val; }
    TreeNodes(int val, TreeNodes left, TreeNodes right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Leet_1339 {
    public static long max = 0;   // track max product
    public static long totalSum = 0; // total sum of tree

    public static int maxProduct(TreeNodes root) {
        // Step 1: compute total sum of tree
        totalSum = dfs(root);

        // Step 2: run helper to compute max product
        helper(root);

        // Step 3: return result modulo 1e9+7 (as per problem statement)
        return (int)(max % 1000000007);
    }

    // DFS to compute subtree sums
    public static int dfs(TreeNodes root) {
        if (root == null) return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        root.val = root.val + left + right; // overwrite with subtree sum
        return root.val;
    }

    // Helper to compute product for each subtree
    public static void helper(TreeNodes root) {
        if (root == null) return;
        // product = sum(subtree) * (totalSum - sum(subtree))
        long product = (long)root.val * (totalSum - root.val);
        max = Math.max(max, product);

        helper(root.left);
        helper(root.right);
    }

    public static void main(String[] args) {
        TreeNodes root = new TreeNodes(1,
            new TreeNodes(2),
            new TreeNodes(3)
        );

        System.out.println(maxProduct(root)); // Expected output: 9
    }
}