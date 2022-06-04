package simple.平衡二叉树;


//递归：左高-右高《=1&&左高和又高都是平衡的

public class Solution {
    class TreeNode {
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

    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        return Math.abs((high(root.left) - high(root.right))) <= 1
                && isBalanced(root.left) && isBalanced(root.right);
    }

    private int high(TreeNode node) {
        if(node ==null){
            return 0;
        }
        return Math.max(high(node.right),high(node.left))+1;
    }


}


