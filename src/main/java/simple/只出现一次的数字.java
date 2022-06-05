package simple;

import java.util.HashSet;

/*
给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。

说明：

你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？

来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/single-number
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
* */
//容器

public class 只出现一次的数字 {
    public int singleNumber(int[] nums) {

        HashSet<Integer> integers = new HashSet<>();
        for (int num:
             nums) {
            if(!integers.contains(num)){
                integers.add(num);

            }else {
                integers.remove(num);
            }

        }

        return integers.stream().findFirst().get();
    }
    //位运算
    public int singleNumber2(int[] nums) {
        int single = 0;
        for (int num:
             nums) {
            single = single^num;
        }
        return single;
    }

}


