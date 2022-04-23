class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        Map<Integer, Integer> validPointsMap = new HashMap<>();
        int len = points.length;
        int noOfValidArray = 0;
        int manhattanDistance = 0;
        int[][] validArray = new int[len][2];
        
        for (int i = 0; i < len; i++) {
            int[] arr = points[i];
            if (x == arr[0] || y == arr[1]) {
                validArray[i][0] = arr[0];
                validArray[i][1] = arr[1];
                manhattanDistance = Math.abs(x - validArray[i][0]) + Math.abs(y - validArray[i][1]);
                validPointsMap.put(i, manhattanDistance);
                noOfValidArray++;
            }
        }
        if(noOfValidArray==0) return -1;
        return validPointsMap.entrySet().stream().min(Comparator.comparingInt(Map.Entry::getValue)).get().getKey();

    }
}