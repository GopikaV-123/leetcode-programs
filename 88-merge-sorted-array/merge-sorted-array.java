class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
         int[] k = new int[m + n];
    int i = 0, j = 0;
    for (int a = 0; a < m + n; a++) {
        if (i < m && (j >= n || nums1[i] <= nums2[j])) {
            k[a] = nums1[i++];
        } else {
            k[a] = nums2[j++];
        }
    }
    for (int a = 0; a < m + n; a++) {
        nums1[a] = k[a];
    }
}
}