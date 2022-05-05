public class Pascals_triangle {
    public static int[] generate(int number) {  //Реализуйте публичный статический метод generate(), который
        // возвращает указанную строку треугольника Паскаля в виде массива целых чисел.
        int[] simpleMassive = {};
        long resultk = 1;

        // факториал от н
        long resultn = 1;
        for (long i = 1; i <= number; i++) {
            resultn = resultn * i;
        }

        long[] arrrray;
        if (number == 0) {
            int[] arrayii = {1};
            return arrayii;
        } else if (number == 1) {
            int[] arrayyy = {1, 1};
            return arrayyy;
        } else if (number == 2) {
            int[] arraytt = {1, 2, 1};
            return arraytt;
        } else if (number == 3) {
            int[] arrayy = {1, 3, 3, 1};
            return arrayy;
        } else {
            arrrray = new long[number + 1];
            arrrray[0] = 1;
            arrrray[1] = number;
            arrrray[arrrray.length - 1] = 1;
            arrrray[arrrray.length - 2] = number;


            long halfArrrray = arrrray.length / 2;
            int from2Index = 2;
            if (arrrray.length % 2 == 0) {
                for (long k = 2; k <= halfArrrray; k++) {
                    // факториал от k
                    resultk = resultk * k;
                    long i = number - from2Index;
                    long difResult = 1;
                    for (long l = 1; l <= i; l++) {
                        difResult = difResult * l;
                    }
                    arrrray[from2Index] = resultn / (resultk * difResult);
                    // высстраивание обратной стороны массива
                    arrrray[arrrray.length - (from2Index + 1)] = arrrray[from2Index];
                    from2Index++;
                }
            } else {
                for (long k = 2; k <= halfArrrray; k++) {
                    // факториал от k
                    resultk = resultk * k;
                    long i = number - from2Index;
                    long difResult = 1;
                    for (long l = 1; l <= i; l++) {
                        difResult = difResult * l;
                    }
                    arrrray[from2Index] = resultn / (resultk * difResult);
                    arrrray[arrrray.length - from2Index - 1] = arrrray[from2Index];
                    from2Index++;
                }
            }
            int newArr[] = new int[arrrray.length];
            int b = 0;
            for (long q : arrrray) {
                newArr[b] = (int) q;
                b++;
            }

            return newArr;
        }
    }
}
