class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int len = mat.length;
        for (int i=0; i<len; i++) {
            sum = sum + mat[i][i];
        }
        for (int i=0, j=len-1; i<len; i++,j--) {
            sum = sum + mat[i][j];
        }
        if(len%2==1) {
            sum = sum - mat[len/2][len/2];
        }
        return sum;
    }
}