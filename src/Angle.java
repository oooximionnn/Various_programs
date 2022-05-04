public class Angle {
    public static int diff(int a, int b) {
        int backSide = 0;
        int digit = 0;
        if (a + b > 180) { // если больше 360 градусов
            if (a == 0) {
                digit = 360 - b;
            } else if (b == 0) {
                digit = 360 - a;
            } else if (a > b) {
                digit = a - b;
            } else if (b > a) {
                digit = b - a;
            } else if (a == b) {
                digit = a - b;
            }
        } else { // если меньше 360 градусов
            if (a > b) {
                digit = a - b;
            } else {
                digit = b - a;
            }
        }
        if (360 - digit > digit) {
            backSide = digit;
        } else if (360 - digit <= digit) {
            backSide = 360 - digit;
        }
        return backSide;
    }
}
