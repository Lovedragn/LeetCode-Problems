import java.util.LinkedList;
import java.util.Queue;

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {

    }

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class Pair {
    int depth;
    TreeNode node;

    Pair(int depth, TreeNode node) {
        this.depth = depth;
        this.node = node;
    }
}

public class Leet_865 {

    public static TreeNode root;

    public static void add(int val, TreeNode current) {
        if (null == current) {
            root = new TreeNode(val);
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(current);
        while (!q.isEmpty()) {
            TreeNode cur = q.poll();

            if (cur.left == null) {
                cur.left = new TreeNode(val);
                return;
            } else {
                q.add(cur.left);

            }
            if (cur.right == null) {
                cur.right = new TreeNode(val);
                return;
            } else {
                q.add(cur.right);
            }
        }
    }

    public static void display(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }

    private static Pair dfs(TreeNode root) {
        if (root == null)
            return new Pair(0, null);

        Pair left = dfs(root.left);
        Pair right = dfs(root.right);

        if (left.depth > right.depth) {
            return new Pair(left.depth + 1, left.node);
        } else if (right.depth > left.depth) {
            return new Pair(right.depth + 1, right.node);
        } else {
            return new Pair(left.depth + 1, root);
        }
    }

    public static TreeNode subtreeWithAllDeepest(TreeNode root) {
        root = dfs(root).node;
        return root;
    }

    public static void main(String args[]) {
        add(3, root);
        add(5, root);
        add(1, root);
        add(6, root);
        add(2, root);
        add(0, root);
        add(8, root);
        add(7, root);
        add(4, root);
        subtreeWithAllDeepest(root);
        display(root);

    }
}
