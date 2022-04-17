class Solution {
    public int subtractProductAndSum(int n) {
        char[] chars = String.valueOf(n).toCharArray();
        int len = chars.length;
        int mul = 1;
        int sum = 0;
        for(int i=0; i<len; i++) {
            mul = mul * (chars[i]-48);
            sum = sum + (chars[i]-48);
        }
        int diff = mul - sum;
        return  diff;
    }
}