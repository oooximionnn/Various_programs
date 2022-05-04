import java.util.Arrays;

public class Lol {
    public static int[] getSameParity(int[] numbers) {
        int[] newArray;
        int sum = 0;
        int newIndex = 0;
        int[] newNums = new int[numbers.length];
        if (numbers.length == 0) {
            return numbers;
        }
        if (numbers[0] % 2 == 0) { // если начинается с четного числа
            for (int counter = 0; counter < numbers.length; counter++) {
                if (numbers[counter] % 2 == 0) {
                    newNums[newIndex] = numbers[counter];
                    newIndex++;

                } else {
                    continue;
                }
                // create a new array to copy newNums with "sum" length
                newArray = Arrays.copyOfRange(newNums, 0, sum);
            }
            for (int count : newNums) {
                if (Math.abs(count) > 0) {
                    sum = sum + 1;
                }
            }

        } else {    // если начинается с нечетного числа
            if (numbers[0] % 2 != 0) {
                for (int counter = 0; counter < numbers.length; counter++) {
                    if (numbers[counter] % 2 != 0) {
                        newNums[newIndex] = numbers[counter];
                        newIndex++;

                    } else {
                        continue;
                    }
                    // create a new array to copy newNums with "sum" length
                    newArray = Arrays.copyOfRange(newNums, 0, sum);
                }
                for (int count : newNums) {
                    if (Math.abs(count) > 0) {
                        sum = sum + 1;
                    }
                }


            }
        }
        return newArray = Arrays.copyOfRange(newNums, 0, sum);
    }
}
// END

