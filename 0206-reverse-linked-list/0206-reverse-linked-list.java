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
    public ListNode findKthNode(ListNode temp , int k){
        while(temp!=null&&k>1){
            temp = temp.next ;
            k-- ;
        } 
        return temp ;
    }
    public ListNode reverseList(ListNode head){
        if(head==null||head.next==null) return head ;
        ListNode temp = head ;
        ListNode prev = null ;
        while(temp!=null){
        ListNode front = temp.next ;
        temp.next = prev ;
        prev = temp ;
        temp = front ;
        }
        return prev ;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
    ListNode temp = head ;
    ListNode prevNode = null ;
    while(temp!=null){
    ListNode KthNode = findKthNode(temp,k) ;
    if(KthNode == null){
        if(prevNode!=null) prevNode.next = temp ;
        break ;
    }
    ListNode nextNode = KthNode.next ;
    KthNode.next = null ;
    reverseList(temp) ;
    if(temp==head) head = KthNode  ;
    else{
        prevNode.next = KthNode ;
    }
    prevNode = temp ;
    temp = nextNode ;
    }   
    return head ;
    }
}