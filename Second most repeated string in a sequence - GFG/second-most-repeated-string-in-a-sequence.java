// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String arr[] = new String[n];
            for(int i = 0;i<n;i++)
                arr[i] = sc.next();
            
            Solution ob = new Solution();
            
            System.out.println(ob.secFrequent(arr, n));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    String secFrequent(String arr[], int N)
    {
        // your code here
        
        HashMap<String,Integer>hm=new HashMap<>();
        for(String s:arr)
        {
            if(hm.containsKey(s)==true)
            {
               hm.put(s,hm.get(s)+1) ;
            }
            else
            {
              hm.put(s,1);  
            }
        }
        int []ans=new int[hm.size()];
        
        int a=0;
        for(int i:hm.values())		
      {
         ans[a]=i;
         a++;
      } 
      Arrays.sort(ans);
      int maximum= ans[ans.length-1];
      
       int secondhighest=0;
        String str ="";
        for(String p : hm.keySet())
        {
        	if(hm.get(p)<maximum && hm.get(p)>secondhighest) 
        	{
        	    secondhighest=hm.get(p); 
        	    str=p;
            }
     }
        return str;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}