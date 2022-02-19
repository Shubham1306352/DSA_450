// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String S = read.readLine();
            Solution obj = new Solution();
            System.out.println(obj.printSequence(S));
            
        }
    } 
} // } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String printSequence(String S) 
    { 
        // code here
        String [] arr = new String[]{"2","22","222","3","33","333","4","44","444","5","55",
        "555","6","66","666","7","77","777","7777","8","88","888","9","99","999","9999"};
        String ans="";
        int c=0;
        for(int i=0;i<S.length();i++)
        {
            
            if(S.charAt(i)==' ')
            ans+="0";
            else
            {
             c=S.charAt(i)-'A';
            ans+=arr[c];
        }            
        }
      return ans;   
    }
}