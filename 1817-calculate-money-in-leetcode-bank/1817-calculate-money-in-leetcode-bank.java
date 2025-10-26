class Solution {
    public int totalMoney(int n) {
      int sum = 0;
      for(int i = 0; i < n / 7; i++ ){
        sum += 28 + 7 * i;
        //System.out.println(sum);
      }   

      int rem = n % 7, incr = (n / 7);
      sum += ((rem * (rem + 1)) / 2) + rem * incr;
      return sum;
    }
}