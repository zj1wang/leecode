package simple.最大子序和_动态规划;

/*
* 给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。

子数组 是数组中的一个连续部分。

*/
//动态规划
//假设 \textit{nums}nums 数组的长度是 nn，下标从 00 到 n-1n−1。
//
//        我们用 f(i)f(i) 代表以第 ii 个数结尾的「连续子数组的最大和」，那么很显然我们要求的答案就是：
//
//        作者：LeetCode-Solution
//        链接：https://leetcode.cn/problems/maximum-subarray/solution/zui-da-zi-xu-he-by-leetcode-solution/
//        来源：力扣（LeetCode）
//        著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

//动态规划，数组记录，等差关系；
class Solution1 {
    public int maxSubArray(int[] nums) {
        //1. 存储
        int[] max = new int[nums.length];
        int maxReturn = nums[0];
        //2. 变量填充存储
        //max[i] = Max{max[i-1]+nums[i],nums[i]}
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                max[i] = nums[0];
            } else {
                max[i] = Math.max(max[i - 1] + nums[i], nums[i]);
            }

        }
        for (int maxi :
                max) {
            if (maxi > maxReturn)
                maxReturn = maxi;
        }

        return maxReturn;
    }
}
//优化存储，无需保留所有i
class Solution2 {
    public int maxSubArray(int[] nums) {
        int pre = 0;
        int maxReturn = nums[0];
        //max[i] = Max{max[i-1]+nums[i],nums[i]}
        for (int i = 0; i < nums.length; i++) {
            pre = Math.max(pre + nums[i], nums[i]);
            maxReturn = Math.max(maxReturn, pre);

        }
        return maxReturn;
    }
}

