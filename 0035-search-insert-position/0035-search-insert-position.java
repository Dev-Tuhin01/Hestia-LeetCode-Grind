class Solution {
    public int searchInsert(int[] nums, int target) {
      // System.out.print(nums[nums.length] - 1)
      if(nums[0] > target) return 0;
      if(nums[nums.length - 1] < target) return nums.length;

      int left = 0, right = nums.length - 1;
      // System.out.println(left + "," + right);

      while(left <= right) {
        int mid = (left + right) / 2;
        // System.out.println(mid);
        if(nums[mid] == target) return mid;
        if(nums[mid] < target && target < nums[mid+1]) {
          return mid + 1;
        } else if( target > nums[mid]) {
          left = mid + 1;
        } else {
          right = mid - 1;
        }
      }

      return left + 1;
    }
}