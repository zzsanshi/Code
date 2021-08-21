package 剑指Offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _06从头到尾打印链表 {
    public int[] reversePrint(ListNode head) {
        List<Integer> res = new ArrayList<>();
        while ( head != null) {
            res.add(head.val);
            head = head.next;
        }
        Collections.reverse(res);
        int[] ans = new int[res.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = res.get(i);
        }
        return ans;
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
