public class Counter {
    public static String encrypt(String str) {
        // BEGIN (write your solution here)
        String word = "";
        if (str.length() % 2 == 0) { // если четное
            for (int counter = 0; counter < str.length(); counter = counter + 2) {
                    word = word + str.replace((str.charAt(counter)), str.charAt(counter + 1));
                }
            } else { // если нечетное
            for (int counter = 0; counter < str.length(); counter = counter + 2) {
                word = word + str.replace((str.charAt(counter)), str.charAt(counter + 1));
            }
        }
        return "";
        // END
    }
}

