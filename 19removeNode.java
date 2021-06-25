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
        
        if(head == null){
            return null;
        }
        if(head.next == null){
            return null;
        }
        
        int j = n;
        ListNode end = head;
        ListNode res = head;
        while(j != 0){
            end = end.next;
            j--;
        }
        
     if(end != null){
        while(end.next != null){
            end = end.next;
            head=head.next;
        }  
         head.next = head.next.next;
         return res;
     }  else {
         head=head.next;
         return head;
     } 

        
  }
}
