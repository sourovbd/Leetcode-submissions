class Solution {
    public boolean isMonotonic(int[] nums) {
        int len = nums.length;
        int countOfGreater = 0, countOfSmaller = 0;
        for (int i=0,j=1; i< len-1; i++,j++) {
            if (nums[i] > nums[j]) {
                countOfGreater++;
            } else if (nums[i] < nums[j]){
                countOfSmaller++;
            } else {
                countOfGreater++;
                countOfSmaller++;
                continue;
            }
        }
        return (((countOfGreater+1)==len) || ((countOfSmaller+1)==len));
    }
}