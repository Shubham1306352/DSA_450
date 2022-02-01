// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestPalin(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static String longestPalin(String S)
 {
      
    
        String a="";
        String maximum="";
        int maximumindex=0;
        int index=0;
        for(int i=0;i<S.length();i++)
        {
            index=i;
            for(int j=i;j<S.length();j++)
            {
                a=a+S.charAt(j);
                
                if(ispalinedrome(a))
                {
                   if(a.length()>maximum.length())
                   {
                       maximum=a;
                       maximumindex=i;
                   }
                   if(a.length()==maximum.length())
                   {
                       if(maximumindex>index)
                       {
                       maximum=a;
                       }
                   }
                   
                }
                
            }
            a="";
        }
        return maximum;
    }
    static boolean ispalinedrome(String S)
    {
        for(int i=0,j=S.length()-1;i<=j;i++,j--)
        {
            if(S.charAt(i)!=S.charAt(j))
            {
                return false;
            }
            
        }
        return true;
    }
}