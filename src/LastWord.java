public class LastWord {
    public static int getLastWordLength(String str) {
        String redactingStr = str.trim(); // без пробелов по краям
        String[] arrayOfWords = redactingStr.split(" ");
        int number = arrayOfWords[arrayOfWords.length - 1].length();
        return number;
    }
}
