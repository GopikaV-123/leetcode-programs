class Solution {
    public int titleToNumber(String columnTitle) {
      int result=0;
        for(int i=0;i<columnTitle.length();i++){
            char c=columnTitle.charAt(i);
            int val=c-64;
            result=result*26+val;
        }
        return result;

    }
}