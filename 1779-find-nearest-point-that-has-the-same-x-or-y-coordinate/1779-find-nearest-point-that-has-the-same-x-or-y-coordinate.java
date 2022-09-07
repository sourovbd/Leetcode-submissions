class Solution {
    public static int nearestValidPoint(int x, int y, int[][] points) {
        boolean flag = false;
        int len = points.length;
        int index = 0;
        int minDistance = Integer.MAX_VALUE;
        for (int i=0; i<len; i++) {
            int[] point = points[i];

            if (isValid(x, y, point)) {
                flag = true;
                int distance = manhattanDistance(x, y, point);
                if (distance < minDistance) {
                    minDistance = distance;
                    index = i;
                }
            }
        }
        if(!flag){
                return -1;
            }
        return index;
    }

    public static boolean isValid(int x, int y, int[] point) {
       return (x == point[0] || y == point[1]);
    }

    public static int manhattanDistance(int x, int y, int[] point) {
        return (Math.abs(x - point[0]) + Math.abs(y-point[1]));
    }
}

// public int nearestValidPoint(int x, int y, int[][] points) {
//         int index = -1;
//         int maxDistance = Integer.MAX_VALUE;

//         for (int i = 0; i < points.length; i++) {
//             if (points[i][0] == x) {
//                 int manhattanDistance = Math.abs(points[i][1] - y);
//                 if (manhattanDistance < maxDistance) {
//                     maxDistance = manhattanDistance;
//                     index = i;
//                 }
//             } else if (points[i][1] == y){
//                 int manhattanDistance = Math.abs(points[i][0] - x);
//                 if (manhattanDistance < maxDistance) {
//                     maxDistance = manhattanDistance;
//                     index = i;
//                 }
//             }
//         }
//         return index;
//     }
// }