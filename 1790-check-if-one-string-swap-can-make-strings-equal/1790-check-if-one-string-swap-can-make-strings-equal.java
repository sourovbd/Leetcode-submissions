class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
       int difference = 0;
        if (s1.equals(s2)) {
            return true;
        } else if (s1.length() != s2.length()) {
            return false;
        } else {
            char[] chars = new char[26];
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    difference++;
                }
                chars[s1.charAt(i)-'a']++;
                chars[s2.charAt(i)-'a']--;
            }
            for (int i = 0; i < 26; i++) {
                if(chars[i] >0) return false;
            }
        }
        return (difference == 2) || (difference == 0);
    }
}