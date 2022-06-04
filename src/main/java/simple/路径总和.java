package simple;

public class 路径总和 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }


    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if ( root == null) {
            return false;
        }
        targetSum = targetSum - root.val;

        if (isChild(root) && targetSum == 0) {
            return true;
        }

        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);

    }

    public boolean isChild(TreeNode node) {
        return node.left == null && node.right == null;
    }
}
