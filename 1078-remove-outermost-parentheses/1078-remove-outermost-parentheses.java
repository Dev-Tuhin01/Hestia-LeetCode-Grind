class Solution {
    public String removeOuterParentheses(String s) {
      int level = 0;
      String ans = "";
      for(char c: s.toCharArray()) {
        if(c == '('){
          if(level > 0) ans += c;
          level++;
        } else {
          level--;
          if(level > 0) ans += c;
        }
      }
      return ans;
    }
}