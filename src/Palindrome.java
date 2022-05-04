import org.apache.commons.lang3.StringUtils;
public class Palindrome {
        public static boolean isPalindrome (String palindrome) {
            return StringUtils.reverse(palindrome).equalsIgnoreCase(palindrome);
        }
}
