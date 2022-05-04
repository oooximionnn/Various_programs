public class Matrix {
    public static int[] flattenMatrix(int[][] matrixx) {
        int number = matrixx[0].length + matrixx[1].length;
        int[] matrixx1 = new int[number];
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        if (matrixx.length == 0) {
            return matrixx1;
        }
        if (matrixx.length > 0) {
            while (count1 < matrixx.length) {
                count2 = 0;
                while (count2 < matrixx[count1].length) {

                    matrixx1[count] = matrixx[count1][count2];
                    count2++;
                    count++;
                }
                count1++;
            }
        }
        return matrixx1;
    }
}
