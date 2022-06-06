package simple.最大子序和_动态规划;

import java.util.ArrayList;
import java.util.List;

//给你一棵二叉树的根节点 root ，返回其节点值的 后序遍历 。
public class 二叉树遍历 {

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

        class Solution {
            public List<Integer> postorderTraversal(TreeNode root) {

                ArrayList<Integer> list = new ArrayList<>();
                add(list,root);
                return list;

            }

            private void add(ArrayList<Integer> list, TreeNode root) {
                if(root==null){
                    return;
                }
                add(list,root.left);
                add(list,root.right);
                list.add(root.val);//后序

            }
        }
    }
}
