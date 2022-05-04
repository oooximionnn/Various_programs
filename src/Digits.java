public class Digits {
    public static int addDigits(int digit) {
        int chta = 0;
        int sum = 0;
        int output = 0;
        if(digit < 0) {
            System.out.println("Введите положительное число. \nВы ввели: ");
            chta = digit;
        } else if (0 <= digit && digit <= 9) {
            chta = digit;
        } else if (digit > 9) {
            output = digit;

            do {
                char[] chars = ("" + output).toCharArray();
                output = 0;
                sum = 0;
                for (int counter = 0; counter < chars.length; counter = counter + 1 ) {
                    output = chars[counter] - '0';
                    sum = sum + output;
                    chta = sum;
                }
                output = chta;
            } while (chta > 9);
        }
        return chta;
    }
}
