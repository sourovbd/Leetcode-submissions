class Solution {
    public void moveZeroes(int[] nums) {
      int len = nums.length;
        int nonZeroCount = 0;
        List<Integer> list = new ArrayList<>();
        List<Integer> reOrderedList = new ArrayList<>();

        for (int j=0; j<len; j++) {
            list.add(nums[j]);
        }
        
        int listLen = list.size();
        for (int j=0; j<listLen; j++) {
            if (list.get(j) != 0) {
                reOrderedList.add(list.get(j));
                nonZeroCount++;
            }
        }
        for (int j=nonZeroCount; j<listLen; j++) {
            reOrderedList.add(0);
        }
        
        for (int j=0; j<len; j++) {
            nums[j] = reOrderedList.get(j);
        }
    }
}