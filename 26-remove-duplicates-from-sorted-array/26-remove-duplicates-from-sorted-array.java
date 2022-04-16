class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0; // point to previous
        int j = 1; // point to current

        while (j < nums.length) {
            if (nums[j] == nums[i]) {
                j++;
            } else {
                i++;
                nums[i] = nums[j];
                j++;
            }
        }
        return i+1;
    }
}