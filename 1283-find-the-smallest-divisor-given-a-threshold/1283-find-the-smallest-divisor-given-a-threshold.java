class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int l = 1, r = nums[0];
        double sum = 0;
        for (int n : nums) {
            r = r < n ? n : r;
            sum += n;
        }

        if (sum <= threshold)
            return 1;
        if (nums.length == threshold)
            return r;

        while (l <= r) {
            int m = (l + r) / 2;
            sum = 0;
            for (int n : nums)
                sum += (n + m - 1) / m;
            if(sum <= threshold) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }
}