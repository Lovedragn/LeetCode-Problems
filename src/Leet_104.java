
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

class TreeNode2 {

    int val;
    TreeNode2 left;
    TreeNode2 right;

    TreeNode2(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class Leet_104 {

    static TreeNode root = null;
    static TreeNode2 root2 = null;

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

    public void add2(int val, TreeNode2 current) {
        if (null == current) {
            root2 = new TreeNode2(val);
            return;
        }
        Queue<TreeNode2> q = new LinkedList<>();
        q.add(current);
        while (!q.isEmpty()) {
            TreeNode2 cur = q.poll();

            if (cur.left == null) {
                cur.left = new TreeNode2(val);
                return;
            } else {
                q.add(cur.left);

            }
            if (cur.right == null) {
                cur.right = new TreeNode2(val);
                return;
            } else {
                q.add(cur.right);
            }
        }
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public boolean isSameTree(TreeNode p, TreeNode2 q) {
        if (p == null && q == null) {
            return true;
        }
        if (p != null && q != null) {
            if (q.val == p.val) {
                return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
            }
        }

        return false;
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    public static boolean mirror(TreeNode rot, TreeNode rot2) {
        if (rot == null && rot2 == null) {
            return true;
        }
        if (rot == null || rot2 == null) {
            return false;
        }

        return rot.val == rot2.val
                && mirror(rot.left, rot2.right)
                && mirror(rot.right, rot2.left);
    }

    public boolean isSymmetric(TreeNode root) {
        return mirror(root, root);
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }
        targetSum -= root.val;

        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);

    }

    public int rangeSumBST(TreeNode root, int low, int high) {

        return rangeSum(root, low, high);
    }

    public int rangeSum(TreeNode root, int low, int high) {

        if (root == null) {
            return 0;
        }
        if (root.val < low) {
            return 0;
        }
        if (root.val > high) {
            return 0;
        }
        return root.val + rangeSum(root.left, low, high) + rangeSum(root.right, low, high);

    }

    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return countNodes(root.left) + countNodes(root.right) + 1;
    }

    public boolean isCousins(TreeNode root, int x, int y) {
        if (root == null) {
            return false;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int ss = q.size();
            boolean foundx = false;
            boolean foundy = false;
            for (int i = 0; i < ss; i++) {
                TreeNode temproot = q.poll();
                if (temproot.val == x) {
                    foundx = true;
                }
                if (temproot.val == y) {
                    foundy = true;
                }
                if (temproot.left != null && temproot.right != null) {

                    if ((root.left.val == x && root.right.val == y) || (root.left.val == y && root.right.val == x)) {
                        return false;
                    }
                }
                if (temproot.left != null) {
                    q.offer(temproot.left);
                }
                if (temproot.right != null) {
                    q.offer(temproot.right);
                }
            }

            if (foundx && foundy) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Leet_104 tree = new Leet_104();
        tree.add2(1, root2);
        tree.add2(2, root2);
        tree.add2(3, root2);
        tree.add(4, root);

        System.out.println("Range Value? : " + tree.isCousins(root, 4, 3));
    }
}
