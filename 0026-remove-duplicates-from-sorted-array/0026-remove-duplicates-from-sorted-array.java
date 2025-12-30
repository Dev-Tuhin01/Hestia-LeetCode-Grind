class Solution {
    public int removeDuplicates(int[] nums) {
        int ind =0;
        for(int i = 1 ; i < nums.length ; i++ ) {
            if(nums[ind] != nums[i]) {
                nums[++ind] = nums[i];
            }
        }
        return ++ind;
    }
}