/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // ListNode temp = head;
        // int len = 0;
        // while(temp != null){
        //     len++;
        //     temp = temp.next;
        // }
        // int target = len - n;
        // if(target == 0) return head.next;
        // ListNode prev = head;
        // for(int i = 0; i < target - 1; i++){
        //     prev = prev.next;
        // }
        
        // prev.next = prev.next.next;
        
        // return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;
        for(int i = 0; i < n; i++){
            fast = fast.next;
        }
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}