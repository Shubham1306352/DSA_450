// { Driver Code Starts
import java.util.*;

class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}

class Is_LinkedList_Palindrom
{
	 Node head;  
	 Node tail;
	
	/* Function to print linked list */
    void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	
 
    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node) 
	{

		if (head == null) 
		{
			head = node;
			tail = node;
		} else 
		{
		    tail.next = node;
		    tail = node;
		}
    }
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		 
		while(t>0)
        {
			int n = sc.nextInt();
			//int k = sc.nextInt();
			Is_LinkedList_Palindrom llist = new Is_LinkedList_Palindrom();
			//int n=Integer.parseInt(br.readLine());
			int a1=sc.nextInt();
			Node head= new Node(a1);
            Node tail = head;
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
			    tail.next = new Node(a);
			    tail = tail.next;
			}
			
			Solution g = new Solution();
			if(g.isPalindrome(head) == true)
			    System.out.println(1);
		    else
			    System.out.println(0);
			t--;
		}
		
	}
}



// } Driver Code Ends


/* Structure of class Node is
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/

class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        //Your code here
        int size=0;
        Node tmp=head;
        while(tmp!=null)
        {
          size++;
          tmp=tmp.next;  
        }
        Node m=head;
        
        int i=0;
        while(i<size/2)
        {
        m=m.next;
        i++;
        }
        
        Node curr=head.next;
        Node prev=head;
        
        
        int j=1;
        while(j<size/2)
        {
           Node next=curr.next; 
            curr.next=prev;
            prev=curr;
            curr=next;
            
            j++;
        }
        head.next=null;
        head=prev;
        Node p=head;
        
        if(size%2!=0)
        m=m.next;
        
        while(m!=null&&p!=null)
        {
            if(m.data!=p.data)
            {
                return false;
                
            }
            m=m.next;
            p=p.next;
            
        }
        return true;
        
    }    
}