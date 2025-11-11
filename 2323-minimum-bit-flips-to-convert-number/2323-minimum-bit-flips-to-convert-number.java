class Solution {
    public int minBitFlips(int start, int goal) {
        int fb = start ^ goal, i = 0;
        while( fb > 0) {
          if((fb & 1) == 1)i++;
          fb = fb>>1;
        }
        return i;
    }
}