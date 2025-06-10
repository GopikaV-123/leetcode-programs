class Solution {
    public int findMin(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int a=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[a]){
                    a=j;
                }
            }
            int temp=nums[i];
            nums[i]=nums[a];
            nums[a]=temp;
          }
          return nums[0];
    }
}