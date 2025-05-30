class Solution {
    public int removeElement(int[] nums, int val) {
        int a=0;
        for(int i=0;i<=nums.length-1;i++) {
            if(nums[i]!=val){
               nums[a]=nums[i] ;
               a++;
            }
        }
        return a;
    }
}