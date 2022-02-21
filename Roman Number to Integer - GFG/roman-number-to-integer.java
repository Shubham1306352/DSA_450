// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        // code here
        HashMap<Character,Integer>hs=new HashMap <>();
        hs.put('I',1);
        hs.put('V',5);
        hs.put('X',10);
        hs.put('L',50);
        hs.put('C',100);
        hs.put('D',500);
        hs.put('M',1000);
        int ans=0;
        if(str.length()==1)
        return hs.get(str.charAt(0));
        
        
        for(int i=str.length()-1;i>0;i--)
        {
            char m=str.charAt(i);
            char n=str.charAt(i-1);
            int a=hs.get(m);
            int b=hs.get(n);
            
            if(b<a&&i==str.length()-1)
            ans+=a-b;
            
            if(b<a&&i!=str.length()-1)
            ans-=b;
            
            if(b>a&&i==str.length()-1)
            ans+=a+b;
            
            if(b>a&&i!=str.length()-1)
            ans+=b;
            
             if(b==a&&i==str.length()-1)
            ans+=a+b;
            
            if(b==a&&i!=str.length()-1)
            ans+=a;
            
                
            }
            return ans;
        
    }
}