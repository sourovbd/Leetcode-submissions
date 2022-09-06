class Solution {
    public double average(int[] salary) {
        int maxSalary = Arrays.stream(salary).max().getAsInt();
        int minSalary = Arrays.stream(salary).min().getAsInt();
        double sumOfSalary = Arrays.stream(salary).sum();
        return ((sumOfSalary - maxSalary - minSalary) / (salary.length - 2));
    }
}

// Arrays.sort(salary);
//         int len = salary.length;
//         salary[0] = 0;
//         salary[len-1] = 0;
//         double sum = Arrays.stream(salary).reduce(0, Integer::sum);;

//         return sum / (len - 2);
//     }