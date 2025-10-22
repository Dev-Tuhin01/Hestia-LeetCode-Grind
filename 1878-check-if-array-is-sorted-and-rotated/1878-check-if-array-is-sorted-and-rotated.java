class Solution {
    public boolean check(int[] nums) {
      if(nums.length == 1) return true;
      int i = 1;
      while(i < nums.length){
        if(nums[i - 1] > nums[i]) break;
        i++;
      }

      int pivot = nums[0];

        // System.out.println(i);
      while(i < nums.length - 1) {
        if(pivot < nums[i] || nums[i + 1] < nums[i]) return false;
        // System.out.println(i);
        i++;
      }
      if(i < nums.length && pivot < nums[i]) return false;


      return true;
    }
}