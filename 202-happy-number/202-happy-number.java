class Solution {
     public boolean isHappy(int n) {
        Set<Integer> numbers = new HashSet<>();
        if (n ==1) return true;
        while (n != 1) {
            char[] digit = String.valueOf(n).toCharArray();
            int sum = 0;
            for (int i = 0; i < digit.length; i++) {
                sum = (sum + ((digit[i] - 48) * (digit[i] - 48)));
            }

            if (!isEnteredInCycle(numbers, sum)) {
                return false;
            }
            n = sum;
        }
        return true;
    }
    public static boolean isEnteredInCycle(Set numbers, int num) {
        if (!numbers.contains(num)) {
            numbers.add(num);
        } else {
            return false;
        }
        return true;
    }
}