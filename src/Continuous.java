public class Continuous {
    public static boolean isContinuousSequence(int[] array) {
        boolean check = false;
        if (array.length < 2) {
            return check;
        }
        for (int counter = 0; counter <= array.length - 2; counter++) {
            if (array[counter + 1] - array[counter] != 1) {
                check = false;
                return check;
            } else {
                check = true;
            }
        }
        return check;
    }
}
