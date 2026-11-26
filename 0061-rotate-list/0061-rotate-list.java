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
     public ListNode findNthNode(ListNode head , int n){
    if(head==null) return head ;
    ListNode temp = head ;
    int count = 0 ; 
    while(temp!=null){
        count++ ;
        if(count==n) return temp ;
        temp = temp.next ;
    }
    return head ;
    }
    public ListNode rotateRight(ListNode head, int k) {
     if(head==null) return head ;    
    ListNode tail = head ;
    int len = 1 ;
    while(tail.next!=null){
    len++ ;
    tail = tail.next ;
    } 
    k = k%len ;
    if(k==0) return head ;
    tail.next = head ;
    ListNode NthNode = findNthNode(head,len-k) ;
    head = NthNode.next ;
    NthNode.next = null ;
    return head ;
    }
}