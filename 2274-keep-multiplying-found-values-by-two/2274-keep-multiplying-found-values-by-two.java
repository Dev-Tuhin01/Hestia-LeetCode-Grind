class Solution {
    public int findFinalValue(int[] nums, int original) {
      Arrays.sort(nums);
      int left = 0, index = bSearch(nums,0, nums.length - 1, original), ans = original;

      while(index != -1) {
        ans *= 2;
        left = index + 1;
        index = bSearch(nums, left, nums.length - 1, ans); 
      }

      return ans;
    }

    public int bSearch(int[] arr,int left,int right,int target) {
      if(left > right) return -1;
      int mid = (left + right) / 2;
      if(arr[mid] == target) return mid;
      else if(arr[mid] < target) return bSearch(arr, mid + 1, right, target);
      else return bSearch(arr, left, mid - 1, target);
    }
}