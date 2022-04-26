class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int previousDiff =  arr[1] - arr[0];

        for (int i = 0; i < arr.length-1; i++) {
            int diff = arr[i+1] - arr[i];
            if ((previousDiff != diff)) {
                return false;
            }
        }
        return true;
    }
}