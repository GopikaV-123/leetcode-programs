class Solution {
    public String thousandSeparator(int n) {
        String result="";
        if(n==0)
        return "0";
        int total=0;
        while(n>0){
            int last = n%10;
            n=n/10;
            result=last+result;
            total+=1;
            if(total == 3 && n>0){
                result = "."+result;
                total=0;
                }
                }
                return result;
    }
}