class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
    String str1="";
         String str2="";
         String str3="";
        
        for (int i=0;i<firstWord.length();i++)
        {
           str1+=(firstWord.charAt(i)-'a');
            
        }
        for (int i=0;i<secondWord.length();i++)
        {
           str2+=(secondWord.charAt(i)-'a');
            
        }
        for (int i=0;i<targetWord.length();i++)
        {
           str3+=(targetWord.charAt(i)-'a');
            
        }
        
        if(Integer.parseInt(str1)+Integer.parseInt(str2)==Integer.parseInt(str3))
            return true;
        else
            return false;
        
        
    }
}