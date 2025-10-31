class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
      List<Integer> ans = new ArrayList<Integer>();
      int left = 0, top = 0, bot = (matrix.length - 1), right = (matrix[0].length - 1);

      while( left <= right && top <= bot) {
        //top
        for(int i = left; i <= right; i++) {
          ans.add(matrix[top][i]);
        }
        top++;

        //right
        for(int i = top; i <= bot; i++) {
          ans.add(matrix[i][right]);
        }
        right--;

        //bottom
        for(int i = right;top <= bot && i >= left; i--) {
          ans.add(matrix[bot][i]);
        }
        bot--;

        //left
        for(int i = bot;left <= right && i >= top; i--) {
          ans.add(matrix[i][left]);
        }
        left++;
      }

      return ans;        
    }
}