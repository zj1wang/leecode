package simple.搜索插入位置;
/*
给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。

请必须使用时间复杂度为 O(log n) 的算法。

来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/search-insert-position
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
* */

//
//标签：二分查找
//        如果该题目暴力解决的话需要 O(n)O(n) 的时间复杂度，但是如果二分的话则可以降低到 O(logn)O(logn) 的时间复杂度
class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1; // 注意
        while(left <= right) { // 注意
            int mid = left + (right -left) / 2; // 注意 防止溢出
            if(nums[mid] == target) { // 注意
                // 相关逻辑
                return mid;
            } else if(nums[mid] < target) {
                left = mid + 1; // 注意
            } else {
                right = mid - 1; // 注意
            }
        }
        // 相关返回值
        return left;
    }
}

