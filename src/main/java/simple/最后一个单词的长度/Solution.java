package simple.最后一个单词的长度;


/*
* 给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中 最后一个 单词的长度。

单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。



来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/length-of-last-word
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
* */

/*
标签：字符串遍历
从字符串末尾开始向前遍历，其中主要有两种情况
第一种情况，以字符串"Hello World"为例，从后向前遍历直到遍历到头或者遇到空格为止，即为最后一个单词"World"的长度5
第二种情况，以字符串"Hello World "为例，需要先将末尾的空格过滤掉，再进行第一种情况的操作，即认为最后一个单词为"World"，长度为5
所以完整过程为先从后过滤掉空格找到单词尾部，再从尾部向前遍历，找到单词头部，最后两者相减，即为单词的长度
时间复杂度：O(n)，n为结尾空格和结尾单词总体长度

作者：guanpengchn
链接：https://leetcode.cn/problems/length-of-last-word/solution/hua-jie-suan-fa-58-zui-hou-yi-ge-dan-ci-de-chang-d/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
* */

public class Solution {
    public int lengthOfLastWord(String s) {
        //双指针，从后向前
        int end = s.length() - 1;
        int start;
        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }
        if (end < 0) return 0;
        start = end;
        while (start >= 0 && s.charAt(start) != ' ') {
            start--;
        }
        return end - start;
    }
}
