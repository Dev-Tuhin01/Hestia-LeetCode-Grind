class Solution {
    public int[] plusOne(int[] digits) {
        int k = digits.length - 1;
        digits[k]++;
        int carry = digits[k] / 10;;
        digits[k] %= 10;
        k--;

        while(carry != 0 && k >= 0) {
          digits[k] += carry;
          carry = digits[k] / 10;
          digits[k] %= 10;
          k--;
        }


        if(k == -1 && carry != 0) {
          System.out.println(k);
          int[] t = digits, a = new int[t.length + 1];
          a[0] = carry;
          for(int i = 1; i < a.length; i++){
            a[i] = t[i-1];
          }
          return a;
        }
        return digits;
    }
}