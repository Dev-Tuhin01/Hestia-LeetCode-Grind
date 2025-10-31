class Solution {
    public int[] getSneakyNumbers(int[] nums) {
      int idx = 0, n = nums.length - 2;
      boolean[] aux = new boolean[n];
      int[] ans = {0,0};

      for(int i : nums) {
        if(aux[i] && idx < 2) ans[idx++] = i;
        if(idx == 2) return ans;
        aux[i] = true;
      }

      return ans;
    }
}