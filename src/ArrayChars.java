import java.util.Arrays;
import java.util.Locale;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
public class ArrayChars {
    public static int countUniqChars(String str) {
        if (str.length() == 0) {
            return 0;
        }
        String[] chars = new String[str.length()];
        chars = str.split("");
        String[] counter = new String[chars.length]; // не забыть "удалить" незаполненные клетки
        int count = 0;
        int count1 = 0;
        while (count1 < chars.length) {
            if (!ArrayUtils.contains(counter, chars[count1].toLowerCase())) {
                counter[count] = chars[count1].toLowerCase();
                count++;
            }
            count1++;
        }
        String[] newArray = new String[count + 1];
        newArray = Arrays.copyOfRange(counter, 0, count);
        System.out.println(count);
        return count;
    }
}
