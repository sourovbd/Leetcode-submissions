class Solution {
    public double average(int[] salary) {
        double average = 0;
        double sum = 0;
        int length = salary.length;
        for (int i = 0; i < length; i++) {
            sum = sum + salary[i];
        }
        int maxSalary = getMax(salary);
        int minSalary = getMin(salary);
        double sumOfSalary = sum - maxSalary - minSalary;
        average = (sumOfSalary / (length-2));
        return average;
    }
    
    public int getMax(int[] salary) {
        int max = salary[0];
        for (int i = 1; i < salary.length; i++) {
            if(salary[i] > max) {
                max = salary[i];
            }
        }
        return max;
    }

    public int getMin(int[] salary) {
        int min = salary[0];
        for (int i = 1; i < salary.length; i++) {
            if(salary[i] < min) {
                min = salary[i];
            }
        }
        return min;
    }

}