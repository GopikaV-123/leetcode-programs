class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int res=0;
        for(int i=1;i<=nums.length;i++)
        {
            res=Math.max(res,(Math.abs(nums[i-1]-nums[i%nums.length])));

        }
        return res;
    }
}