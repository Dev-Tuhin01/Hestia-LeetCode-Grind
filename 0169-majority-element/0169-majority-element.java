class Solution {
    public int majorityElement(int[] nums) {
      int curr = nums[0] , count = 1;
      for(int i = 1; i < nums.length; i++) {
        count += curr == nums[i] ? 1 : -1;
        if(count <= 0) {
          curr = nums[i];
          count = 1;
        } 
      }
      return curr;
    }
}