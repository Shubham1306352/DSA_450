// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            ArrayList<Long> arr = new ArrayList<Long>();
            for(int i = 0;i<n;i++)
                {
                    long x = sc.nextInt();
                    arr.add(x);
                }
            long m = sc.nextLong();
            
            Solution ob = new Solution();
            
    		System.out.println(ob.findMinDiff(arr,n,m));
        }
        
    }
}// } Driver Code Ends


//User function Template for Java
class Solution
{

public long findMinDiff (ArrayList<Long> a, long n, long m)
    {
      // your code here
        Collections.sort(a);
        long mindiffernce=Long.MAX_VALUE;
        for(long i=0;i+m-1<n;i++)
        {
         long last=i+m-1;
           if((a.get((int)last)-a.get((int)i))<mindiffernce)
            mindiffernce=a.get((int)last)-a.get((int)i);
            
        }
        return mindiffernce;
        
    }
}