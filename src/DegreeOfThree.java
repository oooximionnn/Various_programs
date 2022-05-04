import org.apache.commons.lang3.ArrayUtils;

public class DegreeOfThree {
    public static boolean isPowerOfThree(int number) {
        boolean isNaturalDegree = false;
        double[] arrayOfDegrees = new double[number];
        for (int counter = 0; counter < number; counter = counter + 1) {
            arrayOfDegrees[counter] = Math.pow(3, counter);
        }
        if (ArrayUtils.contains(arrayOfDegrees, number)) {
            isNaturalDegree = true;
        } else {
            isNaturalDegree = false;
        }

        return isNaturalDegree;
    }
}
