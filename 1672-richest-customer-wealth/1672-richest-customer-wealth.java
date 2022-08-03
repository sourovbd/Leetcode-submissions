class Solution {
    public int maximumWealth(int[][] accounts) {
        int len2d = accounts.length;
        int max =0;
        for (int i=0; i<len2d; i++) {
            int[] arr = accounts[i];
            int len = arr.length;
            int sum=0;
            for (int j=0; j<len; j++) {
                sum = sum + arr[j];
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}