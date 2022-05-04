import org.apache.commons.lang3.StringUtils;
import java.util.Arrays;
public class Arra {
    public static int calculateSum(int[] numbers) {
        int sum = 0;
        if (numbers.length == 0) {
            return sum;
        }
        for (int counter = 0; counter < numbers.length; counter = counter + 1) {
            if ((numbers[counter]) % 3 == 0) {
                sum = numbers[counter] + sum;
            }
        }
        return sum;
    }
}
