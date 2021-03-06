package simple.将有序数组转换为二叉搜索树;


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

//
//    给你一个整数数组 nums ，其中元素已经按 升序 排列，请你将其转换为一棵 高度平衡 二叉搜索树。
//
//        高度平衡 二叉树是一棵满足「每个节点的左右两个子树的高度差的绝对值不超过 1 」的二叉树。
//
//        来源：力扣（LeetCode）
//        链接：https://leetcode.cn/problems/convert-sorted-array-to-binary-search-tree
//        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
//二叉搜索树是平衡二叉树，中序遍历是递增的
//即要求二叉搜索树的高度平衡，是否可以唯一地确定二叉搜索树？答案仍然是否定的。

//确定平衡二叉搜索树的根节点之后，其余的数字分别位于平衡二叉搜索树的左子树和右子树中
//-------------递归,子数的根任然是平衡二×数
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {


    }
    public TreeNode helper(int[] nums,int left,int right){
        if(left>right){
            return null;
        }

        int mid  = (left+right)/2;
        TreeNode root = new TreeNode((nums[mid]));
        root.left = helper(nums,left,mid-1);
        root.right = helper(nums,mid+1,right);
        return root;
    }
}
