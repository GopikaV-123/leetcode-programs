class Solution {
    public int alternateDigitSum(int n) {
         int res = 0;
        for (int x = n; x > 0; x /= 10)
            res = x % 10 - res;
        return res;
    }
}