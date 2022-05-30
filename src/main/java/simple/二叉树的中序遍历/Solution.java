package simple.二叉树的中序遍历;


import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个二叉树的根节点 root ，返回 它的 中序 遍历 。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * 输入：root = [1,null,2,3]
 * 输出：[1,3,2]
 */


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

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> returnList = new ArrayList<>();

        minGet(root, returnList);
        return returnList;

    }

    private void minGet(TreeNode treeNode, List<Integer> returnList) {
        if(treeNode ==null){
            return;
        }

            minGet(treeNode.left, returnList);
        returnList.add(treeNode.val);
            minGet(treeNode.right, returnList);

    }
}
