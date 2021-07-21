package leecode热门100题;

public class _142环形链表2 {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head,slow = head;
        while(true) {
            if(fast == null || fast.next == null) {
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                break;
            }
        }
        fast = head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}
