import java.util.Arrays;
public class Arr {
    public static String[] getWeekends(String format) { //вывод массива
        String[] longFormats = {"saturday", "sunday"};
        String[] shortFormats = {"sat", "sun"};

        switch (format) {
            case "long":
                return longFormats;
            case "short":
                return shortFormats;
            default:
                return longFormats;
        }
    }
}