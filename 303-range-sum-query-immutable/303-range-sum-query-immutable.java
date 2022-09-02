class NumArray {

   // In prefix sum array, simply store the sum of all indexes <= current index of nums array.
	//Example - nums[] = {3,1,2} then prefixSum[] = {3, 3+1, 3+1+2} i.e {3, 4, 6}.
	// now prefixSum[i] denotes the sum of all numbers till index i of nums array.
    int[] prefixSum;
    public NumArray(int[] nums) {
        prefixSum = new int [nums.length];
        
        prefixSum[0] = nums[0];
        for(int i=1; i<nums.length; i++) {
            prefixSum[i] = prefixSum[i-1] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
	//Simple logic for range sum i.e Sum till right - sum before left
        if (left == 0)
            return prefixSum[right];
        return prefixSum[right] - prefixSum[left-1];  
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */