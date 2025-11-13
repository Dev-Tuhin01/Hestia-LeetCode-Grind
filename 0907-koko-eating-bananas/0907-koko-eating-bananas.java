class Solution {
  public int minEatingSpeed(int[] piles, int h) {
    int max = piles[0];
    int k;

    for (int i =0; i < piles.length; i++) {
      max = piles[i] > max ? piles[i] : max;
    }


    int left = 1, right = max;
    k = max;

    while (left <= right) {
      int mid = (left + right) / 2;
      int eatingTime = 0;
      for (int i : piles){
        eatingTime += (Math.ceil((double)i / mid));
      }
      if(eatingTime > h) {
        left = mid + 1;
      } else {
        k = mid;
        right = mid - 1;
      }
    }

    return k;
  }
}