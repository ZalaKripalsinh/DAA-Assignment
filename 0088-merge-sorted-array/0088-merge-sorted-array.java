class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = 0;

        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[k];
            k++;
        }

        for(int j=0; j<nums1.length; j++){
            int temp;
            for (int i = 0; i < nums1.length - 1; i++) {
                if (nums1[i] > nums1[i + 1]) {
                    temp = nums1[i];
                    nums1[i] = nums1[i + 1];
                    nums1[i + 1] = temp;
                }
            }
        }
    }
}