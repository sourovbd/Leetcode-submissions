class Solution {
    public int arraySign(int[] nums) {
        long multiplication = 1;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] < 0)
                nums[i] = -1;
            else if (nums[i] > 0 )
                nums[i] = 1;
            else if (nums[i] == 0)
                return 0;
        }
        return Arrays.stream(nums).reduce(1, (a,b) -> a * b);
    }
}