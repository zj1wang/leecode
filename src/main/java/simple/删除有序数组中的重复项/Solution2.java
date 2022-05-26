package simple.删除有序数组中的重复项;

/*
* 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。

不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。

元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。



来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/remove-element
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
//双指针，刷新

class Solution2 {
    public int removeElement(int[] nums, int val) {
        int p = 0 ;
        int q ;
        for (q = 0; q < nums.length ; q++) {
            if(nums[q]!=val){
                nums[p] =nums[q];
                p++;
            }

        }
        return p;

    }
}
