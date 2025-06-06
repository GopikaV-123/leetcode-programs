class Solution {
    public String reverseVowels(String s) {
        String vow = "aeiouAEIOU"; 
        int l = 0, r = s.length() - 1;
        char[] arr = s.toCharArray(); 
        while (l < r) {
            while (l < r && vow.indexOf(arr[l]) == -1) {
                l++;
            }
            while (l < r && vow.indexOf(arr[r]) == -1) {
                r--;
            }
            if (l < r) {
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
        return new String(arr);
    }
}