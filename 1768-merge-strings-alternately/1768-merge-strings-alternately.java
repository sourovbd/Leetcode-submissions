class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int max = (len1 > len2) ? len1 : len2;
        StringBuilder sb = new StringBuilder();
        for (int i = 0, j = 0, k = 0; k < max; k++) {
            if (i > len1 - 1) {
                sb.append("");
            } else {
                sb.append(word1.charAt(i));
                i++;
            }
            if (j > len2 - 1) {
                sb.append("");
            } else {
                sb.append(word2.charAt(j));
                j++;
            }
        }
        return sb.toString().trim();
    }
}