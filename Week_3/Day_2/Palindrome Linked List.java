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
    public boolean isPalindrome(ListNode head) {
       //corner
       if(head == null || head.next == null)
       {
        return true;
       } 

       //1 
       ListNode m= midn(head);

       //2
       ListNode curr= m;
       ListNode prev=null;
       while(curr != null)
       {
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
       }
//imp
       ListNode right = prev;
       ListNode left = head;
       while(right != null)
       {
        if(right.val != left.val)
        {
            return false;
        }
        right = right.next;
        left = left.next;
       }
       return true;
    }

    public ListNode midn(ListNode head)
    {
        ListNode s=head;
        ListNode f= head;
        while(f != null && f.next != null)
        {
            s= s.next;
            f= f.next.next;
        }
        return s;
    }
}