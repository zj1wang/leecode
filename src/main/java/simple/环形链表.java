package simple;
//给你一个链表的头节点 head ，判断链表中是否有环。
//
//        如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。 为了表示给定链表中的环，评测系统内部使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。注意：pos 不作为参数进行传递 。仅仅是为了标识链表的实际情况。
//
//        来源：力扣（LeetCode）
//        链接：https://leetcode.cn/problems/linked-list-cycle
//        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。


import java.util.HashSet;

public class 环形链表 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

        //容器  n  n
        public boolean hasCycle(ListNode head) {
            HashSet<ListNode> listNodes = new HashSet<>();
            while (head != null) {
                if (listNodes.contains(head)) {
                    return true;
                }
                listNodes.add(head);
                head = head.next;
            }
            return false;

        }

        //快慢指针 n 1
        public boolean hasCycle1(ListNode head) {
            ListNode p1 = head;
            ListNode p2 = head.next;
            while (p1 != p2) {
                if(p1==null||p2==null){
                    return false;
                }
                p1 =p1.next.next;
                p2 = p2.next;

            }
            return true;

        }
    }

}
