// { Driver Code Starts
import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}
class GfG
{
    public static void printList(Node node) 
    { 
        while (node != null)
        { 
            System.out.print(node.data);
            node = node.next; 
        }  
        System.out.println();
    } 
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Node head = new Node( s.charAt(0) - '0' );
                    Node tail = head;
                    for(int i=1; i<s.length(); i++)
                    {
                        tail.next = new Node( s.charAt(i) - '0' );
                        tail = tail.next;
                    }
                    Solution obj = new Solution();
                    head = obj.addOne(head);
                    printList(head); 
                }
        }
}// } Driver Code Ends


/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
} 
*/

class Solution
{
    public static Node reverse(Node head)
    {
        Node prevNode=null;
        Node currNode=head;
        Node nextNode=head;
        while(currNode!=null)
        {
          nextNode=currNode.next;
          currNode.next=prevNode;
          prevNode=currNode;
          currNode=nextNode;
        }
        head=prevNode;
        return head;

    }
    public static Node addOne(Node head) 
    { 
     Node newHead=reverse(head);
     Node curr=newHead;
     Node prev=null;
     int carry=0;
     Node orignal=newHead;
     while(curr!=null)
     {
         int sum=0;
         if(prev==null)
         {
          sum=curr.data+1;
         }
         else
         {
             sum=curr.data+carry;
         }
         carry=sum/10;
         curr.data=sum%10;
         prev=curr;
         curr=curr.next;
     }
     if(carry==1)
     { 
       Node t=new Node(1);
       prev.next=t;

     }
   return  reverse(orignal);
    }
}