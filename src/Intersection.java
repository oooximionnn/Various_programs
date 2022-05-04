import java.util.Arrays;

public class Intersection {
    public static int[] getIntersectionOfSortedArrays(int[] array1, int[] array2) {
        int count1 = 0;// счетчик индекса массива array2
        int count2 = 0;// счетчик совпадений двух массивов для создания размерности массива array3
        int count3 = 0;
        int[] array3 = new int[Math.min(array1.length, array2.length)];
        for (int count : array1) {
            count1 = 0;
            count3 = 0;
            while (count3 < array2.length) {
                if (count == array2[count1]) {
                    array3[count2] = count;
                    count2++;
                }
                count1++;
                count3++;
            }
        }

        int[] array4 = new int[count2];
        array4 = Arrays.copyOfRange(array3, 0, count2);
        return array4;
    }
}
