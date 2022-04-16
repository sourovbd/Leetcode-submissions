class Solution {
    public String addSpaces(String s, int[] spaces) {
        List<String> list = new ArrayList<>();
        int len = s.length();
        int j=0;
        for(int i=0; i<len; i++) {
            if(j<spaces.length && spaces[j] == i) {
                list.add(" ");
                j++;
            }
            list.add(String.valueOf(s.charAt(i)));
        }
        return list.stream().collect(Collectors.joining());
    }
}