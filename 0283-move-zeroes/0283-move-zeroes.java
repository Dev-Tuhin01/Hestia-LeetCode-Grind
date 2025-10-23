class Solution {
    public void moveZeroes(int[] nums) {
      if(nums.length == 1) return ;  
      int index = 0;
      while(index < nums.length && nums[index] != 0) index++;

      for(int i = index + 1; i < nums.length; i++) {
        if(nums[i] !=0){
          nums[index++] = nums[i];
          nums[i] = 0;
        }
      }
    }
}