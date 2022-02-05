// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Driverclass
{
    
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		   
		      head = new Solution().mergeSort(head);
		     printList(head);
		    System.out.println();
        }
    }
    public static void printList(Node head)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}


// } Driver Code Ends


//User function Template for Java
/*
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        this.data = key;
        next = null;
    }
} */

class Solution
{
    //Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head)
    {
        if(head==null||head.next==null)
        return head;
        
        Node middle=findmiddle(head);
        Node nexttomiddle=middle.next;
        middle.next=null;
        
        Node left=mergeSort(head);
         Node right=mergeSort(nexttomiddle);
        
        Node sortedlist=sorted(left,right);
        return sortedlist;
        
        
    }
    static Node findmiddle(Node head)
    {
      if(head==null)  
      return head;
      
      Node fast=head,slow=head;
      while(fast.next!=null&&fast.next.next!=null)
      {
          fast=fast.next.next;
          slow=slow.next;
      }
        return slow;
    
    }
     static Node sorted(Node left,Node right)
     {
         if(left==null)
         return right;
         
         if(right==null)
         return left;
         
         Node ans=null;
         if(left.data<=right.data)
         {
             ans=left;
             ans.next=sorted(left.next,right);
         }
         else
          {
             ans=right;
             ans.next=sorted(left,right.next);
          }
          return ans;
     }
    
    
    
    
    
    
    
    
    
    
}


