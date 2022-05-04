import java.util.Arrays;

public class BubbleSort {
    public static int[] bubbleSort(int[] numbers) {

        int count1 = numbers.length;
        int count3 = numbers.length;
        int count2 = 0;
        for (int count = 0; count < count1; count++) {
            if (count >= 0) {
                if (numbers[count + 1] < numbers[count]) {
                    int changer = numbers[count];
                    numbers[count] = numbers[count + 1];
                    numbers[count + 1] = changer;
                }
                count2++;
                if (count2 == count3 - 1) {
                    count2 = 0;
                    count3 = count3 - 1;
                    count = -1;
                    count1 = count1 - 1;
                }
            } else {
                return numbers;
            }
        }
        return numbers; // НУжно вывести готовый интовый массив в консоли
    }
}
