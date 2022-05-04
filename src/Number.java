import java.util.Scanner;

public class Number {
    public static String numbers() {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int n = sc.nextInt();

        do {
            System.out.println(text);
            n--;
        } while (n > 0);
            return "";
    }
}
