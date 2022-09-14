class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int len = arr.length;
        List<Integer> term = new ArrayList<>();
        for (int i=1; i<=len; i=i+2) {
            term.add(i);
        }
        int termLen = term.size();

        List<Integer[]> integers = new ArrayList<>();
        for (int j=0; j<termLen; j++) {
            for (int i=0; i<=len-term.get(j); i++) {
                Integer[] subarray = IntStream.range(i, i + term.get(j))
                        .mapToObj(k -> arr[k])
                        .toArray(Integer[]::new);
                integers.add(subarray);
            }
        }

        int sum=0;
        for (int i=0; i<integers.size(); i++) {
            Integer[] arr2 = integers.get(i);
            // for(int j=0; j<arr2.length; j++) {
            //     sum += arr2[j];
            // }
            sum += Arrays.stream(arr2).reduce(0, (a,b) -> (a+b));
        }
        return sum;
    }
}