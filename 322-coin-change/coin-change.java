class Solution {
    public int coinChange(int[] coins, int amount) {
         int max = amount + 1;
        int[] a = new int[amount + 1];
        for (int i = 0; i <= amount; i++) {
            a[i] = max; 
        }
        a[0] = 0; 
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) {
                    a[i] = Math.min(a[i], a[i - coin] + 1);
                }
            }
        }
        if(a[amount] == max) {
            return -1;
        }
        return a[amount];
    }
}