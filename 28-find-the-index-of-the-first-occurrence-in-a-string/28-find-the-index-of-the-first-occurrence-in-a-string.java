class Solution {
    public int strStr(String haystack, String needle) {
        int lengthOfHayStack = haystack.length();
        int lengthOfNeedle = needle.length();
        if (!haystack.contains(needle)) return -1;
        else {
            for (int i = 0; i <= lengthOfHayStack-lengthOfNeedle; i++) {
                String subStringOfHaystack = haystack.substring(i, i+lengthOfNeedle);
                System.out.println(subStringOfHaystack);
                System.out.println("needle: "+needle);
                if (subStringOfHaystack.equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }
}