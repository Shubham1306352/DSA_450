class Solution {
    public boolean backspaceCompare(String s, String t) {
     StringBuilder sb1 = new StringBuilder(s);
     StringBuilder sb2 = new StringBuilder(t);
        int deletecount=0;
        
        for(int i=sb1.length()-1;i>=0;i--)
        {
            if(sb1.charAt(i)=='#')
            { 
                sb1.deleteCharAt(i);
                deletecount++;
            }
            else
            if(deletecount>0)
            {
               sb1.deleteCharAt(i); 
                deletecount--;
            }     
        }
        
        deletecount=0;
        
        for(int i=sb2.length()-1;i>=0;i--)
        {
            if(sb2.charAt(i)=='#')
            { 
                sb2.deleteCharAt(i);
                deletecount++;
            }
            else
            if(deletecount>0)
            {
               sb2.deleteCharAt(i); 
                deletecount--;
            }
            
               
        }
        
        

         if(sb1.toString().equals(sb2.toString()))
             return true;
        
         else
            return false; 

        
    }
}