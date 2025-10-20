class Solution {
    public int strStr(String haystack, String needle) {
        for(int i = 0; i < haystack.length(); i++) {
          int k = 0, curr = i;
          while(i < haystack.length() && k < needle.length() && haystack.charAt(i) == needle.charAt(k)){
           // System.out.println(i + ""+haystack.charAt(i));
            i++;
            k++;
          }
          if(k == needle.length()) return curr;
          i = curr;
        }

        return -1;
    }
}