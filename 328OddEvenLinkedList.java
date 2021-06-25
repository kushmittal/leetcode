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
    public ListNode oddEvenList(ListNode head) {
        
        if(head == null){
            return null;
        }
        if(head.next == null || head.next.next == null){
            return head;
        }
      
        ListNode evenHead = head.next;
        ListNode oddHead = head;
        ListNode evenFirst = evenHead;
        
       while(evenHead != null){
            oddHead.next = evenHead.next;
            if(oddHead.next != null){
                oddHead = oddHead.next;
            }
            
            evenHead.next = oddHead.next;
            evenHead = evenHead.next; 
        }
        oddHead.next = evenFirst;
        return head;
   }
}
