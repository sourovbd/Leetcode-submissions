class Solution {
      public static boolean isHappy(int n) {
        Set<Integer> numbers = new HashSet<>();
        while (n != 1 && !numbers.contains(n)) {
            numbers.add(n);
            n = nextNumber(n);
        }
        return (n == 1);
    }

    public static int nextNumber(int num) {
        int sum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            num = num / 10;
            sum += getSquare(lastDigit);
        }
        return sum;
    }

    public static int getSquare(int digit) {
        return (digit * digit);
    }
}