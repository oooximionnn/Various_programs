import org.apache.commons.lang3.ArrayUtils;

public class Make {
    public static String makeCensored(String text, String[] stopWords) {
        String[] text1 = text.split(" ");
        int count1 = 0;
        for (String count : text1) {
            if (ArrayUtils.contains(stopWords, count)) {
                text1[count1] = "$#%!";
            }
            count1++;
        }
        return String.join(" ", text1);
    }
}
