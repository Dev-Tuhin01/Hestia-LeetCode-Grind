class Solution {
    public void setZeroes(int[][] matrix) {
      HashSet<Integer> row = new HashSet<Integer>();
      HashSet<Integer> col = new HashSet<Integer>();

      for(int i = 0; i < matrix.length; i++) {
        for(int j = 0; j < matrix[0].length; j++) {
          if(matrix[i][j] == 0) {
            row.add(i);
            col.add(j);
          }
        }
      }

      for(int m : row ) {
        for(int i = 0; i < matrix[m].length; i++) {
          matrix[m][i] = 0;
        }
      }

      for(int n: col ) {
        for(int i = 0; i < matrix.length; i++ ) {
          matrix[i][n] = 0;
        }
      }
    }
}