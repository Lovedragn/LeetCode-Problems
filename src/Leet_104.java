
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

    public static int minimal = Integer.MAX_VALUE;
    private int minDiff = Integer.MAX_VALUE;
    private Integer prev = null;
    private int maxDiameter = 0;
    private static int total = 0;

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

                    if ((temproot.left.val == x && temproot.right.val == y)
                            || (temproot.left.val == y && temproot.right.val == x)) {
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

    public int getMinimumDifference(TreeNode root) {
        if (root == null) {
            return minDiff;
        }

        // Inorder traversal to compare adjacent node values
        minDiff = getMinimumDifference(root.left);

        if (prev != null) {
            minDiff = Math.min(minDiff, Math.abs(root.val - prev));
        }
        prev = root.val; // Update previous node

        return getMinimumDifference(root.right);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        tempdiameter(root);
        return maxDiameter;
    }

    private int tempdiameter(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = tempdiameter(root.left);
        int rightDepth = tempdiameter(root.right);
        maxDiameter = Math.max(maxDiameter, leftDepth + rightDepth);

        return Math.max(leftDepth, rightDepth) + 1;
    }

    public int findTilt(TreeNode root) {
        findtiletemp(root);
        return total;
    }

    public int findtiletemp(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lt = findtiletemp(root.left);
        int rt = findtiletemp(root.right);
        int tilt = Math.abs(lt - rt);
        total += tilt;
        return root.val + lt + rt;
    }

    public int sumRootToLeaf(TreeNode root) {

        sumRootToLeafHelper(root, new StringBuilder());
        return total;
    }

    public static void sumRootToLeafHelper(TreeNode root, StringBuilder tempstr) {
        if (root == null) {
            return;
        }

        tempstr.append(root.val);
        if (root.left == null && root.right == null) {
            total += Integer.valueOf(tempstr.toString(), 2);

        } else {
            sumRootToLeafHelper(root.left, new StringBuilder(tempstr));
            sumRootToLeafHelper(root.right, new StringBuilder(tempstr));
        }
        return;
    }

    public boolean isSubtree(TreeNode root, TreeNode2 subRoot) {

        if (root == null) {
            return false;
        }
        if (sumroottree_temp(root, subRoot)) {
            return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static boolean sumroottree_temp(TreeNode root, TreeNode2 subroot) {
        if (root == null && subroot == null) {
            return true;
        }
        if (root.val != subroot.val || root == null || subroot == null) {
            return false;
        }

        return sumroottree_temp(root.left, subroot.left) && sumroottree_temp(root.right, subroot.right);
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int lt = isBalanced_temp(root.left);
        int rt = isBalanced_temp(root.right);

        if (Math.abs(lt - rt) <= 1 && isBalanced(root.left) && isBalanced(root.right)) {
            return true;
        }
        return false;
    }

    public static int isBalanced_temp(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return Math.max(isBalanced_temp(root.left), isBalanced_temp(root.right)) + 1;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorderTraversal(root, list);
        return list;
    }

    public static int inorderTraversal(TreeNode root, List<Integer> list) {
        if (root == null) {
            return 0;
        }
        inorderTraversal(root.left, list);
        list.add(root.val);
        inorderTraversal(root.right, list);

        return 0;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }

        return getBst(nums, 0, nums.length - 1);
    }

    public static TreeNode getBst(int arr[], int startIdx, int endIdx) {
        if (startIdx > endIdx) {
            return null;
        }

        int mid = (startIdx + endIdx) / 2;
        TreeNode bst = new TreeNode(arr[mid]);
        bst.left = getBst(arr, startIdx, mid - 1);
        bst.right = getBst(arr, mid + 1, endIdx);

        return bst;

    }

    private static List<Integer> list = new ArrayList<>();

    public static int sumNumbers(TreeNode root) {
        formation(root, new StringBuilder());
        int res = 0;
        for (int i : list) {
            res += i;
        }
        return res;
    }

    public static void formation(TreeNode root, StringBuilder newstr) {
        if (root == null) {
            return;
        }
        newstr.append(root.val);
        if (root.left == null && root.right == null) {
            list.add(Integer.parseInt(newstr.toString()));
        } else {
            formation(root.left,new StringBuilder( newstr));
            formation(root.right, new StringBuilder( newstr));
        }
        newstr.deleteCharAt(newstr.length() - 1);

    }

    public static void main(String[] args) {
        Leet_104 tree = new Leet_104();
        tree.add(4, root);
        tree.add(9, root);
        tree.add(0, root);
        tree.add(5, root);
        tree.add(1, root);
        // tree.add2(1, root2);
        // tree.add2(3, root2);
        // tree.add2(4, root2);
        System.out.println("Triversal ? " + (tree.sumNumbers(root)));
    }
}
