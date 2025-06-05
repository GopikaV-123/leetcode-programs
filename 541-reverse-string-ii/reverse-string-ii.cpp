class Solution {
public:
    string reverseStr(string s, int k) {
         for (int i=0; i<s.length(); i=i+k+k){
            int j=i, m=j+k-1 ;
            while (j <= m){
                if (m>s.length()-1) m = s.length()-1 ;
                swap(s[j++], s[m--]) ;
            }
        }
        return s ;
    }
};