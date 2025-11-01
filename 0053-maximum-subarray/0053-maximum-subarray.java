class Solution {
    public int maxSubArray(int[] nums) {
      //if(nums.length == 1) return nums[0];
      int curr = 0, max = nums[0];
      for(int i = 0; i < nums.length; i++) {
        curr += nums[i];
        max = curr > max ? curr : max;
        curr = curr > 0 ? curr : 0;
      }

      return max;
    }
}