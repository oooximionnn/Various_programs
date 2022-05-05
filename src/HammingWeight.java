public class HammingWeight { //Реализуйте публичный статический метод
    // getHammingWeight(), который считает и возвращает вес Хэмминга.
    // Метод принимает в качестве аргумента целое число.
    public static int getHammingWeight(int number) {
        int weight = 0;
        String binaryString = Integer.toBinaryString(number);
        char[] arrayOfNumbers = binaryString.toCharArray();
        for (char k : arrayOfNumbers) {
            if (k == '1') {
                weight++;
            }
        }
        return weight;
    }
}
