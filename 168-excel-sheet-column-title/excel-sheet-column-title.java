class Solution {
    public String convertToTitle(int columnNumber) {
         if (columnNumber-- ==0)
   return "";
   return convertToTitle(columnNumber/26)+(char)((columnNumber % 26)+'A');
    }
}