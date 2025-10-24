class Solution {
    public int missingNumber(int[] nums) {
      boolean[] aux = new boolean[nums.length+1];
      for(int n : nums){
        aux[n] = true;
      }

      for(int i = 0; i < aux.length; i++) {
        if(!aux[i]) return i;
      }

      return nums.length;
    }
}