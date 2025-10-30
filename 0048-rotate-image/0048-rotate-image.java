class Solution {
  public void rotate(int[][] matrix) {
    short n = (short) matrix.length,i,j;
    int temp;
    for (i = 0; i < n; i++) {
      for (j = 0; j < n - i - 1; j++) {
        temp = matrix[i][j];
        matrix[i][j] = matrix[n - j - 1][n - i - 1];
        matrix[n - j - 1][n - i - 1] = temp;
      }
    }

    for (i = 0; i < n / 2; i++) {
      for (j = 0; j < n; j++) {
        temp = matrix[i][j];
        matrix[i][j] = matrix[n - i - 1][j];
        matrix[n - i - 1][j] = temp;
      }
    }
  }
}