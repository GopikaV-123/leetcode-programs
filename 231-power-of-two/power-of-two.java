class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1) return true;
        for(int i=0;i<31;i++){
        int a=(int) Math.pow(2,i);
        if(a==n) return true;
        }
        return false;
    }
}