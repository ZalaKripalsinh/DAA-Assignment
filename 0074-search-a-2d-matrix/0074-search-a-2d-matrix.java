class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int lr = matrix.length;   // Row
        int lc = matrix[0].length;  // Column
        int low = 0;
        int high = (lr * lc) - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int row = mid / lc;
            int column = mid % lc;
            if (target > matrix[row][column]) {
                low = mid + 1;
            } else if (target < matrix[row][column]) {
                high = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}