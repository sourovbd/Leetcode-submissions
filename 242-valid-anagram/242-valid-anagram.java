class Solution {
    public boolean isAnagram(String s, String t) {
        if(s == null || t == null) return false;
        if(s.length() != t.length()) return false;
        char[] charsS = s.toCharArray();
        char[] charsT = t.toCharArray();
        Map<Character, Integer> mapOfCharS = new HashMap<>();
        Map<Character, Integer> mapOfCharT = new HashMap<>();

        for (char ch : charsS) {
            if (!mapOfCharS.containsKey(ch)) {
                mapOfCharS.put(ch, 0);
            }
            mapOfCharS.put(ch, mapOfCharS.get(ch)+1);
        }

        for (char ch : charsT) {
            if (!mapOfCharT.containsKey(ch)) {
                mapOfCharT.put(ch, 0);
            }
            mapOfCharT.put(ch, mapOfCharT.get(ch)+1);
        }
        return mapOfCharS.equals(mapOfCharT);
    }
}