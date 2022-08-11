class Solution {
    public char findTheDifference(String s, String t) {
        int lenOfS = s.length();
        int lenOfT = t.length();

        char ch = ' ';
        int count = 0;
        Map<Character, Integer> mapOfS = new HashMap();
        Map<Character, Integer> mapOfT = new HashMap();

        for (int i=97; i<=122; i++) {
            mapOfS.put((char)i, 0);
            mapOfT.put((char)i, 0);
        }
       
        for (int i = 0; i < lenOfT; i++) {
            mapOfT.put(t.charAt(i), mapOfT.get(t.charAt(i)) + 1);
        }

        for (int i = 0; i < lenOfS; i++) {
            mapOfS.put(s.charAt(i), mapOfS.get(s.charAt(i)) + 1);
        }
      
        for (Character key : mapOfS.keySet()) {
            if (mapOfS.get(key) < mapOfT.get(key)) {
                ch = key;
                break;
            }
        }
        return ch;
    }
}