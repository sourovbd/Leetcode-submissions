class Solution {
    public String firstPalindrome(String[] words) {
         boolean isPalindrome;
        for(int i=0; i<words.length; i++) {
            int len = words[i].length();
            String str = words[i];
            isPalindrome = true;
            for(int j=0,k=len-1; j<=(len/2); j++,k--) {
                if(str.charAt(j) != str.charAt(k)) {
                    isPalindrome = false;
                }
            }
            if(isPalindrome) {
                return str;
            }
        }
       return "";
    }
}