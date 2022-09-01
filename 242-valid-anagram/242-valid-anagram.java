class Solution {
    public boolean isAnagram(String s, String t) {
        if(s == null || t == null) return false;
        if(s.length() != t.length()) return false;

        char[] charsS = s.toCharArray();
        Arrays.sort(charsS);
        char[] charsT = t.toCharArray();
        Arrays.sort(charsT);

        int len = charsS.length;
        for (int i=0; i<len; i++) {
            if (charsS[i] != charsT[i]) {
                return false;
            }
        }

        return true;
    }
}