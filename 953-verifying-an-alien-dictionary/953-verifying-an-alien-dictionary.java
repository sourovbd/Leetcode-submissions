class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> orderMap = new HashMap<>();
        int orderLen = order.length();
        int count = 0;
        boolean flag = false;
        for ( int i = 0; i < orderLen; i++) {
            orderMap.put(order.charAt(i), ++count);
        }
        //orderMap.forEach((k,v) -> System.out.println(k + " - "+v));
        int wordsLen = words.length;
        for (int i = 0; i < wordsLen-1; i++) {
            char[] word1 = words[i].toCharArray();
            char[] word2 = words[i+1].toCharArray();
            int word1Len = word1.length;
            int word2Len = word2.length;
            if (word1Len > word2Len) {
                int j;
                for (j = 0; j < word2Len; j++) {
                    if (orderMap.get(word1[j]) == orderMap.get(word2[j])){
                        continue;
                    } else if (orderMap.get(word1[j]) < orderMap.get(word2[j])){
                        flag = true;
                        break;
                    } else if ((orderMap.get(word1[j]) > orderMap.get(word2[j]))) {
                        return false;
                    }
                }
                if (j == word2Len) {
                    return false;
                }
            } else if (word1Len < word2Len) {
                int j;
                for (j = 0; j < word1Len; j++) {
                    if (orderMap.get(word1[j]) == orderMap.get(word2[j])){
                        continue;
                    } else if (orderMap.get(word1[j]) < orderMap.get(word2[j])){
                        flag = true;
                        break;
                    } else if ((orderMap.get(word1[j]) > orderMap.get(word2[j]))) {
                        return false;
                    }
                }
                if (j == word2Len) {
                    flag = true;
                    continue;
                }
            } else {
               int j;
                for (j = 0; j < word1Len; j++) {
                    if (orderMap.get(word1[j]) == orderMap.get(word2[j])){
                        continue;
                    } else if (orderMap.get(word1[j]) < orderMap.get(word2[j])){
                        flag = true;
                        break;
                    } else if ((orderMap.get(word1[j]) > orderMap.get(word2[j]))) {
                        return false;
                    }
                }
                if (j == word2Len) {
                    flag = true;
                    continue;
                }
            }
            continue;
        }
        return true;
    }
}