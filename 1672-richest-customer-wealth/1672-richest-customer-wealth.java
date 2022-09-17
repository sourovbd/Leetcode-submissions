class Solution {
    public int maximumWealth(int[][] accounts) {
        int len2d = accounts.length;
        int max =0;
        for (int i=0; i<len2d; i++) {
            int[] arr = accounts[i];
            int sum = Arrays.stream(arr).sum();
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}