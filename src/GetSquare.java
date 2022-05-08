import static java.lang.Math.PI;

public class GetSquare { //реализуйте публичный статический метод getSquare(),
    // который принимает в качестве аргументов две стороны треугольника и угол между ними в градусах,
    // а возвращает площадь этого треугольника в виде числа типа double. Площадь треугольника вычисляется,
    // как половина произведения этих сторон,
    // умноженная на синус угла между ними.
    public static double getSquare(int a, int b, int angle) {
        double getRadian = angle * PI / 180;
        double getSin = Math.sin(getRadian);
        double square = a * b / 2 * getSin;
        return square;
    }
}
