// { Driver Code Starts
// Initial template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            TreeSet<String> ans = new TreeSet<String>();
            ans = ob.allPossibleSubsequences(S);
            Iterator it = ans.iterator();
            if (ans.size() == 0) {
                System.out.print(-1);
            } else
                while (it.hasNext()) {
                    System.out.print(it.next() + " ");
                }
            System.out.println();
        }
    }
}// } Driver Code Ends


// User function template for Java
class Solution
{
static TreeSet<String> allPossibleSubsequences(String s) {
List<Integer> list=new LinkedList<>();
TreeSet<String> ts=new TreeSet<>();
int ep,i,j,num,t,first,last;
String vowelString="aeiouAEIOU";
t=s.length()-1;
ep=(int)Math.pow(2,s.length())-1;
for(num=1;num<=ep;num++)
{
for(i=s.length()-1;i>=0;i--)
{
j=num>>i;
if((j&1)==1) list.add(t-i);
}
if(list.size()>1)
{
first=list.get(0);
last=list.get(list.size()-1);
if(vowelString.indexOf(s.charAt(first))!=-1 && vowelString.indexOf(s.charAt(last))==-1) 
{
String r="";
for(int x:list)
{
r=r+s.charAt(x);
}
ts.add(r);
}
}
list.clear();
}
return ts;
    }
}