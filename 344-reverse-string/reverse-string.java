class Solution {
    public void reverseString(char[] s) {
         int len=s.length;
        for(int i=len-1,j=0;i>j;i--,j++){
            char t=s[i];
            s[i]=s[j];
            s[j]=t;
        }
    }
}