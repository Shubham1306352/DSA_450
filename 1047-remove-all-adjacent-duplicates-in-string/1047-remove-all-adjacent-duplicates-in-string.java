class Solution {
    public String removeDuplicates(String s) {
          if(s.length() == 1)
            return s;
        

        
        StringBuilder res = new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            if(res.length() == 0 || s.charAt(i) != res.charAt(res.length()-1))
                res.append(s.charAt(i));
            else
                res.deleteCharAt(res.length()-1);
        }
        
        return res.toString();
        
        
    }
}