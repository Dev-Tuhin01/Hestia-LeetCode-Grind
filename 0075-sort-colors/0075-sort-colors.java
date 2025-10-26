class Solution {
    public void sortColors(int[] nums) {
      int[] aux = new int[3];
      for(int i = 0; i < nums.length;i++) {
        aux[nums[i]]++;
      }

      int idx = 0;
      for(int i = 0; i < aux.length; i++) {
        int j = 1;
        while(j <= aux[i]){
          nums[idx++] = i;
          j++;
        }
      }
    }
}