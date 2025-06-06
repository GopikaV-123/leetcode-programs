class Solution {
    public int mostFrequentEven(int[] nums) {
       int result = -1;
        int maxCount = 0;
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            if (current % 2 != 0) continue;
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == current) {
                    count++;
                }
            }
            if (count > maxCount || (count == maxCount && current < result)) {
                maxCount = count;
                result = current;
            }
        }
        return result; 
    }
}