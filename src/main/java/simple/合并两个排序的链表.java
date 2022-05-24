/*输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。

示例1：

输入：1->2->4, 1->3->4
输出：1->1->2->3->4->4
限制：

0 <= 链表长度 <= 1000

来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/


public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //伪头节点
        ListNode mockHead = new ListNode(0);
        ListNode curr = mockHead;
//        双指针
        ListNode l1x = l1;
        ListNode l2x = l2;
        while (l1x!= null && l2x != null) {
            if (l1x.val <= l2x.val) {
                curr.next = l1x;
                l1x = l1x.next;
                curr = curr.next;
            } else {
                curr.next = l2x;
                l2x = l2x.next;
                curr = curr.next;
            }
        }
        if (l1x == null) {
            curr.next = l2x;
        } else {
            curr.next = l1x;
        }
        return mockHead.next;

    }
}
