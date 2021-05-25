package 剑指;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */



public class _18删除链表的节点 {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode pre = head , cur = head;
        if ( head.val == val) {
            head = head.next;
            return head;
        }
        while(pre != null) {
            if (cur.val == val ) {
                pre.next = cur.next;
                return head;
            } else {
                pre = cur;
                cur = cur.next;
            }
        }
        return head;
    }
}
