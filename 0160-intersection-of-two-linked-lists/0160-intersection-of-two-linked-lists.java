/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    ListNode l1 = headA ;
    ListNode l2 = headB ;
    ListNode ans = null ;
    while(l1!=null&&l2!=null){
    if(l1==l2){
        ans = l1 ;
        break ;
    }
    l1 = l1.next ;
    l2 = l2.next ;
    if(l1==null&&l2==null) break ;
    if(l1==null) l1 = headB ;
    if(l2==null) l2 = headA ;
    } 
    return ans ;   
    }
}