class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==0){
            return 0;
        }
        if(n==1){
            return nums[0];
        }
        int count= 0;
        int last = nums[0];
        int res = 0;
        for(int i=1;i<n;i++){
            res = Math.max(nums[i]+count,last);
            count = last;
            last = res;
        }
        return res;
    }
}