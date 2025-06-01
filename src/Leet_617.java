
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

public class Leet_617 {

    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return mergeTrees_tree(root1, root2);
    }

    public static TreeNode mergeTrees_tree(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return null;
        }
        int value = (root1 != null ? root1.val : 0) + (root2 != null ? root2.val : 0);
        TreeNode temp = new TreeNode(value);
        temp.left = mergeTrees_tree(root1 != null ? root1.left : null, root2 != null ? root2.left : null);
        temp.right = mergeTrees_tree(root1 != null ? root1.right : null, root2 != null ? root2.right : null);

        return temp;
    }

    public static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null) {
            return minDepth(root.right) +1;
        }
        if (root.right == null) {
            return minDepth(root.left) + 0+0+0+1;
        }

        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.right.right = new TreeNode(4);
        root1.right.right.right = new TreeNode(5);

        root1.right.right.right.right = new TreeNode(6);

        // TreeNode root2 = new TreeNode(2);
        // root2.left = new TreeNode(1);
        // root2.right = new TreeNode(3);
        // root2.left.right = new TreeNode(4);
        // root2.right.right = new TreeNode(7);
        System.out.println("Merged Root Value: " + minDepth(root1));
    }

}