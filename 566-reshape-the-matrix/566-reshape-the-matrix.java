class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
         int oldRowLen = mat.length;
        int oldColLen = mat[0].length;
        if (r * c != oldRowLen * oldColLen)
            return mat;

        int newMatrix[][] = new int[r][c];
        int newRowLen = 0;
        int newColLen = 0;
        int newMatrixRowLen = newMatrix.length;
        int newMatrixColLen = newMatrix[0].length;
        
        for (int i = 0; i < newMatrixRowLen; i++) {
            for (int j = 0; j < newMatrixColLen; j++) {
                newMatrix[i][j] = mat[newRowLen][newColLen];
                newColLen++;
                if (newColLen == oldColLen) {
                    newRowLen++;
                    newColLen = 0;
                }
            }
        }
        return newMatrix;
    }
}