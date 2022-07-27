class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        boolean flag = true;
        int x1 = 0, y1 = 0, x2 = 0, y2 = 0, x3 = 0, y3 = 0;
        int len = coordinates.length;

        if (len == 1) {
            flag = true;
        }

        x1 = coordinates[0][0];
        y1 = coordinates[0][1];
        x2 = coordinates[1][0];
        y2 = coordinates[1][1];
        for (int i = 2; i < coordinates.length; i++) {
            x3 = coordinates[i][0];
            y3 = coordinates[i][1];
            if ((y2 - y1) * (x3 - x1) != (x2 - x1) * (y3 - y1)) {
                flag = false;
            }
        }
        return flag;
    }
}