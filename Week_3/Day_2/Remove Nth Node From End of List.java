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
        int sz= sizzz(head);
        if(sz==n)
        {
            head = head.next;
            return head;
        }
        else{
        ListNode tmp = head;
        int i=1;
        while(i < sz-n)
        {
            tmp= tmp.next;
            i++; //cnter
        }
        //at sz-n

        tmp.next = tmp.next.next;
        }
        return head;
    }
    public int sizzz(ListNode head)
    {
        int s=0;
        ListNode tmp= head;
        while(tmp !=null)
        {
            s++;
            tmp= tmp.next;
        }
        return s;
    }
}