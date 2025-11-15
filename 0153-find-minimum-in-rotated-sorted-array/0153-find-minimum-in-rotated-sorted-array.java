class Solution {
  public int findMin(int[] nums) {
    if(nums.length == 1) return nums[0];
    if(nums[0] < nums[nums.length - 1]) return nums[0];

    int l = 1, r = nums.length - 1;
    while( l < r) {
      int m = (l+ r) / 2;
      if(nums[m] < nums[l - 1]) {
        if(nums[m - 1] > nums[m]) return nums[m];
        r = m - 1;
      } else {
        l = m + 1;
      }
    }
    return nums[r];
  }
}