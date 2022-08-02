class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
       for (int j=0; j<len-1; j++) {
           for(int i=0; i<len-1; i++) {
               if(nums[i]==0) {
                   int temp = nums[i];
                   nums[i] = nums[i+1];
                   nums[i+1] = temp;
               }
           }
       }
    }
}