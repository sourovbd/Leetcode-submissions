class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int index = -1;
        int maxDistance = Integer.MAX_VALUE;

        for (int i = 0; i < points.length; i++) {
            if (points[i][0] == x) {
                int manhattanDistance = Math.abs(points[i][1] - y);
                if (manhattanDistance < maxDistance) {
                    maxDistance = manhattanDistance;
                    index = i;
                }
            } else if (points[i][1] == y){
                int manhattanDistance = Math.abs(points[i][0] - x);
                if (manhattanDistance < maxDistance) {
                    maxDistance = manhattanDistance;
                    index = i;
                }
            }
        }
        return index;
    }
}