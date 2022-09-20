class Solution {
    public boolean isMonotonic(int[] nums) {
        int len = nums.length;
        int k = 0, l = 0;
        for (int i=0,j=1; i< len-1; i++,j++) {
            if (nums[i] > nums[j]) {
                k++;
            } else if (nums[i] < nums[j]){
                l++;
            } else {
                l++;
                k++;
                continue;
            }
        }
        return (((k+1)==len) || ((l+1)==len));
    }
}