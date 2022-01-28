class Solution {
    public void reverseString(char[] s) {
      int n = s.length;
        char temp;
        for (int j=0;j<n/2;j++)  
          {
           temp=s[j];
            s[j]=s[n-1-j] ;
            s[n-1-j]=temp;
            
            }
       
          
    }
}