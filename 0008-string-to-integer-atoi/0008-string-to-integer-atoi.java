class Solution {
    public int myAtoi(String s) {
      s = s.trim();
      if(s.length() == 0) return 0;
      double n =0;
      boolean neg = false;
      if(s.charAt(0) == '-') neg = true;
      else if(s.charAt(0) == '+') neg = false;
      else if((s.charAt(0) - '0') >= 0 && (s.charAt(0) - '0') <= 9) n += (s.charAt(0) - '0');
      else return (int) n;

      for(int i = 1; i < s.length(); i++) {
        if((s.charAt(i) - '0') >= 0 && (s.charAt(i) - '0') <= 9) {
          n *= 10;
          n +=  (s.charAt(i) - '0');
          if( neg && n <= Integer.MIN_VALUE ) return Integer.MIN_VALUE;
          else if( !neg && n >= Integer.MAX_VALUE ) return Integer.MAX_VALUE;
        } else {
          break;
        }
      }

      return neg ? (int) (-(n)): (int) n;      
    }
}