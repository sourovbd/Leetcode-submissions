class Solution {
    public boolean containsDuplicate(int[] nums) {
        // int len = nums.length;
        // Integer[] NUMS = Arrays.stream(nums).boxed().toArray( Integer[]::new );
        // Set<Integer> integerSet = Arrays.stream(NUMS).collect(Collectors.toSet());
        // int setLen = integerSet.size();
        // return (len==setLen) ? false : true;
        
        // return (Arrays.stream(nums).distinct().toArray().length == nums.length) ? false : true;
        
        // Map<Integer, Integer> map = new HashMap<>();
        // for (int num : nums) {
        //     if (map.containsKey(num)) {
        //         return true;
        //     }
        //     map.put(num, 1);
        // }
        // return false;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
        
    }
}