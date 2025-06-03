class Solution {
    public int arraySign(int[] nums) {
          int product=0;
        for(int i:nums) {
            if(i==0) {
                return 0;
            }
            else if (i<1){
               product++;
           }
        }
           if(product%2==0) {
            return 1;
           }
           else {
            return -1;
           }
    }
}