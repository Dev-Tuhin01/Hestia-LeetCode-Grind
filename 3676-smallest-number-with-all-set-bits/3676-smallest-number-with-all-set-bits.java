class Solution {
    public int smallestNumber(int n) {
        int bits = (int) Math.floor(Math.log(n) / Math.log(2)) + 1;
        return (int) Math.pow(2,bits) - 1;
    }
}