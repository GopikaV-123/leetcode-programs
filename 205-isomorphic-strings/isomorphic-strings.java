class Solution {
    public boolean isIsomorphic(String s, String t) {
     if(s.length() != t.length()) return false;
     int[] a=new int[256];
     int[] b=new int[256];
      for (int i = 0; i < s.length(); i++) {
        char c1 = s.charAt(i);
        char c2 = t.charAt(i);

        if (a[c1] == 0 && b[c2] == 0) {
            a[c1] = c2;
            b[c2] = c1;
        } 
        else {
            if (a[c1] != c2 || b[c2] != c1) {
                return false;
            }
        }
    }
    return true;
    }
}