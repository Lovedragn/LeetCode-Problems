
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
            return minDepth(root.right) + 1;
        }
        if (root.right == null) {
            return minDepth(root.left) + 0 + 0 + 0 + 1;
        }

        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }

    public static List Inorder(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Inorder_temp(root, list);
        return list;
    }

    public static void Inorder_temp(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        Inorder_temp(root.left, list);
        list.add(root.val);
        Inorder_temp(root.right, list);

    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Preorder_temp(root, list);
        return list;
    }

    public static void Preorder_temp(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        Preorder_temp(root.left, list);
        Preorder_temp(root.right, list);
    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Postorder_temp(root, list);
        return list;
    }

    public static void Postorder_temp(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        if (root.right == null && root.left == null) {
            list.add(root.val);
            return;
        }
        Postorder_temp(root.left, list);
        if (root.left == null || root.right != null) {
            Postorder_temp(root.right, list);
        }

        list.add(root.val);

    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.left.right = new TreeNode(3);
        root1.left.right.right = new TreeNode(4);
        root1.right = new TreeNode(5);

        // TreeNode root2 = new TreeNode(2);
        // root2.left = new TreeNode(1);
        // root2.right = new TreeNode(3);
        // root2.left.right = new TreeNode(4);
        // root2.right.right = new TreeNode(7);
        System.out.println("Merged Root Value: " + postorderTraversal(root1));
    }

}
