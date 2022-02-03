// { Driver Code Starts
import java.io.*;
import java.util.*;
class Node 
{
    int data;
    Node next;
    
    Node(int a)
        {
            data = a;
            next = null;
        }
}
class GfG
{
    static Scanner sc = new Scanner(System.in);
    public static Node inputList(int size)
    {
        Node head, tail;
        int val;
        
        val = sc.nextInt();
        
        head = tail = new Node(val);
        
        size--;
        
        while(size-->0)
        {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }
        
        return head;
    }
    
    public static void printList(Node n)
    {
        while(n!=null)
        {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    
    public static void main(String args[])
        {
            
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n , m;
                    
                    n = sc.nextInt();
                    m = sc.nextInt();
                    
                    Node head1 = inputList(n);
                    Node head2 = inputList(m);
                    
                    Sol obj = new Sol();
                    
                    Node result = obj.findIntersection(head1, head2);
	    
	                printList(result);
	                System.out.println();
                }
        }
}// } Driver Code Ends


/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Sol
{
   public static Node findIntersection(Node head1, Node head2)
    {
        Node start=new Node(0);
        Node temp=start;
        Node h1=null;
        Node h2=null;
   
   
       for(h1=head1;h1!=null;h1=h1.next)
       {
           int c=0;
            for(h2=head2;h2!=null;h2=h2.next)
            {
                
               if(h1.data==h2.data && c==0)
               {
                Node ans= new Node(h1.data);
                temp.next=ans;
                temp=ans;
                c++;
               }
            }        
       }         
        temp.next=null;
        return start.next;
                
                
                
                
                
               
                
            }
           
       }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
   
        
        
        
        
        
        
        
        
        
        
        
        
        
