class Solution {
    public int subarraySum(int[] nums, int k) {
      HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
      map.put(0,1);
      int count = 0, sum = 0;
      for(int i = 0; i < nums.length; i++) {
        sum += nums[i];
        count += map.containsKey(sum - k) ? map.get(sum-k) : 0;
        map.put(sum,map.getOrDefault(sum,0) + 1);
      }
      return count;
    }
}