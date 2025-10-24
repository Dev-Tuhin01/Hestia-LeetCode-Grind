class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCone = 0, currOne = 0;

        for(int i = 0; i < nums.length; i++) {
          if(nums[i] == 1) {
            currOne++;
          } else {
            currOne = 0;
          }
          maxCone = maxCone > currOne ? maxCone : currOne;
        }

        return maxCone;
    }
}