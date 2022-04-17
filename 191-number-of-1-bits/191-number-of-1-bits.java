public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
       String bin = Integer.toBinaryString(n);
        int count = bin.length()-bin.replace("1","").length();
        return count;
    }
}