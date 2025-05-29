class Solution {
    public boolean isPalindrome(int x) {
      int temp=x;
      if(x<0){
        return false;
      }
      int res=0;
      int a;
      while(temp!=0) {
        a=temp%10;
        res=res*10+a;
        temp=temp/10;
      }
      if(x==res){
        return true;
      } 
      return false;
    }
}