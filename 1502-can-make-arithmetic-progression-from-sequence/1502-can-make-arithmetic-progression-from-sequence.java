class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        long previousDiff =  arr[1] - arr[0];
        for (int i = 0,j=arr.length-1; i < arr.length-1; i++,j--) {
            if ((previousDiff != (arr[i+1] - arr[i])) || ((previousDiff != (arr[j] - arr[j-1])))) {
                return false;
            }
        }
        return true;
    }
}