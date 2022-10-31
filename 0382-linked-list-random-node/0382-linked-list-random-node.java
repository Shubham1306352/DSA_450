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
  ListNode h;
    int size;
    ArrayList<Integer>list;
    public Solution(ListNode head) {
   this.h=head;
        this.size=0;
        this.list=new ArrayList<>();
        ListNode tmp=head;
        while(tmp!=null)
        { 
        list.add(tmp.val);
            size++;
            tmp=tmp.next;
        }
        
        
        
    }
    
    public int getRandom() {
      int n=(int)(Math.random()*(size))+0;
        return list.get(n);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */