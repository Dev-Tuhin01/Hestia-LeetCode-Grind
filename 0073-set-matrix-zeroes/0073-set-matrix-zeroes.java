class Solution {
    public void setZeroes(int[][] matrix) {
      Boolean row1 = false, col1 = false;


      // marking rows and columns
      for(int i =0; i < matrix.length; i++) {
        for( int j = 0; j < matrix[i].length; j++) {
          if(matrix[i][j] == 0) {
            if(!row1 && i == 0) row1 = true;
            if(!col1 && j == 0) col1 = true;
            matrix[i][0] = 0;
            matrix[0][j] = 0;
          }
        }
      }

      for(int i = 1; i < matrix.length; i++) {
        for(int j = 1; j < matrix[i].length;j++) {
          if(matrix[i][0] == 0 || matrix[0][j] == 0) {
            matrix[i][j] = 0;
          }
        }
      }

      if(row1) {
        for(int i = 0; i < matrix[0].length; i++) {
          matrix[0][i] = 0;
        }
      }

      if(col1) {
        for(int i =0; i < matrix.length; i++) {
          matrix[i][0] = 0;
        }
      }

    }
}