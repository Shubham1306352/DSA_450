class Solution {
    public boolean isPalindrome(int x) {
     
        String str=String.valueOf(x);
        char []ch=str.toCharArray();
        
        for(int i=0,j=ch.length-1;i<j;i++,j--)
        {
            if(ch[i]!=ch[j])
            {
                return false;
                
            }
            
            
            
        }
        return true ;
    }
}