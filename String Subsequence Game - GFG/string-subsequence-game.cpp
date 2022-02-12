// { Driver Code Starts
// Initial Template for C++
#include <bits/stdc++.h>
using namespace std;

 // } Driver Code Ends
// User function Template for C++
class Solution {
  public:
    set<string> allPossibleSubsequences(string S) {
        // code here
        func("",0,S.length(),S);
       set<string> ans;
       for(int i=0;i<req.size();i++){
           if((req[i][0]=='a' || req[i][0]=='e' || req[i][0]=='i' || req[i][0]=='o'||req[i][0]=='u')  )
           {
               int n=req[i].size();
               if(req[i][n-1]!='a' and req[i][n-1]!='e' and req[i][n-1]!='i' and req[i][n-1]!='o' and req[i][n-1]!='u')
                   ans.insert(req[i]);
           }
       }
       return ans;
        
        
        
    }
    
    vector<string> req;
 void func(string t , int i , int n , string s){
     if(i==n){
        req.push_back(t);
        return ;
     }
  
   func(t,i+1,n,s);
   t+=s[i];
   func(t,i+1,n,s);
   
 }
    
    
    
};

// { Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        string S;
        cin >> S;
        Solution ob;
        set<string> ans = ob.allPossibleSubsequences(S);
        if (ans.size() == 0)
            cout << -1 << endl;
        else {
            for (auto i : ans) cout << i << " ";
            cout << endl;
        }
    }
    return 0;
}
  // } Driver Code Ends