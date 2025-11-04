class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 1) return nums[0] == target ? 0 : -1;
        int left = 0, right = nums.length-1,mid;
        while( left <= right) {
          mid = (left + right) / 2;
          if(nums[mid] == target){
            return mid;
          } else if(target > nums[mid]) {
            left = mid+1;
          } else {
            right = mid - 1;
          }          
        }
        return -1;
    }
}