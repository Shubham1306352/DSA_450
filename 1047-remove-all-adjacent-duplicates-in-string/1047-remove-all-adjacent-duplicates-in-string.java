class Solution {
    public String removeDuplicates(String s) {
          if(s.length() == 1)
            return s;
        

        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            if(sb.length() == 0 || s.charAt(i) != sb.charAt(sb.length()-1))
                sb.append(s.charAt(i));
            else
                sb.deleteCharAt(sb.length()-1);
        }
        
        return sb.toString();
        
        
    }
}