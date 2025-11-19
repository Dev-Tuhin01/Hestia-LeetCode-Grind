class Solution {
  public String countAndSay(int n) {
    String RLE = "1";

    for(int i = 1; i < n; i++) {
      String t = "";
      char curr = RLE.charAt(0);
      int count = 0;
      System.out.println(RLE);
      for(char c: RLE.toCharArray()) {
        if(c == curr) count++;
        else {
          t += (count + "") + curr;
          curr = c;
          count = 1;
        }
      }

      t += (count + "") + curr;
      RLE = t;
      t = "";
    }
    
    return RLE;
  }
}
