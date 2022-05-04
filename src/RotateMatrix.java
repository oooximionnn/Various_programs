import java.util.Arrays;

public class RotateMatrix {

    public static int[][] rotateLeft(int[][] matrixL) {
        int[][] newMatrix = new int[matrixL[0].length][matrixL.length];
        int n = 0;
        if (n < matrixL.length) {
            for (int j = matrixL[0].length - 1; j >= 0; j--) {
                for (int i = 0; i < matrixL.length; i++) {
                    newMatrix[n][i] = matrixL[i][j];
                }
                n++;
            }
        }
        return newMatrix;
    }
    public static int[][] rotateRight(int[][] matrixL) {
        if (matrixL[0].length == 2) {
            int[][] newMatrix1 = new int[matrixL[0].length][matrixL.length];
            int n = 0;
            for (int n1 = matrixL.length - 1; n1 >= 0; n1--) {
                for (int i = 0; i < matrixL.length; i++)  {
                    newMatrix1[n][i] = matrixL[n1][n];
                    n1--;
                    if (n1 < 0) {
                        n1 = matrixL.length - 1;
                    }
                }
                n++;
                if (n > matrixL.length - 1) {
                    return newMatrix1;
                }
            }
            return newMatrix1;
        } else if (matrixL[0].length == 1) {
            int[][] newMatrix1 = new int[matrixL[0].length][matrixL.length];
            int n = 0;
            for (int n1 = matrixL.length - 1; n1 >= 0; n1--) {
                for (int i = 0; i < matrixL.length; i++)  {
                    newMatrix1[n][i] = matrixL[n1][n];
                    n1--;
                    if (n1 < 0) {
                        n1 = matrixL.length - 1;
                    }
                }
                n++;
                if (n == matrixL.length - 1) {
                    return newMatrix1;
                }
            }
            return newMatrix1;
        }

        int[][] newMatrix1 = new int[matrixL[0].length][matrixL.length];
        int n = 0;
        for (int n1 = matrixL.length - 1; n1 >= 0; n1--) {
            int counter = 0;
            for (int i = 0; i < matrixL.length; i++)  {
                newMatrix1[n][i] = matrixL[n1][n];
                if (n1 < 0) {
                    n1 = matrixL.length - 1;
                }
            }
            n++;
            if (n > matrixL.length) {
                return newMatrix1;
            }
        }
        return newMatrix1;
    }
}

