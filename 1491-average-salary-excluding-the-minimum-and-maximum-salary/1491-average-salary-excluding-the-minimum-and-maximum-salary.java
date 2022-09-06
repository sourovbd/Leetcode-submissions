class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int len = salary.length;
        salary[0] = 0;
        salary[len-1] = 0;
        double sum = Arrays.stream(salary).reduce(0, Integer::sum);;

        return sum / (len - 2);
    }
}