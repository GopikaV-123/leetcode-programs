class Solution {
    public int hammingWeight(int n) {
        int k=0;
    for(int i=0;i<32;i++) {
        if((n&1)==1)
        k++;
        n=n>>1;
    }
    return k;
    }
}