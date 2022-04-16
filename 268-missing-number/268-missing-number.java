class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int min = 0;
        int max = len;
        int missingNumber = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=min; i<=max; i++) {
            map.put(i, 0);
        }

        for(int i=0; i<len; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            }
        }
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            if(entry.getValue() == 0)
                missingNumber = entry.getKey();
        }
        return missingNumber;
    }
}