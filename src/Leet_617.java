
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

    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        binaryTreePaths_temp(root, list, str);
        return list;
    }

    public static void binaryTreePaths_temp(TreeNode root, List<String> list, StringBuilder str) {
        if (root == null) {
            return;
        }
        int lens = str.length();
        if (lens > 0) {
            str.append("->");
        }
        str.append(root.val);
        if (root.left == null && root.right == null) {
            list.add(str.toString());

        } else {

            binaryTreePaths_temp(root.left, list, str);
            binaryTreePaths_temp(root.right, list, str);
        }

        str.setLength(lens);
    }
    public static TreeNode main = null;

    public static TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        }
        return root.val > val ? searchBST(root.left, val) : searchBST(root.right, val);
    }

    public static List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        average_temp(root, list);
        return list;
    }

    public static void average_temp(TreeNode root, List<Double> list) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();
            double temp = 0;
            for (int i = 0; i < size; i++) {
                TreeNode vals = q.poll();
                temp += vals.val;
                if (vals.left != null) {
                    q.offer(vals.left);
                }
                if (vals.right != null) {
                    q.offer(vals.right);
                }
            }

            Double half = temp / size;
            list.add(half);

        }

    }

    public static int res = Integer.MAX_VALUE;
    public static Integer prev = null;

    public static int minDiffInBST(TreeNode root) {

        minDiff_temp(root);
        return res;
    }

    public static void minDiff_temp(TreeNode root) {
        if (root == null) {
            return;
        }
        minDiff_temp(root.left);
        if (prev != null) {
            res = Math.min(res, Math.abs(root.val - prev));
        }
        prev = root.val;
        minDiff_temp(root.right);
    }

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {

        List<Integer> r1 = new ArrayList<>();
        List<Integer> r2 = new ArrayList<>();
        leafsimilar_temp(root1, r1);
        leafsimilar_temp(root2, r2);
     
        if (r1.equals(r2)) {
            return true;
        }
        return false;
    }

    public static void leafsimilar_temp(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            list.add(root.val);
            return;
        }

        leafsimilar_temp(root.left, list);
        leafsimilar_temp(root.right, list);

    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(10);
        root1.left = new TreeNode(7);
        root1.left.left = new TreeNode(5);
        root1.right = new TreeNode(11);

        TreeNode root2 = new TreeNode(10);
        root2.left = new TreeNode(7);
        root2.right = new TreeNode(5);
        root2.left.right = new TreeNode(11);

        System.out.println("Same  : ? " +( leafSimilar(root1 , root2) ? "True" : "false"));
    }

}
