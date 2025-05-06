class Solution {
    public int lastStoneWeight(int[] stones) {
       int n=stones.length;
        if(n==1){
            return stones[0];
        }
        while(stones[n-2]>0){
            Arrays.sort(stones);
            stones[n-1]=Math.abs(stones[n-1]-stones[n-2]);
            stones[n-2]=0;
            Arrays.sort(stones);

            
        }
        
        return stones[n-1]; 
    }
}