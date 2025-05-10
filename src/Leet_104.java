
import java.util.*;

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class Leet_104 {

    static TreeNode root = null;

    public void add(int val, TreeNode current) {
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

    public void add2(int val, TreeNode current) {
        if (current == null) {
            root = new TreeNode(val);
            return;
        }
        if (current.val > val) {
            if (current.left == null) {
                current.val = val;
            }
            add2(val, current.left);
        } else if (current.val < val) {
            add2(val, current.right);
        }

    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }

    public static void main(String[] args) {
        Leet_104 tree = new Leet_104();
        tree.add(1, root);
        tree.add(2, root);
        tree.add(3, root);
        tree.add(4, root);
        tree.add(5, root);
        tree.add(6, root);
        tree.add(7, root);
        System.out.println("Max depth: " + tree.maxDepth(root));

    }
}
