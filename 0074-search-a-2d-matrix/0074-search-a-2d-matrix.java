class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      int left = 0, right = matrix.length - 1;
      while(left <= right) {
        int mid = (left + right) / 2;

        if(matrix[mid][0] == target) return true;
        else if(matrix[mid][0] < target) {
          if(mid + 1 == matrix.length ||  matrix[mid + 1][0] > target) {
            int l = 0, r = matrix[mid].length - 1;
            while(l <= r) {
              int m = (l + r) / 2;
              if(matrix[mid][m] == target) return true;
              else if(matrix[mid][m] < target) l = m + 1;
              else r = m - 1;
            }
            return false;
          } else {
            left = mid + 1;
          } 
        } else {
          right = mid - 1;
        }
      }

      return false;
    }
}