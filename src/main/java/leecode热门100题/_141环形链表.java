package leecode热门100题;

public class _141环形链表 {
    public boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        while(true) {
            if(fast == null || fast.next == null) {
                return false;
            }
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                return true;
            }
        }
    }
}