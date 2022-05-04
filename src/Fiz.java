public class Fiz {
    public static void fizzBuzz(int begin, int end) {
        while (begin <= end) {
            if (begin % 3 == 0 && begin % 5 == 0) {
                System.out.println("FizzBuzz");
                begin += 1;
            } else if (begin % 3 == 0) {
                System.out.println("Fizz");
                begin += 1;
            } else if (begin % 5 == 0) {
                System.out.println("Buzz");
                begin += 1;
            } else {
                System.out.println(begin);
                begin += 1;
            }
        }
    }
}
