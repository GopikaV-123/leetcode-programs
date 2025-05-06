class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morseArray = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
            "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
            "..-", "...-", ".--", "-..-", "-.--", "--.." };
    	
    	HashSet<String> ans = new HashSet<>();
    	
   
    	for(String word : words) {
    		
    		StringBuilder sb = new StringBuilder();
    		
    		for(char add : word.toCharArray()) {
    			
//    			Will get the morseArray index and then we will add it
    			int index =  add - 'a';
    			sb.append(morseArray[index]);	
			}
    		ans.add(sb.toString());
    	}
        return ans.size();
    }
}
