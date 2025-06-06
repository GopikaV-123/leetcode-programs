class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
    String[] words=paragraph.toLowerCase().replaceAll("\\W+" , " ").split("\\s+");
        HashMap<String,Integer>h=new HashMap<>();
        for(String word:words){
           
            int count=h.getOrDefault(word,0);
            h.put(word,count+1);
        }
        for(int i=0;i<banned.length;i++){
            h.remove(banned[i]);
        }
        int mx=Integer.MIN_VALUE;
        String ans="";
        for(String m : h.keySet()){
            int p=h.get(m);
            if(p>mx){
                  ans=m;
                  mx=p;
            }
        }
        return ans;
    }
}