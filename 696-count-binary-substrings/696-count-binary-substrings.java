class Solution {
    public int countBinarySubstrings(String s) {
     
        int i=1,count=0,prev=0,curr=1;
        while(i<s.length())
        {
            if(s.charAt(i-1)!=s.charAt(i))
            {
                count+=Math.min(curr,prev);
                prev=curr;
                curr=1;   
            }
            else
            curr++;
            
            i++;
            
            
            
        }        
        return count+=Math.min(prev,curr);
        
    }
}