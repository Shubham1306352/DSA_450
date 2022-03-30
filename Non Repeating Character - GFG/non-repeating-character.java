// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String st = sc.next();
            
            char ans=new Solution().nonrepeatingCharacter(st);
            
            if(ans!='$')
            System.out.println(ans);
            else
            System.out.println(-1);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        
        //Your code here
        int n = S.length();
        int []chars = new int[256];
        Arrays.fill(chars,0);
        
        for(int i=n-1; i>=0; i--){
            chars[S.charAt(i)]++;
        }
        
        for(int i=0;i<n;i++){
            if(chars[S.charAt(i)] == 1){
                return S.charAt(i);
            }
        }
        return '$';
    }
}

