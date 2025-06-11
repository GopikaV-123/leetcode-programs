class Solution {
    public int countPairs(int[] deliciousness) {
         int MOD = 1_000_000_007;
        int maxVal = 0;

        // Find max value in deliciousness
        for (int val : deliciousness) {
            if (val > maxVal) maxVal = val;
        }

        // Frequency array size: max possible deliciousness value + 1
        int maxSize = maxVal + 1;
        int[] freq = new int[maxSize];

        long count = 0;

        for (int val : deliciousness) {
            // Check for all powers of two up to max possible sum (maxVal * 2)
            for (int sum = 1; sum <= maxVal * 2; sum <<= 1) {
                int complement = sum - val;
                if (complement >= 0 && complement < maxSize) {
                    count += freq[complement];
                }
            }
            freq[val]++;
        }

        return (int) (count % MOD);
    }
}