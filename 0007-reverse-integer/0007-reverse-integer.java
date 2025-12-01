class Solution {
    public int reverse(int x) {
        long ans = 0;
        boolean isNeg = (x < 0);
        x = Math.abs(x);
        while( x > 0) {
          ans = (ans * 10) + (x % 10);
          if((isNeg && -(ans) < Integer.MIN_VALUE) || ans > Integer.MAX_VALUE) return 0;
          // System.out.println(ans);
          x /= 10;
        }
        
        return isNeg ?(int) -(ans) :(int) ans;
    }
}