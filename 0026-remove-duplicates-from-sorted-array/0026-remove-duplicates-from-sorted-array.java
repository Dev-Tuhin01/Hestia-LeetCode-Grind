class Solution {
    public int removeDuplicates(int[] nums) {
       int swap = 0;
       for(int i = 1; i < nums.length; i++) {
        if(nums[swap] != nums[i]) {
          swap++;
          nums[swap] = nums[i];
        }
       } 
       return swap + 1;
    }
}