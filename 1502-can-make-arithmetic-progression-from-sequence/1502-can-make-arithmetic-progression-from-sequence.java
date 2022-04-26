class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        long previousDiff =  arr[1] - arr[0];
        long diff;
        long diff2;
        for (int i = 0,j=arr.length-1; i < arr.length-1; i++,j--) {
            diff = arr[i+1] - arr[i];
            diff2 = arr[j] - arr[j-1];
            if ((previousDiff != diff) || ((previousDiff != diff2))) {
                return false;
            }
        }
        return true;
    }
}