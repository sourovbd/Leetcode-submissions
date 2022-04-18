class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int max = getMaxValue(nums);
        int maxIndex = 0;
        for(int i=1; i<nums.length; i++) {
            if(nums[i]==max) {
                maxIndex = i;
            }
        }
        for(int i=maxIndex; i>=2; i--) {
            if ((nums[i-2] + nums[i-1]) > nums[i]) {
                return nums[i-2] + nums[i-1] + nums[i];
            }
        }
        return 0;
    }

    public int getMaxValue(int[] nums) {
        int max = nums[0];
        for(int i=1; i<nums.length; i++) {
            if(nums[i]>max) {
                max = nums[i];
            }
        }
        return max;
    }
}