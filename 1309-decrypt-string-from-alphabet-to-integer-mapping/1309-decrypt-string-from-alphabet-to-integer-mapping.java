class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        for (int i=len-1; i>=0; i--) {
            if (s.charAt(i) == '#') {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(s.charAt(i-2));
                sb2.append(s.charAt(i-1));
                int val = Integer.valueOf(sb2.toString());
                System.out.println("val: "+val);
                sb.append((char)(val+96));
                System.out.println((char)(val+96));
                i=i-2;

            } else {
                sb.append((char)(((int)s.charAt(i)-48)+96));
            }
        }
        return sb.reverse().toString();
    }
}