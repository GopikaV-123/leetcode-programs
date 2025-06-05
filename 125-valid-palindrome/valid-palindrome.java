class Solution {
    public boolean isPalindrome(String s) {
         int l = 0;
        int e = s.length() - 1;

        while (l <= e) {
            if (!Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            } else if (!Character.isLetterOrDigit(s.charAt(e))) {
                e--;
            } else {
                char t1 = Character.toLowerCase(s.charAt(l));
                char t2 = Character.toLowerCase(s.charAt(e));
                if (t1 != t2) return false;
                l++;
                e--;
            }
        }
        return true;
    }
}