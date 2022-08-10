class Solution {
    public String interpret(String command) {
        int len = command.length();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<len; i++) {
            if (command.charAt(i) == '(') {
                if (command.charAt(i+1)==')') {
                    sb.append("o");
                    i=i+1;
                } else if (command.charAt(i+1)=='a'){
                    sb.append("al");
                    i=i+3;
                }
            } else {
                sb.append(command.charAt(i));
            }
        }
        return sb.toString();
    }
}