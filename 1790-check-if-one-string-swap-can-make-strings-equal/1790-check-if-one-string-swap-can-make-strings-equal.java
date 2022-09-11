class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equalsIgnoreCase(s2)) {
            return true;
        }
        int len = s1.length();
        int count = 0;
        List<Integer> ints = new LinkedList<>();
        List<Character> chars = new LinkedList<>();
        Map<Integer, Character> map = new HashMap<>();
        boolean flag;
        for (int i = 0; i < len; i++) {
            flag = false;
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
                flag = true;
            }
            if (count <= 2 && flag) {
                ints.add(i);
                chars.add(s2.charAt(i));
            }
            if (count == 2) {
                map.put(ints.get(0), chars.get(1));
                map.put(ints.get(1), chars.get(0));
            }
            if (count > 2)
                return false;
        }
        //TODO: Need to check swap functionality.
        char[] chars2 = s2.toCharArray();
        int len2 = s2.length();
        Set<Integer> set = map.keySet();
        for (int i=0; i<len2; i++) {
            if (set.contains(i)) {
                chars2[i] = map.get(i);
            }
        }
        if (String.valueOf(chars2).equals(s1)) {
            return true;
        }
        return false;
    }


        
       // int difference = 0;
       //  if (s1.equals(s2)) {
       //      return true;
       //  } else if (s1.length() != s2.length()) {
       //      return false;
       //  } else {
       //      char[] chars = new char[26];
       //      for (int i = 0; i < s1.length(); i++) {
       //          if (s1.charAt(i) != s2.charAt(i)) {
       //              difference++;
       //          }
       //          chars[s1.charAt(i)-'a']++;
       //          chars[s2.charAt(i)-'a']--;
       //      }
       //      for (int i = 0; i < 26; i++) {
       //          if(chars[i] >0) return false;
       //      }
       //  }
       //  return (difference == 2) || (difference == 0);
    
}