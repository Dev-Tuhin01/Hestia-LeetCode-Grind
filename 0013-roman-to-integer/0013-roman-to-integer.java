class Solution {
    public int romanToInt(String s) {
      HashMap<Character,Integer> map = new HashMap<Character,Integer>();
      int n = 0;
      map.put('I',1);
      map.put('V',5);
      map.put('X',10);
      map.put('L',50);
      map.put('C',100);
      map.put('D',500);
      map.put('M',1000);

      for(int i =0; i < s.length(); i++) {
        //System.out.println(s.charAt(i) + ", n =" + n);
        if(s.charAt(i) == 'I' && (i+1) < s.length()) {
          if(s.charAt(i + 1) == 'X') {
            n+= 9;
            i++;
          } else if(s.charAt(i + 1) == 'V' ) {
            n += 4;
            i++;
          } else {
            n += 1;
          }
        } else if(s.charAt(i) == 'X' && (i + 1) < s.length()) {
          if(s.charAt(i + 1) == 'C'){
            n += 90;
            i++;
          } else if(s.charAt(i + 1) == 'L') {
            n += 40;
            i++;
          } else {
            n += 10;
          }
        } else if( s.charAt(i) == 'C' && (i + 1) < s.length()) {
          if(s.charAt(i + 1) == 'M') {
            n += 900;
            i++;
          } else if(s.charAt(i + 1) == 'D') {
            n += 400;
            i++;
          } else {
            n+= 100;
          }
        } else {
          n += map.get(s.charAt(i));
        }
      }
      return n;
    }
}