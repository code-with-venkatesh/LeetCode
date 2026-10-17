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
    public void reorderList(ListNode head) {
        if(head==null){
            return;
        }
        //find mid
        //reverse the listnode
        //merge

        ListNode slow = head, fast=head;
        while(fast!=null && fast.next!= null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev= null, curr=slow, temp;
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;

        }
        ListNode First = head, second = prev;
        while(second.next!=null){
            
            temp=First.next;
            First.next=second;
            First=temp;

            temp=second.next;
            second.next=First;
            second=temp;
        }
        
    }
}