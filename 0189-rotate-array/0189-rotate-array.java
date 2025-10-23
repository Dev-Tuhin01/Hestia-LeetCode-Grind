class Solution {
    public void rev(int[] n, int l, int r) {
      int temp;
      while(l < r) {
        temp = n[l];
        n[l] = n[r];
        n[r] = temp;
        l++;
        r--;
      }
    }
    public void rotate(int[] nums, int k) {
        // if(nums.length == 1 || k == 0) return ;
        int n = nums.length;
        k = k % n;
        rev(nums,0,n - k - 1);
        rev(nums, n - k, n - 1);
        rev(nums,0,n-1);
    }
}