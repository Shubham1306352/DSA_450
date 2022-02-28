// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution ob = new Solution();
            
            System.out.println(ob.minFlips(S));
                        
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    public int minFlips(String S) 
    {
        int c1=0,c2=0;
   for(int i=0;i<S.length();i++)
   {
       if(i%2==0)
       {
           if(S.charAt(i)!='0')
           c1++;
           else
           c2++;
       }
       else
       {
           if(S.charAt(i)!='1')
           c1++;
           else
           c2++;
       }
   }
   if(c1<c2)
   return c1;
   else
   return c2;
        
    }
}