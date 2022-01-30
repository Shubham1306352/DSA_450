// { Driver Code Starts
import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
    
}
class GFG{
	static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
    public static void main(String args[]) throws IOException { 
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t > 0){
        
        	int n = sc.nextInt();
        
            Node head = new Node(sc.nextInt());
            Node tail = head;
        
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
        
            Solution ob = new Solution();
            head = ob.reverseList(head);
            printList(head); 
            t--;
        }
    } 
} 
   // } Driver Code Ends


//function Template for Java

/* linked list node class:

class Node {
    int value;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

*/
/* Using Iteration 
class Solution
{
    
    Node reverseList(Node head)
    {
        
      if(head==null || head.next==null)
        return head ;
    
    Node previous=head;
    Node current=head.next;
    while(current!=null)
    {
        Node next=current.next;
        current.next=previous;
        
        previous=current;
        current=next;
        
        
    }
    head.next=null;
    head=previous;
    
    return head;
 
 
 
 */  
 
 
 /*Recursive approach */      
        class Solution
  {
    
    Node reverseList(Node head)
    {
      if(head==null||head.next==null)
      return head;
      
      Node NewHead=reverseList(head.next);
     head.next.next=head;
     head.next=null;
     
     return NewHead;
        
        
        
        
        
        
        
        
        
        
    }
}
