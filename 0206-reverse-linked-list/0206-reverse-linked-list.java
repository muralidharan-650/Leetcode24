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
    public ListNode reverseList(ListNode head) {
        ArrayList<ListNode> li=new ArrayList<>();
        ListNode temp;
        temp=head;
        if(head==null)
        {
            return head;
        }
        while(temp!=null)
        {
            li.add(temp);
            temp=temp.next;

        }
        for(int i=li.size()-1;i>0;i--){
             li.get(i).next = li.get(i - 1);
        }
        li.get(0).next=null;
        return li.get(li.size()-1);
    }
}