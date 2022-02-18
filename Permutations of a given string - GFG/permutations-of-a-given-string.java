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
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                System.out.print(ans.get(i)+" ");
            }
            System.out.println();
                        
        }
	}
}

// } Driver Code Ends


class Solution {
    public List<String> find_permutation(String S) {
        // Code here
        
        ArrayList<String>list=new ArrayList<>();
       allpermutation(S,0,S.length()-1,list);
       Collections.sort(list);
       return list;
    }
    
    
    
   
    
         void allpermutation(String S,int start,int end,ArrayList<String>list)
     {
          char ch;
         if(start==end)
         {
             list.add(S);
             return ;
         }
         for(int i=start;i<=end;i++)
         {
              S = swap(S,start,i); 
             allpermutation(S,start+1,end,list);
             S = swap(S,start,i); ;
         }
          
     }
     
     String swap(String S , int i , int g)
    {
        char ch[] = S.toCharArray();
        char m = ch[i];
        ch[i] = ch[g];
        ch[g] = m;
        return String.valueOf(ch);
    }
    
}