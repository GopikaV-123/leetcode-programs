class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
         int ans[] = new int[2];
        int n=grid.length;
        int size = n*n;
        int freq[] = new int[size+1];

        for(int i=0; i<n; i++){
            for(int j=0;j<n; j++){
                freq[grid[i][j]]++;
            }
        }

        for(int i=0; i<freq.length; i++){
            if(freq[i]==2) ans[0] = i;
            if(freq[i] == 0) ans[1] = i;
        }
        return ans;
    }
}