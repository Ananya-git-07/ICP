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
    public ListNode partition(ListNode head, int x) {
        ListNode left=new ListNode(-1);
        ListNode tail=left;
        ListNode right=new ListNode(-1);
        ListNode tailr=right;
        while(head!=null){
            if(head.val<x){
                tail.next=head;
                tail=tail.next;
            }
            else if(head.val>=x){
                tailr.next=head;
                tailr=tailr.next;
            }
            head=head.next;
        }
        tail.next=right.next;
        tailr.next=null;
        return left.next;
    }
}