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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int max=0;
        int min=1000000;
        int counter=0;
        ListNode temp=head;
        int a=temp.val;
        temp=temp.next;
        boolean check=false;
        while(temp.next!=null){
            int b=temp.val;
            int c=temp.next.val;
            if((b>c&&b>a)||(b<a&&b<c)){
                check=true;
                a=b;
                break;
            }

            temp=temp.next;
            a=b;
        }
        if(!check)
        return new int[]{-1,-1};
        check =false;
        temp=temp.next;

        while(temp.next!=null){
            int b=temp.val;
            int c=temp.next.val;
            counter++;
            if((b>c&&b>a)||(b<a&&b<c)){
                check=true;
                max+=counter;
                min=(int)Math.min(counter,min);
                counter=0;
                
            }
            
            a=b;
            temp=temp.next;
        }
        if(!check)
        return new int[]{-1,-1};
        return new int[]{min,max};
    }
}