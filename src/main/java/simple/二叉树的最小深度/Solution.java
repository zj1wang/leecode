package simple.二叉树的最小深度;

//给定一个二叉树，找出其最小深度。
//
//        最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
//
//        说明：叶子节点是指没有子节点的节点。
//
//递归
//某节点深度= min（子节点深度）+1
public class Solution {
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

    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int a = minDepth(root.left);
        int b = minDepth(root.right);
//        最小子数深度或者是某一个有值是子数+1
        if (root.left != null&& root.right!=null) {

            return Math.min(a, b) + 1;
        }else {
            return a+b+1;
        }
    }
}
