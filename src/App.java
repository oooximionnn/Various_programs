import java.util.Arrays;
class App {
    // BEGIN (write your solution here)
    public static int[] swap(int[] numbers) {
        if (numbers.length >=2) {
            int numeric = numbers[0];
            numbers[0] = numbers[numbers.length - 1];
            numbers[numbers.length - 1] = numeric;
            return numbers;
        }
        return numbers;
    }
    // END
}