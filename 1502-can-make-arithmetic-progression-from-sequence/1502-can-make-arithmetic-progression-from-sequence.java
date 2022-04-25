class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        long previousDiff =  arr[1] - arr[0];
        long diff;
        for (int i = 0; i < arr.length-1; i++) {
            diff = arr[i+1] - arr[i];
            if (previousDiff != diff) {
                return false;
            }
        }
        return true;
    }
}