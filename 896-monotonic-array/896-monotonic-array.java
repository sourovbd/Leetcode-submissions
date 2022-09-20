class Solution {
    public boolean isMonotonic(int[] nums) {
        int len = nums.length;
        int countOfGreater = 0, countOfSmaller = 0;
        for (int currentIndex=0,nextIndex=1; currentIndex< len-1; currentIndex++,nextIndex++) {
            if (nums[currentIndex] > nums[nextIndex]) {
                countOfGreater++;
            } else if (nums[currentIndex] < nums[nextIndex]){
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