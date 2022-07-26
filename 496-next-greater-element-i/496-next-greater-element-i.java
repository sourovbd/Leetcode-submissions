class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    List<Integer> integerList = new ArrayList<>();
        boolean flag;
        for (int i=0; i<nums1.length; i++) {
            flag = false;
            for (int j=0; j<nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    if (j < nums2.length-1) {
                        for (int k=j+1; k<nums2.length; k++) {
                            if (nums2[k] > nums2[j]) {
                                integerList.add(nums2[k]);
                                flag = true;
                                break;
                            }
                        }
                    
                    } else {
                        integerList.add(-1);
                        flag = true;
                        break;
                    }
                }
            }
            if (!flag) {
                integerList.add(-1);
            }
        }
        return integerList.stream().mapToInt(Integer::intValue).toArray();
    }
}