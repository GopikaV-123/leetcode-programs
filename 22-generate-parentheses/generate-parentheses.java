class Solution {
     List<String>res = new ArrayList<>();
    public List<String> generateParenthesis(int n) { 
        generate(0,0,n,"");
        return res;
    }
    public void generate(int ob, int cb, int n, String r){
        if(r.length() == n * 2){
            res.add(r);
            return ;
        }
        if(ob < n)
            generate(ob+1, cb, n, r+"(");
        if(cb < ob)
            generate(ob, cb+1, n, r+")");
    }
}