class Solution {
    public int reverse(int x) {
        int temp=x;
        int res=0;
      int a;
      while(temp!=0) {
        a=temp%10;
         if((res>Integer.MAX_VALUE/10)||(res<Integer.MIN_VALUE/10)){
                return 0;
            }
        res=res*10+a;
        temp=temp/10;
      }
      return res;
    }
}