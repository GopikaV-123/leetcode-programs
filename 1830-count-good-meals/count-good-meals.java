class Solution {
    public int countPairs(int[] deliciousness) {
          int MOD = 1_000_000_007;
    int maxVal = 0;
    for (int i = 0; i < deliciousness.length; i++) {
        if (deliciousness[i] > maxVal) maxVal = deliciousness[i];
    }
    int maxSize = maxVal + 1;
    int[] freq = new int[maxSize];
    long count = 0;
    for (int i = 0; i < deliciousness.length; i++) {
        int val = deliciousness[i];
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