class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int c=s.length;
        if(c==0) 
        return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int max=0;
        int cindex=c-1;
        int child=g.length-1;
        while(cindex >= 0 && child >=0) {
            if(s[cindex] >= g[child]) {
                max++;
                cindex--;
                child--;
            }
            else {
                child--;
            }
        }
        return max;
    }
}